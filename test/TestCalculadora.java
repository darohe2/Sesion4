/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author usuario
 */
public class TestCalculadora {

    public TestCalculadora() {
    }


    public static void setUpClass() {
    }

    
    public static void tearDownClass() {
    }

    
    public void setUp() {
    }

    
    public void tearDown() {
    }

    @Test
    public  void testSuma() {

        assertEquals(5, Matematicas.suma(2, 3));

    }
    
    @Test
    public void testResta() {

        assertEquals(1, Matematicas.resta(3, 2));

    }

}
