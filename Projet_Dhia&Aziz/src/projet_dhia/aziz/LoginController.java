/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package projet_dhia.aziz;

import Application.Academie_militaire;
import CRUD.GroupeAdminController;
import GESTION_DES_RESOURCES.Employe_encad_stg;
import GESTION_DES_RESOURCES.Etudiant;
import GESTION_DES_RESOURCES.Prof;
import GESTION_DES_RESOURCES.employe_maintenance;
import Profile.EmployeController;
import Profile.EncadreurController;
import Profile.EtudiantPController;
import Profile.ProfController;
import Profile.staticData;
import java.beans.EventHandler;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author boubs
 */
public class LoginController implements Initializable {
      @FXML
    private Button btnlg;

    @FXML
    private Button butvp;

    @FXML
    private TextField input1;

    @FXML
    private PasswordField input2;

    @FXML
    private Label label;
    @FXML
    private ComboBox<String> checkbox;
    @FXML
    AnchorPane login_pane ;
    String[] role = {"Etudiant", "Professeur", "Employe Maintenace", "Encadreur", "Admin"};
    @FXML
    private void verif_login(ActionEvent event) throws IOException{
        String c1=input1.getText();
        String c2 =input2.getText();
        String select =checkbox.getSelectionModel().getSelectedItem() ;
        String errmessage="";
        if(select == null || select.length() == 0){
         errmessage+="vous etes obliger de selectionner votre role \n";}
        if (c1.length()==0 || c2.length()==0)
        {
            errmessage+="vous etes obliger de remplir toutes les champs \n";}
        if(errmessage.length()==0){
            Academie_militaire A =new Academie_militaire("Borj Amri");
            if (staticData.getAM() == null) {
            A.getbase();
            staticData.setAM(A);
            System.out.print("1");
             }
            else
            {A = staticData.getAM(); 
            System.out.print("2");}

            if("Etudiant".equals(select))
            {
            if (! A.getEtudiants().containsKey(Integer.parseInt(c2))) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data");
            alert.setHeaderText("MOT DE PASSE INCORECT ");
            alert.setContentText("vous etes obliger de saisir un mdp qui est existe svp !!.");
            alert.show();
            }
            else {
             Etudiant etd = A.getEtudiants().get(Integer.parseInt(c2));
             staticData.setEtudiant(etd);
FXMLLoader loader = new FXMLLoader(getClass().getResource("/Profile/EtudiantP.fxml"));
AnchorPane root = loader.load();
EtudiantPController control = loader.getController();
control.setEtudiant(etd);
Scene scene = new Scene(root);
Stage stage = new Stage();
stage.setScene(scene);
stage.show();

Stage oldStage = (Stage) login_pane.getScene().getWindow();
oldStage.close();



            }
            }
            else if ("Professeur".equals(select))
            { if (! A.getProfs().containsKey(Integer.parseInt(c2))) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data");
            alert.setHeaderText("MOT DE PASSE INCORECT ");
            alert.setContentText("vous etes obliger de saisir un mdp qui est existe svp !!.");
            alert.show();
            }
            else {
             Prof pr = A.getProfs().get(Integer.parseInt(c2));
             staticData.setProf(pr);
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/Profile/Prof.fxml"));
            AnchorPane root = loader.load();
            ProfController control = loader.getController();
            control.set_Prof(pr);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

Stage oldStage = (Stage) login_pane.getScene().getWindow();
oldStage.close();



            }}
            else if ("Employe Maintenace".equals(select) ){ if (! A.getEmployesM().containsKey(Integer.parseInt(c2))) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data");
            alert.setHeaderText("MOT DE PASSE INCORECT ");
            alert.setContentText("vous etes obliger de saisir un mdp qui est existe svp !!.");
            alert.show();
            }
            else {
             employe_maintenance etd = A.getEmployesM().get(Integer.parseInt(c2));
             staticData.setEmploye(etd);
FXMLLoader loader = new FXMLLoader(getClass().getResource("/Profile/employe.fxml"));
AnchorPane root = loader.load();
 EmployeController control = loader.getController(); 
control.setEmp(etd);
Scene scene = new Scene(root);
Stage stage = new Stage();
stage.setScene(scene);
stage.show();

Stage oldStage = (Stage) login_pane.getScene().getWindow();
oldStage.close();



            }}
            else if ("Encadreur".equals(select))
            { if (! A.getEmployesS().containsKey(Integer.parseInt(c2))) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data");
            alert.setHeaderText("MOT DE PASSE INCORECT ");
            alert.setContentText("vous etes obliger de saisir un mdp qui est existe svp !!.");
            alert.show();
            }
            else {
             Employe_encad_stg etd = A.getEmployesS().get(Integer.parseInt(c2));
             staticData.setEncadreur(etd);
FXMLLoader loader = new FXMLLoader(getClass().getResource("/Profile/encadreur.fxml"));
AnchorPane root = loader.load();
EncadreurController control = loader.getController();
control.setencadreur_(etd);
Scene scene = new Scene(root);
Stage stage = new Stage();
stage.setScene(scene);
stage.show();

Stage oldStage = (Stage) login_pane.getScene().getWindow();
oldStage.close();



            }}
            else 
            {staticData.addAdmin();
            ArrayList<Integer> listmot =staticData.getAdminMP() ;
            listmot.add(0000);
            
            if (! listmot.contains(Integer.parseInt(c2))) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data");
            alert.setHeaderText("MOT DE PASSE INCORECT ");
            alert.setContentText("vous etes obliger de saisir un mdp qui est existe svp !!.");
            alert.show();
            }
            else {
            
            
            
            
FXMLLoader loader = new FXMLLoader(getClass().getResource("/CRUD/GroupeAdmin.fxml"));
AnchorPane root = loader.load();
 GroupeAdminController control = loader.getController(); 

Scene scene = new Scene(root);
Stage stage = new Stage();
stage.setScene(scene);
stage.show();

Stage oldStage = (Stage) login_pane.getScene().getWindow();
oldStage.close();}

            
            
            }
        }
        else{
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("SING-UP PROTOCOLE");
            alert.setHeaderText("saisie incomplete");
            alert.setContentText(errmessage);
            alert.show();
        
        
        
        
        }
         
        
        
    }   
        
    @FXML
    public void videoshow(ActionEvent event) throws IOException    {
        
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Movie/Movie.fxml"));
AnchorPane root = loader.load();
 

Scene scene = new Scene(root);
Stage stage = new Stage();
stage.setScene(scene);
stage.show();

Stage oldStage = (Stage) login_pane.getScene().getWindow();
oldStage.close();

        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        checkbox.getItems().addAll(role);
    }    
    
}
