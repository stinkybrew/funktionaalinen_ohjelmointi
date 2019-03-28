


// pass a function to map
//const map1 = arr1.map(x => json.parse(x) + "X");

const map1 = function(arr1) {
    return function() {
        console.log(arr1);
    }();   
}
var arr1 = ('C:/Users/wille/tmp/testi/funktionaalinen_ohjelmointi/w2/01/movies.js');
var list=[];
var tulos = (map1(arr1));
console.log(map.tulos);
/*
const func = function(x, y) {
    return function () {
        if (x > y){
            return (1); // x is warmer that y 
        }
        else if (x < y) {
            return(-1); // x is colder that y
        }
        else {
            return (0); // temps are equal
        }   
    }();
}
*/