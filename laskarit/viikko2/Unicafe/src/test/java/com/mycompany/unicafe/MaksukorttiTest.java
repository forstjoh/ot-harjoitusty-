package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void konstruktoriAsettaaSaldonOikein() {
    Maksukortti kortti = new Maksukortti(10);
    
    String vastaus = kortti.toString(); 

    assertEquals("saldo: 0.10", kortti.toString());
    }
    
    @Test
    public void rahanLataaminenKasvattaaSaldonOikein() {
    Maksukortti kortti = new Maksukortti(10);
    
    kortti.lataaRahaa(220);

    assertEquals("saldo: 2.30", kortti.toString());
    }
    
    @Test
    public void rahanOttaminenToimiiOikein() {
    Maksukortti kortti = new Maksukortti(20);
    
    kortti.otaRahaa(10);
    kortti.otaRahaa(200);
   
    assertEquals("saldo: 0.10", kortti.toString());
    }
}