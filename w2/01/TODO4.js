"use strict"
var i = 0;
const func = (v2015, v2016) => {                   // Tämä laskee kuukausittaiset keskiarvot.    
    if (i<v2015.length) {
        console.log("TESTI!!!" + i);
        var keskiarvo = v2015.map((x) => (x + v2016[i])/2);
       
        //console.log(keskiarvo);  // TOIMII!
        //var keskiarvo = (x[i]+y[i])/2;
        i++
        const positive = keskiarvo.filter(x => x > 0); // Tämä katsoo mitkä ovat arvoltaan suurempia kuin 0.
        //console.log(positive);  // TOIMII!
        return func(v2015, v2016);
    }
    else {
        i = 0
        console.log("testiiii2222");
        return positive;
    }
}

const f = (list, tulos) => {
    var list = [];
    const reducer = (tulos, currentValue) => tulos + currentValue;
    var list2 = (tulos.reduce(reducer)) / tulos.length;
    var list = [list2];                   //positiivisten laskettujen keskiarvojen keskiarvo !!!
    return list;
};

let v2015 = [-6, -3, -4, 2, 5, 10, 22, 25, 20, 13, 9, 3];
let v2016 = [-4, -10, -12, 2, 10, 18, 22, 25, 15, 10, 8, 2];
var tulos = (func(v2015, v2016));
var tlz = (f(list, tulos));
console.log("Positiiviset lasketut keskiarvot: " + tulos , tulos);
console.log("ja niiden keskiarvo:  " + tlz);
