"use strict"
const func = (x, y) => {            // Tämä laskee kuukausittaiset keskiarvot.
    var l = [];
    for(var i=0 ; i<11 ;) {
        console.log("Annetutu arvot: " + x[i] + " ja " + y[i] + ", ");
        var keskiarvo = (x[i]+y[i])/2;
        console.log("ja niiden keskiarvo = " + keskiarvo);
        if (keskiarvo <= 0) {        // Tämä katsoo mitkä ovat arvoltaan suurempia kuin 0.
            console.log("error");
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
    var list = [list2];      //positiivisten laskettujen keskiarvojen keskiarvo !!!
    return list;
};
var list = [];
//var asteet = ([-6, -3, -4, 2, 5, 10, 22, 25, 20, 13, 9, 3],[-4, -10, -12, 2, 10, 18, 22, 25, 15, 10, 8, 2]);
var v2015 = [-6, -3, -4, 2, 5, 10, 22, 25, 20, 13, 9, 3];
var v2016 = [-4, -10, -12, 2, 10, 18, 22, 25, 15, 10, 8, 2];
var tulos = (func(v2015, v2016));
var tlz = (f(list, tulos));
console.log("Positiiviset lasketut keskiarvot: " + tulos , tulos);
console.log(tlz);

/*
var v2015 = [-6, -3, -4, 2, 5, 10, 22, 25, 20, 13, 9, 3];
var v2016 = [-4, -10, -12, 2, 10, 18, 22, 25, 15, 10, 8, 2];
for(var i=0 ; i<v2015.length ;) {
    var v15 = v2015[i];
    var v16 = v2016[i];
    // console.log(tulos);
    var list = [];
    i++
    if (v15 === NaN) {
        console.error(error); 
    }
    //console.log(v15, v16);
    var tulos = (func(v15, v16));
    var tlz = (f(list, tulos));
    console.log(tulos);
    console.log(tlz);

};

*/