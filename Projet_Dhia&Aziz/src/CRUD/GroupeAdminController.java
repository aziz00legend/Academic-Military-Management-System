/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CRUD;

import Application.Academie_militaire;
import GESTION_DES_RESOURCES.Etudiant;
import Plan_detude.Groupe1;
import Plan_detude.STAGE;
import Profile.staticData;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author boubs
 */
public class GroupeAdminController implements Initializable {

    @FXML
    private AnchorPane etd1;
    @FXML
    private TableView<Groupe1> Table;
    @FXML
    private TableColumn<Groupe1, String> nom;
    @FXML
    private TableColumn<Groupe1, Integer> number;
    @FXML
    private TableColumn<Groupe1,Integer> delegue;
    @FXML
    private TextField INP1;
    @FXML
    private TextField INP2;
    @FXML
    private Button fill;
    @FXML
    private TextField INP3;
    @FXML
    private Button UPDATE1;
    ObservableList<Groupe1> LISTE_Groupe =FXCollections.observableArrayList();
    private Academie_militaire am =staticData.getAM(); 
    public void fill(ActionEvent event){
        int prepa =Integer.parseInt(INP1.getText()); 
        int Sante = Integer.parseInt(INP2.getText()); 
        HashMap<Integer, Etudiant> students1 = am.getEtudiants();
        ArrayList<Etudiant> students = new ArrayList<>(students1.values());
        Collections.sort(students, (s1, s2) -> Double.compare(s1.getMoyenne(), s2.getMoyenne()));
        int  n= Sante+prepa  ;
        // Calculate the number of students in each sublist
        int sublistSize = students.size() / n;
        int remainder = students.size() % n;

        // Initialize the list of sublists
        List<List<Etudiant>> sublists = new ArrayList<>();

        // Divide the students into sublists
        int start = 0;
        for (int i = 0; i < n; i++) {
            int sublistEnd = start + sublistSize + (i < remainder ? 1 : 0);
            sublists.add(new ArrayList<>(students.subList(start, sublistEnd)));
            start = sublistEnd;
        }
        int j=10 ;
        for(int i=0; i<Sante;i++)
        {
        String nom ="Sante"+(i+1) ;
        ArrayList<Integer> a =new ArrayList() ;
        for(Etudiant e : sublists.get(i)) 
        {
        a.add(e.getIdpers());
        }
        Groupe1 g = new Groupe1(nom,a,j);
        j+=1 ;
        am.getGroupes().add(g);
        }
        j=30;
        for(int i=Sante; i<n;i++)
        {
        String nom ="Prepa"+(i+1) ;
        ArrayList<Integer> a =new ArrayList() ;
        for(Etudiant e : sublists.get(i)) 
        {
        a.add(e.getIdpers());
        }
        Groupe1 g = new Groupe1(nom,a,j);
        j+=1;
        am.getGroupes().add(g);
        }
        
        for (Groupe1 g : am.getGroupes()) {
    System.out.println("Nom: " + g.nom());
}

        LISTE_Groupe.addAll(am.getGroupes()) ;
        
        
        nom.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nom()));
        delegue.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().id()).asObject());

        number.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().etudients().size()).asObject());
        Table.setItems(LISTE_Groupe) ;        
                        
    
    
    }
    public void update(ActionEvent event){
    
    
    }
       
@Override
    public void initialize(URL url, ResourceBundle rb) {
        LISTE_Groupe.addAll(am.getGroupes()) ;
        
        
        nom.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nom()));

        number.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().etudients().size()).asObject());
        Table.setItems(LISTE_Groupe) ;        
                        
    } 
    public void logout(ActionEvent e) throws IOException {
    // Create a new FXMLLoader and load the Login.fxml file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/projet_dhia/aziz/Login.fxml"));
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
     
    
    
    
    
    
    public void UpdateEmploi(ActionEvent event) throws IOException
        {
        
        int selectedIndex = Table.getSelectionModel().getSelectedIndex();
     System.out.print(selectedIndex);
     if(selectedIndex >= 0 )
     {
     String nomC = Table.getSelectionModel().getSelectedItem().nom();
     staticData.setNomGroupe(nomC);
     ArrayList<Groupe1>GRS=staticData.getAM().getGroupes();
     int i=0;
     for(Groupe1 g: GRS){
         
         if (g.nom().equals(nomC)) {
         
         break;
         }
         i+=1;
         
         
     
     
     }
     staticData.setIndexG(i);
     FXMLLoader loader = new FXMLLoader(getClass().getResource("/emploisdetemps/Emploisdetemps.fxml"));
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
      else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur");
            alert.setContentText("Veuillez sélectionner un groupe .");
            alert.show();
        }
        
        
        
        }

    
}
