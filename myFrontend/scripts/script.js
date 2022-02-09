const CELSIUS = "celsius";
const FAHRENHEIT = "fahrenheit";
// const BASE_URL = "http://localhost:4567"
const BASE_URL = "https://aqueous-plains-46065.herokuapp.com/"

console.log("Conexion");   

const celsius = document.getElementById("celsius");
const fahrenheit = document.getElementById("fahrenheit");

const celsiusButton = document.getElementById("celsiusButton");
const fahrenheitButton = document.getElementById("fahrenheitButton");

const celsiusResult = document.getElementById("celsiusResult");
const fahrenheitResult = document.getElementById("fahrenheitResult");

function celsiusConvertListener(){
    const value = celsius.value; 
    callService(CELSIUS, value); 
    console.log(celsius.value); 
};

function fahrenheitConvertListener(){
    const value = fahrenheit.value; 
    callService(FAHRENHEIT, value); 
    console.log(fahrenheit.value); 
};

celsiusButton.addEventListener("click", celsiusConvertListener);
fahrenheitButton.addEventListener("click", fahrenheitConvertListener);

async function callService(service, value){
    switch(service){
        case CELSIUS:
            const ans = await fetchData("celsiusToFahrenheit", value); 
            console.log(ans); 
            fahrenheitResult.innerHTML = `El resultado es: ${ans.result}`
            break; 
        case FAHRENHEIT:
            const res = await fetchData("fahrenheitToCelsius", value);
            celsiusResult.innerHTML = `El resultado es: ${res.result}` 
            break; 
    }
}

async function fetchData(endpoint, value){
    const url = `${BASE_URL}/${endpoint}?value=${value}`;
    const res = await fetch(url, {
        method:"GET",
        headers:{
            'Content-Type': 'application/json'
        }
    }); 

    const data = await res.json(); 

    return data; 
}



