/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import opintojenseurantajarjestelma.opintojenseurantajarjestelma.Course;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CourseTest {
    
    Course course;
    
    @Before
    public void setUp() {   
    }
    
    @Test
    public void courseTest(){
        Course course = new Course("1", "2", "3","4", "5");
        assertTrue(course!=null);
    }
    
    @Test
    public void courseNameTest(){
        Course course= new Course("1", "2", "3","4", "5");
        assertEquals("coNa",course.getStatus());    
    }    
    
    @Test
    public void statusTest(){
        Course course= new Course("1", "2", "3","4", "5");
        assertEquals("status",course.getStatus());    
    }
    
    @Test
    public void dayTest(){
        Course course = new Course("1", "2", "3","4", "5");
        assertEquals("examDay",course.getexamDay());
    }
    @Test
    public void scoreTest(){
        Course course = new Course("1", "2", "3","4", "5");
        assertEquals("score",course.getScore());
    }
    @Test
    public void NoteTest(){
        Course course = new Course("1", "2", "3","4", "5");
        assertEquals("notes",course.getNotes());
    }
   
   
   
}
