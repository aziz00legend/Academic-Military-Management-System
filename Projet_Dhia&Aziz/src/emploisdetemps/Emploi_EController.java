/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package emploisdetemps;

import Application.Academie_militaire;
import GESTION_DES_RESOURCES.Etudiant;
import Plan_detude.Emploi;
import Profile.staticData;
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
public class Emploi_EController implements Initializable {
@FXML
    private Button back;

    @FXML
    private Button c0;

    @FXML
    private Label c1;

    @FXML
    private Label c10;

    @FXML
    private Label c11;

    @FXML
    private Label c12;

    @FXML
    private Label c13;

    @FXML
    private Label c14;

    @FXML
    private Label c15;

    @FXML
    private Label c16;

    @FXML
    private Label c17;

    @FXML
    private Label c18;

    @FXML
    private Label c19;

    @FXML
    private Label c2;

    @FXML
    private Label c20;

    @FXML
    private Label c21;

    @FXML
    private Label c22;

    @FXML
    private Label c23;

    @FXML
    private Label c24;

    @FXML
    private Label c25;

    @FXML
    private Label c3;

    @FXML
    private Label c4;

    @FXML
    private Label c5;

    @FXML
    private Label c6;

    @FXML
    private Label c7;

    @FXML
    private Label c8;

    @FXML
    private Label c9;
    @FXML
    private AnchorPane etd1;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Etudiant etd =staticData.getEtudiant();// TODO
        Academie_militaire AM = staticData.getAM();
        Emploi e = AM.rechercherEmp(etd.getIdpers()) ;
        System.out.print(etd);
       c1.setText(e.schedule[0][0]);
c2.setText(e.schedule[0][1]);
c3.setText(e.schedule[0][2]);
c4.setText(e.schedule[0][3]);
c5.setText(e.schedule[0][4]);

c6.setText(e.schedule[1][0]);
c7.setText(e.schedule[1][1]);
c8.setText(e.schedule[1][2]);
c9.setText(e.schedule[1][3]);
c10.setText(e.schedule[1][4]);

c11.setText(e.schedule[2][0]);
c12.setText(e.schedule[2][1]);
c13.setText(e.schedule[2][2]);
c14.setText(e.schedule[2][3]);
c15.setText(e.schedule[2][4]);

c16.setText(e.schedule[3][0]);
c17.setText(e.schedule[3][1]);
c18.setText(e.schedule[3][2]);
c19.setText(e.schedule[3][3]);
c20.setText(e.schedule[3][4]);

c21.setText(e.schedule[4][0]);
c22.setText(e.schedule[4][1]);
c23.setText(e.schedule[4][2]);
c24.setText(e.schedule[4][3]);
c25.setText(e.schedule[4][4]);
    }    
    
    
     public void logout(ActionEvent e) throws IOException {
    // Create a new FXMLLoader and load the Login.fxml file
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Profile/EtudiantP.fxml"));
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
