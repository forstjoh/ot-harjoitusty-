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
 * useiden käyttäjien tietoja sisältävä luokka.
 * @author forstjoh
 */
public class Users  implements Serializable {

    public ArrayList<User> userlist;
    public User activeUser = null;
    public String userFile = null;
    
    /**
     * Käyttäjien listaus.
     * @param fileName datan tiedot
     */
    public Users(String fileName) {
        userlist = new ArrayList<User>();
        this.loadUsersFromFile(fileName);
        userFile = fileName;   
    }
    
    /**
     * Käyttäjien tiedot.
     * @param name1 nimi
     * @param user käyttäjätunnus
     */
    public Users(String name1, String user) {
        userlist = new ArrayList<User>();
        activeUser = new User(name1, user);
    }
    
    /**
     * Käyttäjän hakeminen tiedostosta.
     * @param fileName tiedostonnimi
     */
    private void loadUsersFromFile(String fileName) {
        if (fileName == null) {
            return;
        }
        File f = new File(fileName);
        if (f.exists() && !f.isDirectory()) { 
            try {
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
                userlist = (ArrayList) ois.readObject();
                ois.close();  
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return;
    }
    
   /**
    * Käyttäjän lataaminen.
    * @param user käyttäjätunnus
    * @return käyttäjälista
    */
    public ArrayList<User> loadusers(User user) {
        if (user != null) {
            userlist.add(user);
        } 
        return userlist;
    }
    
    /**
     * Käyttäjän lisääminen listalle.
     * @param user käyttäjä
     * @param userId käyttäjätunnus
     * @return uusi käyttäjä
     */
    public User addUser(String user, String userId) {
        for (User usr:userlist)  {    
           // if (usr.getUsername().equals(userid)) return false;
        }
        User newUser = new User(user, userId); 
        userlist.add(newUser);
        this.activeUser =  newUser;
        return newUser;
    } 
    
    /**
     * Käyttäjän olemassaolo.
     * @param userId käyttäjän id
     * @return tosi epätosi
     */
    public boolean setActiveUser(String userId)  {
        for (User usr:userlist) {    
            if (usr.getUsername().equals(userId)) {
                this.activeUser = usr; 
                return true;
            } 
        }
        return false;
    }
    
    /**
     * Aktiivisen käyttäjän hakeminen.
     * @return käyttäjä
     */
    public User getActiveUser() {
        return activeUser;
    }

    /**
     * Tiedostoon tallentaminen.
     */
    public void saveToFile() {
        try {
         //Write Student array to file.
            FileOutputStream fos = new FileOutputStream(userFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userlist);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }      
}
