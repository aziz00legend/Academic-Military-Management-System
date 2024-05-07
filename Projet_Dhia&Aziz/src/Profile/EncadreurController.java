/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Profile;

import Application.Academie_militaire;
import GESTION_DES_RESOURCES.Employe_encad_stg;
import GESTION_DES_RESOURCES.Prof;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author boubs
 */
public class EncadreurController implements Initializable {
 @FXML
    private Label a0;

    @FXML
    private TextField a1;

    @FXML
    private TextField a2;

    @FXML
    private TextField a3;

    @FXML
    private TextField a4;

    @FXML
    private TextField a5;

    @FXML
    private TextField a6;

    @FXML
    private Button ajouterp;

    @FXML
    private AnchorPane etd1;

    @FXML
    private Button logout;
    

 
    private Employe_encad_stg encadreur;
    private Academie_militaire AM ;
    
    
    
    
    
    
     public void setencadreur_(Employe_encad_stg p){
         this.encadreur=p;
         
         
         
    

    a0.setText(p.getNom() + " " + p.getPrenom());
    a1.setText(String.valueOf(p.getIdpers()));
    a2.setText(p.getDateNaiss());
    a3.setText(String.valueOf(p.getNumtel()));
    a4.setText(p.getGrades());
    a5.setText((p.getSexe()));
    a6.setText(String.valueOf(p.getCin()));
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
    public void Ajouterstage(ActionEvent e) throws IOException {
    // Create a new FXMLLoader and load the Login.fxml file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/CRUD/CRUD.fxml"));
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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
