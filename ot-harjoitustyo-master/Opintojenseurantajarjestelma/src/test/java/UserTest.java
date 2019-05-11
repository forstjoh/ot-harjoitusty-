/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import opintojenseurantajarjestelma.domain.Course;
import opintojenseurantajarjestelma.user.User;

/**
 *
 * @author forsjoh
 */
public class UserTest {
    
    User user;
    
    @Before
    public void setUp() {
    }
    
    /*@Test
    public void userTest(){
        User user = new User();
        assertTrue(user!=null);
    }*/
    @Test
    public void nameTest(){
        User testUser = new User("aaa","bbb");
        assertEquals("aaa",testUser.getName());   
    }    
    @Test
    public void userNameTest(){
        User testUser2 = new User("a","b");
        assertEquals("b",testUser2.getUsername());     
    }    
   
    @Test
    public void CourseAddtest(){
        User testUser3 = new User("a","b");
        ArrayList<String> Crs = new ArrayList<>();
        testUser3.addCource("1", "2", "3", "4", "5");
        testUser3.addCource("a", "b", "c", "d", "f");
        
        Crs = testUser3.getCources();
        
        assertEquals(0,Crs.indexOf("1")) ;
        assertEquals(1,Crs.indexOf("a")) ;
        
    }    
   
    
    
}
