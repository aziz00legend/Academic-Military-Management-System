/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package CRUD;

import Application.Academie_militaire;
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
public class CRUDController implements Initializable {
     @FXML
    private Button ADD;

    @FXML
    private DatePicker DD;

    @FXML
    private Button DELETE;

    @FXML
    private DatePicker DF;

    @FXML
    private TextField INP1;

    @FXML
    private TextField INP2;

    @FXML
    private TextField INP3;

    @FXML
    private TextField INP4;
    
    @FXML
    private TableColumn<STAGE,Date> dated;

    @FXML
    private TableColumn<STAGE, Date> datef;

    @FXML
    private TableColumn<STAGE,Integer> id_STAGE;

    @FXML
    private TableColumn<STAGE,String> lieu;

    @FXML
    private TableColumn<STAGE,String> nom;

    @FXML
    private TableColumn<STAGE,String> type;


    @FXML
    private TableView<STAGE> Table;

    @FXML
    private Button UPDATE;
    
    @FXML
    private Label label;
    
    @FXML
    private AnchorPane etd1;
    ObservableList<STAGE> LISTE_STAGE =FXCollections.observableArrayList();
    private Academie_militaire am =staticData.getAM(); 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LISTE_STAGE.addAll(am.getStages());
        id_STAGE.setCellValueFactory(new PropertyValueFactory<>("id_stage"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        lieu.setCellValueFactory(new PropertyValueFactory<>("lieu"));
        dated.setCellValueFactory(new PropertyValueFactory<>("date_deb"));
        datef.setCellValueFactory(new PropertyValueFactory<>("date_fin"));
        Table.setItems(LISTE_STAGE);
    } 
    public void supprimerEtudiant() {
        STAGE selectedIndex1 = Table.getSelectionModel().getSelectedItem();
        int selectedIndex = Table.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Table.getItems().remove(selectedIndex1);
            int id=selectedIndex1.getId_stage();
             ArrayList<STAGE>a=am.getStages();
             for(STAGE S:a){
                if(S.getId_stage()==id){
                a.remove(S);
                break;
                }
             }
             am.setStages(a);
            
            
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur de suppression");
            alert.setContentText("Veuillez sélectionner un élément à supprimer.");
            alert.show();
        }
    }
    public void UpdateEtudiant(ActionEvent event)
            
            
    {
     ArrayList<STAGE> a = am.getStages(); 
     
     int selectedIndex = Table.getSelectionModel().getSelectedIndex();
     
     if(selectedIndex >= 0 )
     {
     int ID = Table.getSelectionModel().getSelectedItem().getId_stage() ;
     INP1.setText(String.valueOf(ID));
     
     
     String c2=INP2.getText();
        String c3 =INP3.getText();
        String c4 =INP4.getText();
        
        LocalDate localDate = DD.getValue();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date D = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        LocalDate localDate1 = DF.getValue();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date D1 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
       
       
       String err ="" ;
        
       if ((c2==null) || (c2.isEmpty()) )
       {
         err+="Vous êtes obligé de saisir un Nom svp \n" ;
         
       }
       if ((c3==null) || (c3.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir un Type svp \n" ; 
       }
       if ((c4==null) || (c4.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir un Lieu svp \n" ; 
       }
       if (localDate==null)
       {
        err+="Vous êtes obligé de saisir un Date debut svp \n" ; 
       
       }
       if (localDate1==null)
       {
        err+="Vous êtes obligé de saisir un Date fin svp \n" ; 
       
       }
       if (D.after(D1))
       {
        err+="Vous êtes obligé de saisir le date de debut  doit etre avant le date de fin    svp \n" ;
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
      STAGE s = new STAGE(ID,c2,c3,c4,D,D1) ;
      am.ajouteStage(s);
      LISTE_STAGE.add(s);
      
      
      
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
     
        ArrayList<STAGE> a = am.getStages(); 

      try 
      {
        int ID = Integer.parseInt(INP1.getText());
        boolean test = false;
        for (STAGE s : a)
        {
         if (s.getId_stage() == ID) 
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
       {String c2=INP2.getText();
        String c3 =INP3.getText();
        String c4 =INP4.getText();
        
        LocalDate localDate = DD.getValue();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date D = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        LocalDate localDate1 = DF.getValue();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date D1 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
       
       String err ="" ;
        
       if ((c2==null) || (c2.isEmpty()) )
       {
         err+="Vous êtes obligé de saisir un Nom svp \n" ;
         
       }
       if ((c3==null) || (c3.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir un Type svp \n" ; 
       }
       if ((c4==null) || (c4.isEmpty()) )
       {
        err+="Vous êtes obligé de saisir un Lieu svp \n" ; 
       }
       if (localDate==null)
       {
        err+="Vous êtes obligé de saisir un Date debut svp \n" ; 
       
       }
       if (localDate1==null)
       {
        err+="Vous êtes obligé de saisir un Date fin svp \n" ; 
       
       }
       if (D.after(D1))
       {
        err+="Vous êtes obligé de saisir le date de debut  doit etre avant le date de fin    svp \n" ;
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
      STAGE s = new STAGE(ID,c2,c3,c4,D,D1) ;
      am.ajouteStage(s);
      LISTE_STAGE.add(s);
      
      
      
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
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Profile/encadreur.fxml"));
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
