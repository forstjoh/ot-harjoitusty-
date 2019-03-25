/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author forstjoh
 */
public class KassapaateTest {
    
    Kassapaate unicafeExactum;
    
    
    @Before
    public void setUp() {
        unicafeExactum = new Kassapaate();
    }
    
    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(unicafeExactum!=null);      
    }
    
    @Test
    public void syoMaukkaastiKasvattaaSaldoa() {
    
    Kassapaate unicafeExactum  = new Kassapaate();   

    assertEquals(5,unicafeExactum.syoMaukkaasti(405));
    assertEquals(100400,unicafeExactum.kassassaRahaa());
    assertEquals(1,unicafeExactum.maukkaitaLounaitaMyyty());  
    
    assertEquals(300,unicafeExactum.syoMaukkaasti(300));
    assertEquals(100400,unicafeExactum.kassassaRahaa());
    assertEquals(1,unicafeExactum.maukkaitaLounaitaMyyty()); 
    }  
    
    @Test
    public void syoEdullisestiKasvattaaSaldoa() {
    
    Kassapaate unicafeExactum  = new Kassapaate();   

    assertEquals(60,unicafeExactum.syoEdullisesti(300));
    assertEquals(100240,unicafeExactum.kassassaRahaa());
    assertEquals(1,unicafeExactum.edullisiaLounaitaMyyty());  
    
    assertEquals(200,unicafeExactum.syoEdullisesti(200));
    assertEquals(100240,unicafeExactum.kassassaRahaa());
    assertEquals(1,unicafeExactum.edullisiaLounaitaMyyty()); 
    }  
    
    
    @Test
    public void rahanOttaminenToimiiOikein() {
    Maksukortti kortti = new Maksukortti(700);
    boolean tosion = true;
    boolean eiole = false;
    
    Kassapaate unicafeExactum  = new Kassapaate();   
    
    assertEquals(tosion,unicafeExactum.syoEdullisesti(kortti));
    assertEquals(700-240,kortti.saldo());
    assertEquals(1,unicafeExactum.edullisiaLounaitaMyyty());
    
    assertEquals(tosion,unicafeExactum.syoMaukkaasti(kortti));
    assertEquals(700-240-400,kortti.saldo());
    assertEquals(1,unicafeExactum.maukkaitaLounaitaMyyty());
    
    assertEquals(eiole,unicafeExactum.syoMaukkaasti(kortti));
    assertEquals(700-240-400,kortti.saldo());
    assertEquals(1,unicafeExactum.maukkaitaLounaitaMyyty());
    
    assertEquals(eiole,unicafeExactum.syoEdullisesti(kortti));
    assertEquals(700-240-400,kortti.saldo());
    assertEquals(1,unicafeExactum.edullisiaLounaitaMyyty());
    
    //kassassa oleva rahamäärä ei muutu kortilla ostettaessa
    assertEquals(100000,unicafeExactum.kassassaRahaa());
    
    }
}
