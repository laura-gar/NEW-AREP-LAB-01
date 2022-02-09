package edu.escuelaing.arem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
// */
public class AppTest extends TestCase {

    Services service = new Services();

    public void testCelsiusToFahrenheit(){
        double res = service.celsiusToFahrenheit(10);
        assertEquals(res, 50.0);
    }

    public void testCelsiusToFahrenheit2(){
        double res = service.celsiusToFahrenheit(22);
        assertEquals(res, 71.6);
    }

    public void testCelsiusToFahrenheit3(){
        double res = service.celsiusToFahrenheit(-16);
        assertEquals(res, 3.2);
    }

    public void testFahrenheitToCelsius(){
        double res = service.fahrenheitToCelsius(32);
        assertEquals(res, 0.0);
    }

    public void testFahrenheitToCelsius2(){
        double res = service.fahrenheitToCelsius(78);
        assertEquals(res, 25.56);
    }

    public void testFahrenheitToCelsius3(){
        double res = service.fahrenheitToCelsius(-16);
        assertEquals(res, -26.67);
    }




    public void testApp()
    {
        assertTrue( true );
    }
}
