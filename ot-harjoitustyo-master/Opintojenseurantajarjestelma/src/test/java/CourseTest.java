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
import opintojenseurantajarjestelma.domain.Course;

/**
 *
 * @author forstjoh
 */
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
        Course course= new Course("a", "2", "3","4", "5");
        assertNotEquals("1",course.getCourseName());    
    }    
    
    @Test
    public void statusTest(){
        Course course= new Course("1", "2", "3","4", "5");
        assertEquals("2",course.getStatus());    
    }
    
    @Test
    public void dayTest(){
        Course course = new Course("1", "2", "3","4", "5");
        assertEquals("3",course.getExamDay());
    }
    @Test
    public void scoreTest(){
        Course course = new Course("1", "2", "3","4", "5");
        assertEquals("4",course.getScore());
    }
    @Test
    public void NoteTest(){
        Course course = new Course("1", "2", "3","4", "5");
        assertEquals("5",course.getNotes());
    }
   
   
   
}