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
            console.log(y+ " and "+x+" are equal");
            return (0);
        }
    }(h);
}
var v2015 = Math.floor(Math.random() * 10);
var v2016 = Math.floor(Math.random() * 10);
var tulos = func(v2015, v2016);

function annaFraasi(fraasi, y, x, h) { 
    return fraasi(x, y); // paluuarvona fraasi-funktion kutsun tulos
}
console.log(tulos);
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
// muutetaan vain yhteen paikkaan. Kutsut eivät muutu.