var toCelsius = fahrenheit => {
    return (5/9) * (fahrenheit-32);
}
var are = radius =>  Math.PI * radius * radius;    

let f = 39;
let r = 10;
console.log(toCelsius(f));
console.log(are(r));