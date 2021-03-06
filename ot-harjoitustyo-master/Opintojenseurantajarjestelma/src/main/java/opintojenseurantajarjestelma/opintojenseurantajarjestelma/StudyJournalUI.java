/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.opintojenseurantajarjestelma;
import opintojenseurantajarjestelma.user.Users;
import opintojenseurantajarjestelma.user.User;
import opintojenseurantajarjestelma.domain.Course;
import java.util.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

/**
 *
 * @author forstjoh
 */
public class StudyJournalUI extends Application {
    
    @Override
    public void start(Stage window) {
        
        // initialize users 
        String usersonfile ="./users.namecources";
        Users users = new Users(usersonfile);
            
        /** MAIN WINDOW **/
        Button loginbutton = new Button();
        Button logoutbutton = new Button();
        Button newbutton = new Button();
        Button updatebutton = new Button();
        Button savebutton = new Button();

        loginbutton.setText("Login");
        logoutbutton.setText("Logout");
        newbutton.setText("New Course");
        updatebutton.setText("Update List");
        savebutton.setText("Save to File");
        ListView courcelist = new ListView();
        
        /**---------------------------------------**/
        
        courcelist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        
        /**---------------------------------------------**/
        
         
		VBox NEWbox = new VBox();
		TextField courseName = new TextField();
		TextField status = new TextField();
		TextField examday = new TextField();
		TextField score = new TextField();
		TextField notes = new TextField();
		Course C = new Course(" "," "," "," "," " );
		C = users.activeUser.getCource(newValue);
		
		courseName.setText(C.getCourseName());
		status.setText(C.getStatus()); 
		
		examday.setText(C.getExamDay()); 
		
		score.setText(C.getScore());
		notes.setText(C.getNotes());
		
                Button updatebutton = new Button("Modify cource data");
		Button cancelbutton = new Button("Cancel");
                
		NEWbox.setSpacing(10);
                
		NEWbox.getChildren().add(new Label("Cource name"));
                NEWbox.getChildren().add(courseName);
                
				NEWbox.getChildren().add(new Label("Status"));        
                NEWbox.getChildren().add(status);
				
				NEWbox.getChildren().add(new Label("Exam day"));        
                NEWbox.getChildren().add(examday);
				
				NEWbox.getChildren().add(new Label("Score"));        
                NEWbox.getChildren().add(score);
				
				NEWbox.getChildren().add(new Label("notes"));        
                NEWbox.getChildren().add(notes);
				
				
                NEWbox.getChildren().add(updatebutton);
                NEWbox.getChildren().add(cancelbutton);
                               
                
                Scene newcourcescene = new Scene(NEWbox, 300, 500);
                Stage newcourcestage = new Stage();
                newcourcestage.setScene(newcourcescene);
                newcourcestage.setTitle("New cource for "+users.activeUser);
                newcourcestage.show();
                cancelbutton.setOnAction(new EventHandler<ActionEvent>() {
                       @Override public void handle(ActionEvent event) {
                               // STORE AND CLOSE ALL
                          newcourcestage.close(); 
                       }
               });
    

                updatebutton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent event) {
 
                      String ncourseName = courseName.getText();
                      String nstatus = status.getText();  
					  String nexamday = examday.getText();  
					  String nscore = score.getText();  
					  String nnotes = notes.getText();  
			          
                      if (courseName.getText().trim().isEmpty() == false){
                        
						users.activeUser.modifyCource(ncourseName, nstatus, nexamday, nscore, nnotes);
			
                                                newcourcestage.close();									
                      }
                    }
                     
                });
 
         /**---------------------------------------------**/
      
        }
        });
    
        
        savebutton.setOnAction(new EventHandler<ActionEvent>() {
                       @Override public void handle(ActionEvent event) {
                               // STORE 
                          users.saveToFile();         
                       }
        });
        
        /**LOG-IN BUTTON PRESSED **/
         
        loginbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
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
                logbutton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent event) {
 
                      String user = userid.getText();
                      String username = logusername.getText();  
                      
                      if (logusername.getText().trim().isEmpty() == false && userid.getText().trim().isEmpty() == false){
                        if (users.setActiveUser(user) == true){
                        //activeuser.setName(user);  
                        //activeuser.setUsername(username);
                        
                             window.setTitle("Courses of " + users.getActiveUser().getName());
                             loginstage.close();
                        } else {
                        
                             window.setTitle("Käyttäjää ei löytynyt " + user);
                        }
                      }
                    } 
                });
 
                /**NEW USER PRESSED **/
                newuserbutton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent event) {
 
                      String user = userid.getText();
                      String username = logusername.getText();  
                      
                    if (logusername.getText().trim().isEmpty() == false && userid.getText().trim().isEmpty() == false){
                        //User newuser = new User(user, username); 
                        if (users.addUser(username, user) != null){
                            
                            window.setTitle("Courses of new user " + users.getActiveUser().getName());
                            loginstage.close();
                        }
                    }
                    }   
                });
                
                loginstage.show();                  
            }         
        });
            
         /**LOG-IN BUTTON PRESSED **/
         
        logoutbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                courcelist.getItems().clear();
                users.activeUser = null;
                window.setTitle("PLEASE LOG IN");                
                
            }
        });

         /**UPDATE LIST **/
         
        updatebutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                // STORE AND CLOSE ALL
                ArrayList<String> data = new ArrayList<String>();
                courcelist.getItems().clear();              
                if (users.activeUser == null) return;
                data = users.getActiveUser().getCources();
                window.setTitle("Courses of active user " + users.activeUser.getName()+ " määrä "+ data.size());         
                    if (data.size() > 0) { 
               
                        for (int counter = 0; counter < data.size(); counter++) { 		      
                            courcelist.getItems().add(data.get(counter));
                        }  
                    }else {window.setTitle("NO COURCES for " + users.activeUser.getName());}       
            }
        });
        /**----------------------------------------------------------------------------------------**/

  /**NEW COURRSE BUTTON PRESSED **/
         
        newbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
		if (users.activeUser == null) return;

			   // open dialog for new notes
               
                VBox NEWbox = new VBox();
                TextField courseName = new TextField();
                TextField status = new TextField();
                TextField examday = new TextField();
                TextField score = new TextField();
                TextField notes = new TextField();

                Button createbutton = new Button("Create new cource");
		Button cancelbutton = new Button("Cancel");
                
		NEWbox.setSpacing(10);
                
		NEWbox.getChildren().add(new Label("Cource name"));
                NEWbox.getChildren().add(courseName);
                NEWbox.getChildren().add(new Label("Status"));        
                NEWbox.getChildren().add(status);
				
		NEWbox.getChildren().add(new Label("Exam day"));        
                NEWbox.getChildren().add(examday);
				
		NEWbox.getChildren().add(new Label("Score"));        
                NEWbox.getChildren().add(score);
				
		NEWbox.getChildren().add(new Label("notes"));        
                NEWbox.getChildren().add(notes);
						
                NEWbox.getChildren().add(createbutton);
                NEWbox.getChildren().add(cancelbutton);
                               
                Scene newcourcescene = new Scene(NEWbox, 300, 500);
                Stage newcourcestage = new Stage();
                newcourcestage.setScene(newcourcescene);
                if (users.activeUser == null)
                                    newcourcestage.setTitle("No user");
                else
                                   newcourcestage.setTitle("New cource for "+users.activeUser);
                    
                newcourcestage.show();
                cancelbutton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent event) {
                               // STORE AND CLOSE ALL
                          newcourcestage.close(); 
                    }
               });
      
                /**CREATE BUTTON PRESSED **/
                createbutton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent event) {
 
                    String ncourseName = courseName.getText();
                    String nstatus = status.getText();  
                    String nexamday = examday.getText();  
                    String nscore = score.getText();  
                    String nnotes = notes.getText();  
			          
                        if (courseName.getText().trim().isEmpty() == false){
                        
                            users.activeUser.addCource(ncourseName, nstatus, nexamday, nscore, nnotes);
                                newcourcestage.close();		
                        }
                    }    
                });
			
            }
        });
		
		

       /**---------------------------------------------------------------------------------------------**/

        courcelist.setPrefSize(400, 2);
        courcelist.setEditable(true);
        
        HBox box = new HBox();
        box.setSpacing(10);
        box.getChildren().add(loginbutton);
        box.getChildren().add(logoutbutton);
        box.getChildren().add(newbutton);
        box.getChildren().add(updatebutton);
        box.getChildren().add(courcelist);
        box.getChildren().add(savebutton);
        
        Scene scene = new Scene(box, 1000, 1000);
        if (users.activeUser != null) 
            window.setTitle("Courses of " + users.activeUser.getName());
        else 
            window.setTitle("No active user logged in");
            
        window.setScene(scene);
        window.show();
    }
              
  /** 
   * Main method, application launch.
   * @param args string array 
   **/

    public static void main(String[] args) {
        launch(args);
    }    
}
