package edu.escuelaing.arem;
import com.google.gson.JsonObject;

public class ServicesImpl {
    Services services;
    
    public ServicesImpl(){
        this.services = new Services();
    }

    /**
     * Utiliza la función de la clase Services para obtener el valor y devolverlo en formato Json
     * @param celsius, valor a convertir
     * @return Json con la respuesta y el estado
     */
    public JsonObject celsiusToFahrenheit(double celsius){
        double ans = services.celsiusToFahrenheit(celsius);

        JsonObject json = new JsonObject();

        json.addProperty("status", 200);
        json.addProperty("result", ans);

        return json;
    }

    /**
     * Utiliza la función de la clase Services para obtener el valor y devolverlo en formato Json
     * @param fahrenheit, valor a convertir
     * @return Json con la respuesta y el estado
     */
    public JsonObject fahrenheitToCelsius(double fahrenheit){
        double ans = services.fahrenheitToCelsius(fahrenheit);

        JsonObject json = new JsonObject();

        json.addProperty("status", 200);
        json.addProperty("result", ans);

        return json;
    }

}
