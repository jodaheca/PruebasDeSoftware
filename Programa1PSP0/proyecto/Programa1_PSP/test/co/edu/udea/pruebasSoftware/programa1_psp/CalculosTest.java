/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.pruebasSoftware.programa1_psp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOaquin David Hernandez Cardenas
 */
public class CalculosTest {
    
    public CalculosTest() {
    }

    /**
     * Test of getCantidadNumeros method, of class Calculos.
     */
    @Test
    public void testGetCantidadNumeros() {
        System.out.println("getCantidadNumeros");
        Calculos instance = new Calculos();
        int expResult = 10;
        int result = instance.getCantidadNumeros();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedia method, of class Calculos.
     */
    @Test
    public void testGetMedia() {
        System.out.println("getMedia");
        Calculos instance = new Calculos();
        double expResult = 550.6;
        double result = instance.getMedia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDesviacion method, of class Calculos.
     */
    @Test
    public void testGetDesviacion() {
        System.out.println("getDesviacion");
        Calculos instance = new Calculos();
        double expResult = 572.026844746915;
        double result = instance.getDesviacion();
        assertEquals(expResult, result, 0.0);
    }


    
}
