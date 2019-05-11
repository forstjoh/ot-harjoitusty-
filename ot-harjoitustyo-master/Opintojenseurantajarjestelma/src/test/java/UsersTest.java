/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import opintojenseurantajarjestelma.user.Users;

/**
 *
 * @author forstjoh
 */
public class UsersTest {
    
Users users;
    
    @Before
    public void setUp() {
    }
    
    /*@Test
    public void userTest(){
        User user = new User();
        assertTrue(user!=null);
    }*/
    @Test
    public void UserTest(){
        Users users = new Users("a", "b");
                
        assertEquals("a",users.getActiveUser().getName());
        
    }    
   
}