/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.opintojenseurantajarjestelma;

/**
 *
 * @author forstjoh
 */
public class User {
    private String name;
    private String username;

    public User(String name1, String user) {
        this.name = name1;
        this.username = user;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
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
