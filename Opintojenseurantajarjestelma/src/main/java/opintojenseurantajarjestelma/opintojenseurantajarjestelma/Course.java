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
    private int score;
    private String notes;
    
    public Course(){
      
    }

    public Course(String coNa, String sta, String eDay, int sco, String note) {
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
    
    public int getScore() {
        return score;
    }
    
    public String getNotes() {
        return notes;
    }
   
}
