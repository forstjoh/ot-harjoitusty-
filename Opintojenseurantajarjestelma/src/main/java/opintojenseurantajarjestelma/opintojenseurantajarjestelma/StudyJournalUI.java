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
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author forstjoh
 */
public class StudyJournalUI extends Application {
    
    @Override
    public void start(Stage window) {
        
        String user = "Johanna";
        String username ="JF";
        Boolean loggedinuser = true;
        
        User activeuser = new User(user, username); 
 
        
        if (!loggedinuser) 
        {/**
         * open login dialog to get user
         
         **/ }
 
        /**
         Main window
         **/
        
        
        Button loginbutton = new Button();
        Button logoutbutton = new Button();
        Button newbutton = new Button();
        loginbutton.setText("Login");
        logoutbutton.setText("Logout");
        newbutton.setText("New");
        
        loginbutton.setOnAction((event) -> {
            TextField userid = new TextField();
            TextField logusername = new TextField();
            Button logbutton = new Button("Login");
            VBox LIbox = new VBox();
            LIbox.setSpacing(10);
            LIbox.getChildren().add(new Label("User ID"));
            LIbox.getChildren().add(userid);
            LIbox.getChildren().add(new Label("User name"));        
            LIbox.getChildren().add(logusername);
            LIbox.getChildren().add(logbutton);
            Scene loginscene = new Scene(LIbox, 300, 500);
            Stage loginstage = new Stage();
            loginstage.setScene(loginscene);
            loginstage.setTitle("Login user");
            loginstage.show();
            logbutton.setOnAction((event1) -> {
               
                
                
            });
        
        });
        
        
        HBox box = new HBox();
        box.setSpacing(10);
        box.getChildren().add(loginbutton);
        box.getChildren().add(logoutbutton);
        box.getChildren().add(newbutton);
        
        Scene scene = new Scene(box, 1000, 1000);
        
        window.setTitle("Courses of " + activeuser.getName());
        window.setScene(scene);
        window.show();
    }

    
    
    
    
   
    public static void main(String[] args) {
        launch(args);
    }
    
}
