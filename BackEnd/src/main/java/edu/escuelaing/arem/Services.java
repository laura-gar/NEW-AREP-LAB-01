package edu.escuelaing.arem;


public class Services {

    /**
     * Convierte los grados Celsius a Fahrenheit.
     * @param celsius, grados Celsius a convertir.
     * @return Grados en Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius){
        double res = Math.round(((celsius * 9/5) + 32) * 100.0) / 100.0;
        return res;
    }

    /**
     * Convierte los grados Fahrenheit a Celsius.
     * @param fahrenheit, grados Fahrenheit a convertir.
     * @return Grados en Celsius.
     */
    public  double fahrenheitToCelsius(double fahrenheit){
        double res = Math.round(((fahrenheit - 32) * 5/9) * 100.0) / 100.0;
        return res;
    }



}
