'use strict'

const func = function (x, y) {
    return function () {
        if (x > y){
            console.log(x+" is bigger than "+y);
            return (1);
        }
        else if (x < y) {
            console.log(x+" is smaller than "+y);
            return(-1);
        }
        else {
            console.log(y+ " and "+x+" are equal");
            return (0);
        }
    }();
}
var rand1=Math.floor(Math.random() * 10);
var rand2 =Math.floor(Math.random() * 10);
var tulos = func(rand1, rand2);
console.log(tulos);