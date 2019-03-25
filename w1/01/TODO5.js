
function sty(p, q) {
    console.log(p, q); // Tämä tulostaa listan nro. kerrallaan
    if (q === 4){
        console.log(p+" ^ "+ q +" =");
        return (true);
    }
    else {
        return p * sty(p, q+1); // tämä kääntää edellisen tehtävän listan.
    }
}
var Q = sty(2, 0);
console.log(Q);
