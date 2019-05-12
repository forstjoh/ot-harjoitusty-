/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opintojenseurantajarjestelma.domain;

import java.io.Serializable;

/**
 * Kurssin tietoja sisältävä luokka.
 * @author forstjoh
 */
public class Course implements Serializable {
    private String courseName;
    private String status;
    private String examDay;
    private String score;
    private String notes;


    /**
     * Kurssin tiedot.
     * @param coNa kurssin nimi
     * @param sta kurssin status
     * @param eDay kurssin tenttipäivä
     * @param sco kurssin arvosana
     * @param note kurssin muistiinpanot
     */
    public Course(String coNa, String sta, String eDay, String sco, String note) {
        this.courseName = coNa;
        this.status = sta;
        this.examDay = eDay;
        this.score = sco;
        this.notes = note;
    }
    
    /**
     * Kurssimetodi.
     */
    public Course() {
        this.courseName = null;
        this.status = null;
        this.examDay = null;
        this.score = null;
        this.notes = null;
    }

    /**
     * Päivitysluokka.
     * @param coNa kurssin nimi
     * @param sta kurssin status
     * @param eDay kurssin tenttipäivä
     * @param sco kurssin arvosana
     * @param note kurssin muistiinpanot
     */
    public void update(String coNa, String sta, String eDay, String sco, String note) {
        this.courseName = coNa;
        this.status = sta;
        this.examDay = eDay;
        this.score = sco;
        this.notes = note;
    }
    
    /**
     * Metodi palauttaa kurssin nimen.
     * @return kurssinimi
     */
    public String getCourseName() {
        return courseName;
    }
    
    /**
     * Metodi palauttaa kurssin statuksen.
     * @return status
     */
    public String getStatus() {
        return status;
    }    
    
    /**
     * Metodi palauttaa kurssin tenttipäivän.
     * @return tenttipäivä
     */
    public String getExamDay() {
        return examDay;
    }
    
    /**
     * Metodi palauttaa kurssin arvosanan.
     * @return arvosana
     */
    public String getScore() {
        return score;
    }
    
    /**
     * Metodi palauttaa kurssin muistiinpanot.
     * @return muistiinpanot
     */
    public String getNotes() {
        return notes;
    }
   
}

