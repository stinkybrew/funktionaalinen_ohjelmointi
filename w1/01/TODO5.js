
function sty(p, q) {
    console.log(p, q);
    if (q === 4){
        console.log(p+" ^ "+ q +" =");
        return (true);
    }
    else {
        return p * sty(p, q+1);
    }
}
var Q = sty(2, 0);
console.log(Q);
