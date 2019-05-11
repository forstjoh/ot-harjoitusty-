/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.user;

import opintojenseurantajarjestelma.opintojenseurantajarjestelma.StudyJournalUI;
import opintojenseurantajarjestelma.domain.Course;
import java.io.Serializable;
import java.util.*;

/**
 * 
 * @author forstjoh
 */
public class User implements Serializable {
    private String name;
    private String username;
    public ArrayList<Course> Cources = new ArrayList<Course>();
    
    /**
     * 
     * @param name1
     * @param user 
     */
    public User(String name1, String user) {
        this.name = name1;
        this.username = user;
        //if (name1.equalsIgnoreCase("Johanna")) this.loadCources();
    }
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * 
     * @return 
     */
    public String getUsername() {
        return this.username;
    }  
    
    /**
     * 
     * @param newName 
     */
    public void setName(String newName) {
        this.name = newName;
    }
    
    /**
     * 
     * @param newUsername 
     */
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }  
    
    /**
     * 
     * @return 
     */
    public ArrayList<String> getCources(){
        ArrayList<String> data = new ArrayList<String>();
        
        for(Course cour:Cources)  {    
            data.add(cour.getCourseName());
        }
        return data; 
    }
    
    /**
     * 
     * @param key
     * @return 
     */
    public Course getCource(String key){
       for(Course cour:Cources)  {    
            if (cour.getCourseName().equals(key)) return cour;
        } 
        return null;
    }
    
    /**
     * 
     * @param ncourseName
     * @param nstatus
     * @param nexamday
     * @param nscore
     * @param nnotes 
     */
    public void modifyCource(String ncourseName, String nstatus, String nexamday, String nscore, String nnotes){
        for(Course cour:Cources)  {    
            if (cour.getCourseName().equals(ncourseName)) {
                cour.update(ncourseName, nstatus, nexamday, nscore, nnotes);          
            }
        }     
    }

    public void loadCources() {
        Cources.add(new Course(" sdd21313x", "1 ", "d ", "2", "y "));
	Cources.add(new Course(" gga234332a", "2 ", "f ", "2", "h "));
        Cources.add(new Course(" aa234234324s", "3 ", "g ", "2", "h "));   
    }  
    
    /**
     * 
     * @param ncourseName
     * @param nstatus
     * @param nexamday
     * @param nscore
     * @param nnotes 
     */
    public void addCource(String ncourseName, String nstatus, String nexamday, String nscore, String nnotes){
        Cources.add(new Course(ncourseName, nstatus, nexamday, nscore, nnotes));       
    }      
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        User other = (User) obj;
        return username.equals(other.username);
    }  
}

