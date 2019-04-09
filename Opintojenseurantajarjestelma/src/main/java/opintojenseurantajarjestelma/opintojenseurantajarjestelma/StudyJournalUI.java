/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.opintojenseurantajarjestelma;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author forstjoh
 */
public class StudyJournalUI extends Application {
    
    @Override
    public void start(Stage window) {
        Button loginbutton = new Button();
        Button logoutbutton = new Button();
        Button newbutton = new Button();
        loginbutton.setText("Login");
        logoutbutton.setText("Logout");
        newbutton.setText("New");
        
        
        HBox box = new HBox();
        box.setSpacing(10);
        box.getChildren().add(loginbutton);
        box.getChildren().add(logoutbutton);
        box.getChildren().add(newbutton);
        
        Scene scene = new Scene(box, 300, 250);
        
        window.setTitle("Courses");
        window.setScene(scene);
        window.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
