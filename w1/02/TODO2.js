'use strict'

const func = function (x, y) {
    return function () {
        if (x > y){
            console.log(x+" is bigger that "+y);
            return (1); 
        }
        else if (x < y) {
            console.log(x+" is smaller that "+y);
            return(-1);
        }
        else {
            console.log(y+" and "+x+" are equal");
            return (0);
        }   
    }();
}


var v2015 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
var v2016 = [2, 3, 3, 2, 4, 5, 7, 9, 8, 10, 10, 13];
for(var i=0 ; i<v2015.length ;) {
    var v15 = v2015[i];
    var v16 = v2016[i];
    var tulos = func(v15, v16);
    console.log(tulos);
    i++
}

function f(v2015, v2016, tulos, func){
    if (tulos === -1) {
        
    }
    if (v2015[11]) {
        return (true);
    }
    else if (v2015[i] < v2016[i]) {
        return (false);
    }
    // perussilmukka
    console.log(tulos);
    
    return func(v2015[i]+1,v2015[i]+1);
}


/*
//////////////////////////////////////////////////
function tervehdysteksti(nimi){
    return 'Moi, '+ nimi;
}
function anteeksipyynto(nimi){
    return 'Anteeksi, '+ nimi;
}
function annaFraasi(fraasi,nimi) { 
   return fraasi(nimi); // paluuarvona fraasi-funktion kutsun tulos
}
console.log(annaFraasi(tervehdysteksti, 'Masa')); 
console.log(annaFraasi(anteeksipyynto, 'Aku')); 

// Jos fraasi, esim. tervehdys, muuttuu,
// muutetaan vain yhteen paikkaan. Kutsut eivät muutu. */