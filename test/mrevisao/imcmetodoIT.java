/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrevisao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faria
 */
public class imcmetodoIT {
    
    public imcmetodoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcIMC method, of class imcmetodo.
     */
    @Test
    public void testCalcIMC() {
        System.out.println("calcIMC");
        double Peso = 99.0;
        double Altura = 1.80;
        imcmetodo instance = new imcmetodo();
        double expResult = 30.55;
        double result = instance.calcIMC(Peso, Altura);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of VerfIMC method, of class imcmetodo.
     */
    @Test
    public void testVerfIMC() {
        System.out.println("VerfIMC");
        double v1 = 30.49;
        imcmetodo instance = new imcmetodo();
        String expResult = "Obesidade";
        String result = instance.VerfIMC(v1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
