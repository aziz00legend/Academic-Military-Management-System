/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Profile;

import Application.Academie_militaire;
import GESTION_DES_RESOURCES.Etudiant;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
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
public class EtudiantPController implements Initializable {
    
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
    private Button affe;

    @FXML
    private Button affp;

    @FXML
    private Button affs;

    @FXML
    private AnchorPane etd1;

    @FXML
    private Button logout;
    private Etudiant etdp;
    private Etudiant etd;
    private Academie_militaire AM ;
  

    /**
     * Initializes the controller class.
     * 
     */
    public void setEtudiant(Etudiant p) {
    this.etd = p;
    

    a0.setText(p.getNom() + " " + p.getPrenom());
    a1.setText(String.valueOf(p.getIdpers()));
    a2.setText(p.getDateNaiss());
    a3.setText(String.valueOf(p.getNumtel()));
    a4.setText(String.valueOf(p.getMoyenne()));
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
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       /* String a = this.etdp.getNom() + " " + this.etdp.getPrenom();
        this.a0.setText(a);*/
       etd=staticData.getEtudiant() ;
       System.out.println("Key " + this.etd + "*****");
       AM = staticData.getAM();
       System.out.println(AM.getGroupes());
        
    
    } 
    
     public void emploi(ActionEvent e) throws IOException {
         
    // Create a new FXMLLoader and load the Login.fxml file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/emploisdetemps/Emploi_E.fxml"));
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
