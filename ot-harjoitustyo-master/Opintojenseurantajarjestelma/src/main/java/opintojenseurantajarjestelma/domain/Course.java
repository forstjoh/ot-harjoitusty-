/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.domain;

import java.io.Serializable;
/**
 * 
 * @author forstjoh
 */
public class Course implements Serializable{
    private String courseName;
    private String status;
    private String examDay;
    private String score;
    private String notes;

    /**
     * 
     * @param coNa
     * @param sta
     * @param eDay
     * @param sco
     * @param note 
     */
    public Course(String coNa, String sta, String eDay, String sco, String note) {
        this.courseName = coNa;
        this.status = sta;
        this.examDay = eDay;
        this.score = sco;
        this.notes = note;
    }
    public Course() {
        this.courseName = null;
        this.status = null;
        this.examDay = null;
        this.score = null;
        this.notes = null;
    }

    /**
     * 
     * @param coNa
     * @param sta
     * @param eDay
     * @param sco
     * @param note 
     */
    public void update(String coNa, String sta, String eDay, String sco, String note) {
        this.courseName = coNa;
        this.status = sta;
        this.examDay = eDay;
        this.score = sco;
        this.notes = note;
    }
    
    /**
     * 
     * @return 
     */
    public String getCourseName() {
        return courseName;
    }
    
    /**
     * 
     * @return 
     */
    public String getStatus() {
        return status;
    }    
    
    /**
     * 
     * @return 
     */
    public String getExamDay() {
        return examDay;
    }
    
    /**
     * 
     * @return 
     */
    public String getScore() {
        return score;
    }
    
    /**
     * 
     * @return 
     */
    public String getNotes() {
        return notes;
    }
   
}

