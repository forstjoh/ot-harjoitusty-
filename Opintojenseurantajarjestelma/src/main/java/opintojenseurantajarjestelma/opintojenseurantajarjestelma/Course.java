/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.opintojenseurantajarjestelma;

public class Course {
    private String courseName;
    private String status;
    private String examDay;
    private String score;
    private String notes;
    
   
 public Course(String coNa, String sta, String eDay, String sco, String note) {
        this.courseName = coNa;
        this.status = sta;
        this.examDay = eDay;
        this.score = sco;
        this.notes = note;
    }

    public void update(String coNa, String sta, String eDay, String sco, String note) {
        this.courseName = coNa;
        this.status = sta;
        this.examDay = eDay;
        this.score = sco;
        this.notes = note;
    }
    
    
    public String getCourseName() {
        return courseName;
    }

    public String getStatus() {
        return status;
    }    
    
    public String getexamDay() {
        return examDay;
    }
    
    public String getScore() {
        return score;
    }
    
    public String getNotes() {
        return notes;
    }
   
}
