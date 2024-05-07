/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package CRUD;

import Application.Academie_militaire;
import Gestion_deStock.Materielle;
import Plan_detude.STAGE;
import Profile.staticData;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author boubs
 */
public class CRUDMController implements Initializable {
        @FXML
    private Button ADD;

    @FXML
    private Button DELETE;

    @FXML
    private TextField INP1;

    @FXML
    private TextField INP2;

    @FXML
    private TextField INP3;

    @FXML
    private TextField INP4;

    @FXML
    private TextField INP5;

    @FXML
    private TableColumn<Materielle, Integer> Nece;

    @FXML
    private TableView<Materielle> Table;

    @FXML
    private Button UPDATE;

    @FXML
    private TableColumn<Materielle, Integer> desp;

    @FXML
    private AnchorPane etd1;

    @FXML
    private TableColumn<Materielle, Integer> id_STAGE;

    @FXML
    private TableColumn<Materielle, String> nom;

    @FXML
    private TableColumn<Materielle, String> type;
   
    ObservableList<Materielle> LISTE_Materielle =FXCollections.observableArrayList();
    private Academie_militaire am =staticData.getAM(); 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LISTE_Materielle.addAll(am.getMaterielles());
        id_STAGE.setCellValueFactory(new PropertyValueFactory<>("id"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        desp.setCellValueFactory(new PropertyValueFactory<>("nbrepiece_desp"));
        Nece.setCellValueFactory(new PropertyValueFactory<>("nbrepiece_Nece"));
        Table.setItems(LISTE_Materielle);
    } 
    public void supprimerEtudiant() {
        Materielle selectedIndex1 = Table.getSelectionModel().getSelectedItem();
        int selectedIndex = Table.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Table.getItems().remove(selectedIndex1);
            int id=selectedIndex1.getId();
             ArrayList<Materielle>a=am.getMaterielles();
             for(Materielle S:a){
                if(S.getId()==id){
                a.remove(S);
                break;
                }
             }
             am.setMaterielles(a);
            
            
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur de suppression");
            alert.setContentText("Veuillez sélectionner un élément à supprimer.");
            alert.show();
        }
    }
    public void UpdateEtudiant(ActionEvent event)
            
            
    {
     ArrayList<Materielle> a = am.getMaterielles(); 
     
     int selectedIndex = Table.getSelectionModel().getSelectedIndex();
     System.out.print(selectedIndex);
     if(selectedIndex >= 0 )
     {
     int ID = Table.getSelectionModel().getSelectedItem().getId();
     INP1.setText(String.valueOf(ID));
     System.out.print(selectedIndex);
     
     String c2=INP2.getText();
        String c3 =INP3.getText();
        String  c41 =(INP4.getText()) ;
        String  c51 =(INP5.getText()) ;
         
       int c4 =Integer.parseInt(INP4.getText()) ;
        int c5 =Integer.parseInt(INP5.getText()) ;
        
       
       String err ="" ;
        
       if ((c2==null) || (c2.isEmpty()) )
       {
         err+="Vous êtes obligé de saisir un Nom svp \n" ;
         
       }
       if ((c3==null) || (c3.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir un Type svp \n" ; 
       }
       if ((c41==null) || (c41.isEmpty())   )
       {
        err+="Vous êtes obligé de saisir le nbrepiece_desp svp \n" ; 
       }
       if ((c51==null) || (c51.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir le nbrepiece_Nece svp \n" ; 
       
       }
       
      if (err.length() > 0) 
       {
           
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Data");
            alert.setContentText(err);
            alert.show();  
           
       }
      
      else 
      {   
          
          Table.getItems().remove(selectedIndex) ;
          am.getStages().remove(ID) ;
          Materielle s = new Materielle(ID,c2,c3,c4,c5) ;
      am.ajouteMaterielle(s);
      LISTE_Materielle.add(s);
      
      
      
      }
       
     
     
     }
    else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur de Update");
            alert.setContentText("Veuillez sélectionner un élément à Update.");
            alert.show();
        }
    
    }
    
     public void AjouterEtudiant(ActionEvent event)
     {
     
        ArrayList<Materielle> a = am.getMaterielles(); 

      try 
      {
        int ID = Integer.parseInt(INP1.getText());
        boolean test = false;
        for (Materielle s : a)
        {
         if (s.getId() == ID) 
         {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ID existe");
            alert.setContentText("Vous êtes obligé de saisir un nouveau ID svp");
            alert.show();
            test = true;
            break;
         }
        }
       if (test == false)
       {
            String c2=INP2.getText();
         String c3 =INP3.getText();
         String  c41 =(INP4.getText()) ;
         String  c51 =(INP5.getText()) ;
         
        int c4 =Integer.parseInt(INP4.getText()) ;
        int c5 =Integer.parseInt(INP5.getText()) ;
        
       
        
       
       String err ="" ;
        
       if ((c2==null) || (c2.isEmpty()) )
       {
         err+="Vous êtes obligé de saisir un Nom svp \n" ;
         
       }
       if ((c3==null) || (c3.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir un Type svp \n" ; 
       }
       if ((c41==null) || (c41.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir le nbrepiece_desp svp \n" ; 
       }
       if ((c41==null) || (c41.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir le nbrepiece_Nece svp \n" ; 
       
       }
       
      if (err.length() > 0) 
       {
           
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Data");
            alert.setContentText(err);
            alert.show();  
           
       }
      
      else 
      {
      Materielle s = new Materielle(ID,c2,c3,c4,c5) ;
      am.ajouteMaterielle(s);
      LISTE_Materielle.add(s);
      
      
      
      }
       }
    }    
    catch (NumberFormatException e)
    {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Casting error");
    alert.setContentText("Vous êtes obligé de saisir un entier svp");
    alert.show();
    }

             
             
             
     }     
             
        public void logout(ActionEvent e) throws IOException {
    // Create a new FXMLLoader and load the Login.fxml file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Profile/employe.fxml"));
    AnchorPane root = loader.load();

    // Create a new Scene with the loaded root
    Scene scene = new Scene(root);

    // Create a new Stage and set the scene
    Stage stage = new Stage();
    stage.setScene(scene);

    // Show the new stage
    stage.show();

    // Get the reference to the old stage and close it
    Stage oldStage = (Stage) etd1.getScene().getWindow();
    oldStage.close();
}
 
        
}
