//w1 02 TODO4
function pkHR(p,q) {
    console.log(p,q);
    if (q === 1) {
        return p;
    }
    else {
        return p*pkHR(p, q - 1);
    }
}
function pk(p,q) {
    return pkHR(p,q)
}
var tulos = pk(2, 4);
console.log(tulos);
var tulos = pk(5, 10);
console.log(tulos);