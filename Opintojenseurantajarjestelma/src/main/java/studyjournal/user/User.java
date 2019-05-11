/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.opintojenseurantajarjestelma;

import java.util.*;

public class User {
    private String name;
    private String username;
    public ArrayList<Course> Cources = new ArrayList<Course>();
    
    
    public User(String name1, String user) {
        this.name = name1;
        this.username = user;
        if (name1.equalsIgnoreCase("Johanna")) this.loadCources();
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }  
    
   public void setName(String newname) {
        this.name = newname;
    }

    public void setUsername(String newusername) {
        this.username = newusername;
    }  
    
    
    public ArrayList<String> getCources()
    {
        ArrayList<String> data = new ArrayList<String>();
        
        for(Course cour:Cources)  
        {    
            data.add(cour.getCourseName());
        }
        
        return data; 
    }
    
    public Course getCource(String key)
    {
       for(Course cour:Cources)  
        {    
            if (cour.getCourseName().equals(key)) return cour;
        } 
        return null;
    }
    
    public void modifyCource(String ncourseName, String nstatus, String nexamday, String nscore, String nnotes)
    {
       for(Course cour:Cources)  
        {    
            if (cour.getCourseName().equals(ncourseName)) 
            {
                cour.update(ncourseName, nstatus, nexamday, nscore, nnotes);
                        
            }
        } 
        
    }

    
    public void loadCources() {
        Cources.add(new Course(" sdd21313x", "1 ", "d ", "2", "y "));
	Cources.add(new Course(" gga234332a", "2 ", "f ", "2", "h "));
        Cources.add(new Course(" aa234234324s", "3 ", "g ", "2", "h "));
        
    }  

public void addCource(String ncourseName, String nstatus, String nexamday, String nscore, String nnotes)
{
        Cources.add(new Course(ncourseName, nstatus, nexamday, nscore, nnotes));
	       
    }      

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        
        User other = (User) obj;
        return username.equals(other.username);
    }
    
}
