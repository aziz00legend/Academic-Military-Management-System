/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package emploisdetemps;

import Application.Academie_militaire;
import Plan_detude.Emploi;
import Plan_detude.Groupe1;
import Profile.staticData;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author boubs
 */
public class EmploisdetempsController implements Initializable {
       @FXML
    private Button submit;
       
       @FXML
    private Button back;
     @FXML
    private AnchorPane etd1;
    @FXML
    private Label label;
    @FXML
    private ComboBox<String> c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25;
    
    String[] roleprepa = {"Mathematics", "Physics", "Chemistry", "Computer Science", };
    String[] rolesante = {"biomédicales", "Hygiène", "Pratiques de soins ", "Qualité et sécurité des soins","chirurgie" };
    
    @FXML
    private void submut(ActionEvent event) {
        Academie_militaire AM =staticData.getAM();
       Groupe1 groupe =AM.getGroupes().get(staticData.getIndexG());
      // groupe.emp().ajouter_Matier(0, 0, c1.getSelectionModel().getSelectedItem());
       groupe.emp().schedule[0][0] = c1.getSelectionModel().getSelectedItem();
       System.out.print(groupe.emp().schedule[0][0]);
       groupe.emp().schedule[0][1] = c2.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[0][2] = c3.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[0][3] = c4.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[0][4] = c5.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[1][0] = c6.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[1][1] = c7.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[1][2] = c8.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[1][3] = c9.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[1][4] = c10.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[2][0] = c11.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[2][1] = c12.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[2][2] = c13.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[2][3] = c14.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[2][4] = c15.getSelectionModel().getSelectedItem();
      groupe.emp().schedule[3][0] = c16.getSelectionModel().getSelectedItem();
      groupe.emp().schedule[3][1] = c17.getSelectionModel().getSelectedItem();
     groupe.emp().schedule[3][2] = c18.getSelectionModel().getSelectedItem();
     groupe.emp().schedule[3][3] = c19.getSelectionModel().getSelectedItem();
      groupe.emp().schedule[3][4] = c20.getSelectionModel().getSelectedItem();
        groupe.emp().schedule[4][0] = c21.getSelectionModel().getSelectedItem();
      groupe.emp().schedule[4][1] = c22.getSelectionModel().getSelectedItem();
       groupe.emp().schedule[4][2] = c23.getSelectionModel().getSelectedItem();
      groupe.emp().schedule[4][3] = c24.getSelectionModel().getSelectedItem();
      groupe.emp().schedule[4][4] = c25.getSelectionModel().getSelectedItem();
      System.out.print(groupe.emp().tostring());
       
       
       
       
       
       
       
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    System.out.println("Controller Initialized");
    String Groupename =staticData.getNomGroupe();
    if (Groupename.startsWith("Prepa"))
    {
       String[] role=roleprepa;
       c1.getItems().addAll(role);
        c2.getItems().addAll(role);
        c3.getItems().addAll(role);
        c4.getItems().addAll(role);
        c5.getItems().addAll(role);
        c6.getItems().addAll(role);
        c7.getItems().addAll(role);
        c8.getItems().addAll(role);
        c9.getItems().addAll(role);
        c10.getItems().addAll(role);
        c11.getItems().addAll(role);
        c12.getItems().addAll(role);
        c13.getItems().addAll(role);
        c14.getItems().addAll(role);
        c15.getItems().addAll(role);
        c16.getItems().addAll(role);
        c17.getItems().addAll(role);
        c18.getItems().addAll(role);
        c19.getItems().addAll(role);
        c20.getItems().addAll(role);
        c21.getItems().addAll(role);
        c22.getItems().addAll(role);
        c23.getItems().addAll(role);
        c24.getItems().addAll(role);
        c25.getItems().addAll(role);
    }
    else
    {
     String[] role=rolesante;
       c1.getItems().addAll(role);
        c2.getItems().addAll(role);
        c3.getItems().addAll(role);
        c4.getItems().addAll(role);
        c5.getItems().addAll(role);
        c6.getItems().addAll(role);
        c7.getItems().addAll(role);
        c8.getItems().addAll(role);
        c9.getItems().addAll(role);
        c10.getItems().addAll(role);
        c11.getItems().addAll(role);
        c12.getItems().addAll(role);
        c13.getItems().addAll(role);
        c14.getItems().addAll(role);
        c15.getItems().addAll(role);
        c16.getItems().addAll(role);
        c17.getItems().addAll(role);
        c18.getItems().addAll(role);
        c19.getItems().addAll(role);
        c20.getItems().addAll(role);
        c21.getItems().addAll(role);
        c22.getItems().addAll(role);
        c23.getItems().addAll(role);
        c24.getItems().addAll(role);
        c25.getItems().addAll(role);
    
    
    
    
    }
    Academie_militaire AM =staticData.getAM();
    Groupe1 groupe =AM.getGroupes().get(staticData.getIndexG());
    System.out.print(groupe);
    //if (groupe.emp() != null) {
   // groupe.emp(new Emploi()) ;}
    
    c1.setValue(groupe.emp().schedule[0][0]);
    c2.setValue(groupe.emp().schedule[0][1]);
    c3.setValue(groupe.emp().schedule[0][2]);
    c4.setValue(groupe.emp().schedule[0][3]);
    c5.setValue(groupe.emp().schedule[0][4]);
    c6.setValue(groupe.emp().schedule[1][0]);
    c7.setValue(groupe.emp().schedule[1][1]);
    c8.setValue(groupe.emp().schedule[1][2]);
    c9.setValue(groupe.emp().schedule[1][3]);
    c10.setValue(groupe.emp().schedule[1][4]);
    c11.setValue(groupe.emp().schedule[2][0]);
    c12.setValue(groupe.emp().schedule[2][1]);
    c13.setValue(groupe.emp().schedule[2][2]);
    c14.setValue(groupe.emp().schedule[2][3]);
    c15.setValue(groupe.emp().schedule[2][4]);
    c16.setValue(groupe.emp().schedule[3][0]);
    c17.setValue(groupe.emp().schedule[3][1]);
    c18.setValue(groupe.emp().schedule[3][2]);
    c19.setValue(groupe.emp().schedule[3][3]);
    c20.setValue(groupe.emp().schedule[3][4]);
    c21.setValue(groupe.emp().schedule[4][0]);
    c22.setValue(groupe.emp().schedule[4][1]);
    c23.setValue(groupe.emp().schedule[4][2]);
    c24.setValue(groupe.emp().schedule[4][3]);
    c25.setValue(groupe.emp().schedule[4][4]);
    


            
    
    
      
}   
     public void logout(ActionEvent e) throws IOException {
    // Create a new FXMLLoader and load the Login.fxml file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/CRUD/Groupeadmin.fxml"));
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
