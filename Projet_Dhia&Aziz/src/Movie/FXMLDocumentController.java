/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Movie;

import java.io.File;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author boubs
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    	@FXML
	private MediaView m12;
	
	@FXML
	private Button b1, b2, b3;
        	
	private File file;
	private Media media;
	private MediaPlayer mediaPlayer;
        @FXML
        private ComboBox<String> com1;
	
	@FXML
    private AnchorPane etd1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
              try{ file = new File("C:\\Users\\boubs\\Documents\\NetBeansProjects\\Projet_Dhia&Aziz\\src\\Movie\\media0.mp4");


               media = new Media(file.toURI().toString());

		mediaPlayer = new MediaPlayer(media);
		m12.setMediaPlayer(mediaPlayer);}
                
                
                
                 catch (MediaException e) {
        System.err.println("Error initializing media: " + e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
              
		
    }    
    public void on() {
		
		mediaPlayer.play();
	}
	
	public void pause() {
		
		mediaPlayer.pause();
	}
	
	public void reset() {
		
		if(mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
			mediaPlayer.seek(Duration.seconds(0.0));
		}
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
}

