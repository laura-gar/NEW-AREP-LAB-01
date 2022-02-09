package edu.escuelaing.arem;

import spark.Request;
import spark.Response;
import spark.Filter;
import com.google.gson.JsonObject;
import static spark.Spark.*;

/**
 * Minimal web app example for Heroku using SparkWeb
 *
 * @author daniel
 */
public class App {
    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        ServicesImpl servicesImpl = new ServicesImpl();
        port(getPort());

        // Allow CORS
        options("/*",
                (request, response) -> {
                    String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
                    }
                    String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
                    }
                    return "OK";
                });
        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        get("/celsiusToFahrenheit", (req, res) -> {
            String value = req.queryParams("value");
            return servicesImpl.celsiusToFahrenheit(Double.parseDouble(value));

        });

        get("/fahrenheitToCelsius", (req, res) -> {
            String value = req.queryParams("value");
            return servicesImpl.fahrenheitToCelsius(Double.parseDouble(value));
        });
    }


    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
