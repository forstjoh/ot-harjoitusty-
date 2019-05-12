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
 * Käyttäjän tietoja sisältävä luokka.
 * @author forstjoh
 */
public class User implements Serializable {
    private String name;
    private String username;
    public ArrayList<Course> courses = new ArrayList<Course>();
    
    /**
     * Käyttäjän tiedot.
     * @param name1 nimi
     * @param user käyttäjätunnus
     */
    public User(String name1, String user) {
        this.name = name1;
        this.username = user;
        //if (name1.equalsIgnoreCase("Johanna")) this.loadCources();
    }
    
    /**
     * Metodi palauttaa käyttäjän nimen.
     * @return nimi
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Metodi palauttaa käyttäjän käyttäjätunnuksen.
     * @return käyttäjätunnus
     */
    public String getUsername() {
        return this.username;
    }  
    
    /**
     * Nimen asettaminen.
     * @param newName nimi
     */
    public void setName(String newName) {
        this.name = newName;
    }
    
    /**
     * Käyttäjätunnuksen asettamninen.
     * @param newUsername käyttäjätunnus
     */
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }  
    
    /**
     * Käyttäjän kurssilista.
     * @return kurssitiedot
     */
    public ArrayList<String> getCources() {
        ArrayList<String> data = new ArrayList<String>();
        
        for (Course cour:courses)  {    
            data.add(cour.getCourseName());
        }
        return data; 
    }
    
    /**
     * Käyttäjän kurssitietojen palauttaminen.
     * @param key kurssiavain
     * @return kurssin tiedot
     */
    public Course getCource(String key) {
        for (Course cour:courses)  {    
            if (cour.getCourseName().equals(key)) {
                return cour;
            }
        } 
        return null;
    }
    
    /**
     * Kurssin tietojen muokkaaminen.
     * @param ncourseName kurssin nimi
     * @param nstatus kurssin status
     * @param nexamday kurssin tenttipäivä
     * @param nscore kurssin arvosana
     * @param nnotes kurssin muistiinpanot
     */
    public void modifyCource(String ncourseName, String nstatus, String nexamday, String nscore, String nnotes) {
        for (Course cour:courses)  {    
            if (cour.getCourseName().equals(ncourseName)) {
                cour.update(ncourseName, nstatus, nexamday, nscore, nnotes);          
            }
        }     
    }

    /**
     * Kurssin tietojen lataaminen.
     */
    public void loadCources() {
        courses.add(new Course(" sdd21313x", "1 ", "d ", "2", "y "));
        courses.add(new Course(" gga234332a", "2 ", "f ", "2", "h "));
        courses.add(new Course(" aa234234324s", "3 ", "g ", "2", "h "));   
    }  
    
    /**
     * Kurssien llisääminen.
     * @param ncourseName kurssin nimi
     * @param nstatus kurssin status
     * @param nexamday kurssin tenttipäivä
     * @param nscore kurssin arvosana
     * @param nnotes kurssin muistiinpanot
     */
    public void addCource(String ncourseName, String nstatus, String nexamday, String nscore, String nnotes) {
        courses.add(new Course(ncourseName, nstatus, nexamday, nscore, nnotes));       
    }      
    
    /**
     * Käyttäjän palauttaminen.
     * @param obj käyttäjä
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

