/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.opintojenseurantajarjestelma;

import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class StudyJournalUI extends Application {
    
    @Override
    public void start(Stage window) {
        
       String user = "Vera";
        String username ="VE";
        
        Users users = new Users(user, username);
        
        
        Boolean loggedinuser = true;

               
        
        if (!loggedinuser) 
        {/**
         * open login dialog to get user
         
         **/ }
 
        /**
         Main window
         **/
        
        /** MAIN WINDOW **/
        Button loginbutton = new Button();
        Button logoutbutton = new Button();
        Button newbutton = new Button();
        loginbutton.setText("Login");
        logoutbutton.setText("Logout");
        newbutton.setText("New");
        
        Button updatebutton = new Button();
        updatebutton.setText("UPDATE");
        
        ListView courcelist = new ListView();
        
        /**LOG-IN BUTTON PRESSED **/
         
        loginbutton.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override public void handle(ActionEvent event) 
            {
                VBox LIbox = new VBox();
                TextField userid = new TextField();
                TextField logusername = new TextField();
                Button logbutton = new Button("Login");
                Button newuserbutton = new Button("Create new user");
                LIbox.setSpacing(10);
                LIbox.getChildren().add(new Label("User ID"));
                LIbox.getChildren().add(userid);
                LIbox.getChildren().add(new Label("User name"));        
                LIbox.getChildren().add(logusername);
                LIbox.getChildren().add(logbutton);
                LIbox.getChildren().add(newuserbutton);
                               
                
                Scene loginscene = new Scene(LIbox, 300, 500);
                Stage loginstage = new Stage();
                loginstage.setScene(loginscene);
                loginstage.setTitle("Login user");
                
                
                
                
                /**LOG BUTTON PRESSED **/
                logbutton.setOnAction(new EventHandler<ActionEvent>() 
                {
                    @Override public void handle(ActionEvent event) 
                    {
 
                      String user = userid.getText();
                      String username = logusername.getText();  
                      
                      if (logusername.getText().trim().isEmpty() == false && userid.getText().trim().isEmpty() == false)
                      {
                        if (users.setActiveuser(user) == true)
                        {
                        //activeuser.setName(user);  
                        //activeuser.setUsername(username);
                        
                             window.setTitle("Courses of " + users.getActiveuser().getName());
                             loginstage.close();
                        } else {
                        
                             window.setTitle("Käyttäjää ei löytynyt " + user);
                        
                        
                        }
                      }
                    }
                     
                });
 
                
                /**NEW USER PRESSED **/
                newuserbutton.setOnAction(new EventHandler<ActionEvent>() 
                {
                    @Override public void handle(ActionEvent event) 
                    {
 
                      String user = userid.getText();
                      String username = logusername.getText();  
                      
                      if (logusername.getText().trim().isEmpty() == false && userid.getText().trim().isEmpty() == false)
                      {
                        //User newuser = new User(user, username); 
                        if (users.adduser(username, user) != null)
                        {
                            
                            window.setTitle("Courses of new user " + users.getActiveuser().getName());
                            loginstage.close();
                        }
                      }
                    }
                     
                });
                
                loginstage.show();               
                
            }
                     
        });
            
         /**LOG-IN BUTTON PRESSED **/
         
        logoutbutton.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override public void handle(ActionEvent event) 
            {
                // STORE AND CLOSE ALL
               window.close(); 
                
            }
        });

         /**UPDATE LIST **/
         
        updatebutton.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override public void handle(ActionEvent event) 
            {
                // STORE AND CLOSE ALL
               ArrayList<String> data = new ArrayList<String>();
              courcelist.getItems().clear();              
             
              data = users.getActiveuser().getCources();
              window.setTitle("Courses of active user " + users.activeuser.getName()+ " määrä "+ data.size());         
              if (data.size() > 0) { 
               
               for (int counter = 0; counter < data.size(); counter++) { 		      
                    courcelist.getItems().add(data.get(counter));
                }  
               
              }else {window.setTitle("NO COURCES for " + users.activeuser.getName());}
              
               
            }
        });
        
        courcelist.setPrefSize(400, 2);
        courcelist.setEditable(true);
        
        HBox box = new HBox();
        box.setSpacing(10);
        box.getChildren().add(loginbutton);
        box.getChildren().add(logoutbutton);
        box.getChildren().add(newbutton);
        box.getChildren().add(updatebutton);
        box.getChildren().add(courcelist);
        
        
        Scene scene = new Scene(box, 1000, 1000);
        
        window.setTitle("Courses of " + users.activeuser.getName());
        window.setScene(scene);
        window.show();
    }

                   
   
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}