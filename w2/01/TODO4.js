"use strict"
const func = (x, y) => {             // Tämä laskee kuukausittaiset keskiarvot.
    var l = [];
    for(var i=0 ; i<x.length ;) {
        console.log("Annetutu arvot: " + x[i] + " ja " + y[i] + ", ");
        var keskiarvo = (x[i]+y[i])/2;
        console.log("ja niiden keskiarvo = " + keskiarvo);
        if (keskiarvo <= 0) {        // Tämä katsoo mitkä ovat arvoltaan suurempia kuin 0.
            console.log("ERROR! " + keskiarvo + " ei ole positiivinen arvo!");
            i++               
        }
        else {
            l.push(keskiarvo);
            i++ 
        }
    };
    return (l);
};

const f = (list, tulos) => {
    const reducer = (tulos, currentValue) => tulos + currentValue;
    var list2 = (tulos.reduce(reducer)) / tulos.length;
    var list = [list2];              //positiivisten laskettujen keskiarvojen keskiarvo !!!
    return list;
};
var list = [];
var v2015 = [-6, -3, -4, 2, 5, 10, 22, 25, 20, 13, 9, 3];
var v2016 = [-4, -10, -12, 2, 10, 18, 22, 25, 15, 10, 8, 2];
var tulos = (func(v2015, v2016));
var tlz = (f(list, tulos));
console.log("Positiiviset lasketut keskiarvot: " + tulos , tulos);
console.log("ja niiden keskiarvo:  " + tlz);
