/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.opintojenseurantajarjestelma;

import java.util.ArrayList;


public class Users {

    public ArrayList<User> Userlist;
    public User activeuser;
    
    public Users(String name1, String user) {
        Userlist = new ArrayList<User>();
        activeuser = new User(name1,user);
    }

    
   public ArrayList<User> loadusers(User user)
{
        if (user != null) Userlist.add(user);
        return Userlist;
}
  
  public User adduser(String user, String userid)
{
             
        
        for(User usr:Userlist)  
        {    
           // if (usr.getUsername().equals(userid)) return false;
        
        }
      
        User newuser = new User(user, userid); 
        Userlist.add(newuser);
        this.activeuser =  newuser;
        return newuser;
} 
    
    public boolean setActiveuser(String userid)  
    {
        for(User usr:Userlist)  
        {    
           if (usr.getUsername().equals(userid))
           {
               this.activeuser = usr; 
               return true;
            } 
        }
        
        return false;
    
    }
  
  public User getActiveuser()
  {
      return activeuser;
  
  }   
}
