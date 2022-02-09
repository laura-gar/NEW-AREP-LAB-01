# Conversor de unidades

El repositorio contiene los archivos necesarios para el uso de la aplicación de conversión. Esta construida usando Java (Spark) en la parte del **_Backend_** y HTML, JavaScript y CSS en la parte del Front. 

## Arquitectura

Es una implementación del estilo Cliente-Servidor usando una arquitectura **REST**. Los servicios expuestos en el **_Backend_**, se encentran expuestas en dos endpoints que el Frontend posteriormente va a consumir. Usa **JSON** como modo de envio y recepción de mensajes. El método de petición que se usa es **GET** y los valores requeridos son enviados como _query params _ . 

## ENDPOINTS

1. _/celsiusToFahrenheit_ Usado para convertir de grados Celsius a grados Fahrenheit. 
2. _/fahrenheitToCelsius_ Usado para converitr de grados Fahrenheit a grados Celsius. 

## PETICIONES
Las peticiones son manejadas con el método GET al backend. Los parametros son enviados como _queryparams_ usando **value**.

## RESPUESTAS
Las respuestas son enviadas en formato JSON, este tendrá como valores:
- status: Estado de la petición. 
- value: Resultado de la conversión. 

## LINKS 
 ### Backend 
  https://aqueous-plains-46065.herokuapp.com/
  
 ### Frontend
  https://arep-front-laura.herokuapp.com/
  
 ## ¿Cómo correr el proyecto de manera local?
 
 Si se quiere usar el back, se necesita descargar el .zip del repositorio o clonarlo. Luego, se usa el comando mvn package. Si se tiene heroku, puede usar heroku local web, de otro modo, en la clase App.java se corre el metodo main(): 
 
 Si se quiere usar el front, dee la misma forma deberá descargar el .zip del repositorio o clonarlo. Luego, en el directorio del Front, se abre el archivo index.html. 
 
 
 ## Construido con 
 - Spark, como Framework de Java. 
 - HTML y CSS, como lenguajes para el Front.
 
 ## Autor 
 - Laura García
  
  

