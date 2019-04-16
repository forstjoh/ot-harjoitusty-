/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import opintojenseurantajarjestelma.opintojenseurantajarjestelma.Course;
import opintojenseurantajarjestelma.opintojenseurantajarjestelma.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserTest {
    
    User user;
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void userTest(){
        User user = new User();
        assertTrue(user!=null);
    }
    @Test
    public void nameTest(){
        User user = new User();
        assertEquals("name",user.getName());   
    }    
    @Test
    public void userNameTest(){
        User user = new User();
        assertEquals("userName",user.getName());     
    }    
   
}
