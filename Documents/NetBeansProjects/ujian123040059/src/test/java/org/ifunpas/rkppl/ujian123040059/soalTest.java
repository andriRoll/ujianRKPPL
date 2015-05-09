/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujian123040059;
import org.ifunpas.rkppl.ujian123040059.soal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;
/**
 *
 * @author SB 604-06
 */
public class soalTest {
    private static soal s;
    
    @Before
    public void awalTest(){
        s = new soal();
        System.out.println("Mengawali Testing");
    }
    
    
    @Test
    public void testPangkat1(){
        s.pangkat(3, 2);
        System.out.println("Seharusnya bisa");
    }
    
    @Test
    public void testPangkat2(){
        s.pangkat(0,0);
        System.out.println("Seharusnya bisa");
    }
    
    @Test
    public void testFaktorial1(){
        s.faktorial(8);
        System.out.println("Seharusnya bisa");
    }
    
    @Test
    public void testFaktorial2(){
        s.faktorial(0);
        System.out.println("Seharusnya bisa");
    }
    
    @Test
    public void testPerkalian1(){
        s.perkalian(4, 5);
        System.out.println("Seharusnya bisa");
    }
    
    @Test
    public void testPerkalian2(){
        s.perkalian(0, 0);
        System.out.println("Seharusnya bisa");
    }
    
    @After
    public void akhirTesting(){
        System.out.println("Mengakhiri Testing");
    }

    
    
}
