
function sty(lista ,p, q) {
    if (p > q){
        console.log(lista ,p, q);
        return (lista);
    }
    else {
        var l = lista[p];
        lista[p] = lista[q];
        lista[q] = l;
        return sty(p+1, q-1, lista); // tämä kääntää edellisen tehtävän listan. 
    }
}
//var Q = sty(2, 0);
var list = sty([1,2,3,4,5,6,7,8,9,10], 0, 10);
console.log(list);
