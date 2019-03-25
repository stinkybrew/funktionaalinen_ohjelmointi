'use strict'

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
const f = function( tulos, v15, v16, x, y){
    if (tulos === -1) {
        console.log(v15+" is colder that "+v16);
    }
    else if (tulos === 1) {
        console.log(v15+" is warmer that "+v16);
    }
    else  {
        console.log(v15+" and "+v16+" temperatures are the same" );
    }
    // perussilmukka

    //var tulos = f(func(v15, v16));
    //console.log(tulos); 
    return (v15, v16);
    //return func(v2015[i]+1,v2015[i]+1);
}
var v2015 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
var v2016 = [2, 3, 3, 2, 4, 5, 7, 9, 8, 10, 10, 13];
for(var i=0 ; i<v2015.length ;) {
    var v15 = v2015[i];
    var v16 = v2016[i];
    //console.log(tulos);
    i++
    var tulos = (func(v15, v16));
    var tlz = (f(tulos, v15, v16));
    console.log(tulos);
    //console.log(tlz); 
}