'use strict'

const func = function() {
    return function (x, y) {
        var count = 0;
        let i = 0
        if (i<x.length) {
            var counttemp = count;
            if (x[i]<y[i]) {
                count++
            }
            i++
            return func(x, y);
        }
        else {
            i = 0; counter = 0; return counttemp;
        }
    }
}();
const f = function(list ,tulos, v15, v16){
    let list=[];
    if (tulos === -1) {
        console.log(v15+" is colder than "+v16);
        list[0]+tulos;
    }
    else if (tulos === 1) {
        console.log(v15+" is warmer than "+v16);
        list[1]+tulos;
    }
    else  {
        console.log(v15+" and "+v16+" temperatures are the same" );
        list[2]+tulos;
    }
    return (list, v15, v16);
}
const v2015 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
const v2016 = [2, 3, 3, 2, 4, 5, 7, 9, 8, 10, 10, 13];



const tulos = (func(v2015, v2016));
const tlz = (f(list ,tulos, v2015, v2016));
console.log(tulos);
console.timeLog(list); // THIS IS JUST FOR TESTING....


/*
const anon = function () {
    return function (v2015,v2016) {
        if(i<=v2015.length){
        countertemp = counter;
        if (v2015[i]<v2016[i]) {counter++;}
        i++
        return anon(v2015,v2016);
        }
        else{i = 0; counter = 0; return countertemp;}
    }
}();
var i = 0;
var counter = 0;
var countertemp;
let tulos = anon([0,0,0,0,0,0,0,0,0,0,0,0],[-22,-23,-16,-2,11,14,16,17,14,11,11,4]);
console.log("Vuonna 2016 keskilämpötila oli " + tulos + " eri kuukautena korkeampi kuin vuonna 2015");
tulos = anon([-20,-22,-15,-2,10,15,20,20,15,10,10,5],[-22,-23,-16,-2,11,14,16,17,14,11,11,4]);
console.log("Vuonna 2016 keskilämpötila oli " + tulos + " eri kuukautena korkeampi kuin vuonna 2015");
*/