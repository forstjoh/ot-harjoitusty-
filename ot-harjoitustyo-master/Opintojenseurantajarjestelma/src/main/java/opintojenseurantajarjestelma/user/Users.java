package opintojenseurantajarjestelma.user;

import opintojenseurantajarjestelma.opintojenseurantajarjestelma.StudyJournalUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 * @author forstjoh
 */
public class Users  implements Serializable {

    public ArrayList<User> UserList;
    public User activeUser = null;
    public String userFile = null;
    
    /**
     * 
     * @param fileName Name of the where data is stored.
     */
    public Users(String fileName) {
        UserList = new ArrayList<User>();
        this.loadUsersFromFile(fileName);
        userFile = fileName;   
    }
    
    /**
     * 
     * @param name1
     * @param user 
     */
    public Users(String name1, String user) {
        UserList = new ArrayList<User>();
        activeUser = new User(name1,user);
    }
    
    /**
     * 
     * @param fileName 
     */
    private void loadUsersFromFile(String fileName){
    // should trow error
        if (fileName == null) return;
            // file is there and it is not dir
        File f = new File(fileName);
        if(f.exists() && !f.isDirectory()) { 
            try {
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
                UserList = (ArrayList)ois.readObject();
                ois.close();  
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return;
   }
    
   /**
    * 
    * @param user
    * @return 
    */
    public ArrayList<User> loadusers(User user){
        if (user != null) UserList.add(user);
        return UserList;
    }
    
    /**
     * 
     * @param user
     * @param userId
     * @return 
     */
    public User addUser(String user, String userId){
      
        for(User usr:UserList)  {    
           // if (usr.getUsername().equals(userid)) return false;
        }
      
        User newUser = new User(user, userId); 
        UserList.add(newUser);
        this.activeUser =  newUser;
        return newUser;
    } 
    
    /**
     * 
     * @param userId
     * @return 
     */
    public boolean setActiveUser(String userId)  {
        for(User usr:UserList)  {    
           if (usr.getUsername().equals(userId)){
               this.activeUser = usr; 
               return true;
            } 
        }
        return false;
    }
    
    /**
     * 
     * @return 
     */
    public User getActiveUser(){
      return activeUser;
    }

    public void saveToFile() {
        try {
         //Write Student array to file.
            FileOutputStream fos = new FileOutputStream(userFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(UserList);
            oos.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }      
}
