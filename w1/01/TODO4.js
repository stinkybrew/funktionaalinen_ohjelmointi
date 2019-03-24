
function sty(p, q) {
    console.log("q-arvo: "+q);
    if (p === 0){
        return (true);
    }
    else if (q === 1) {
        console.log("p-arvo: "+p)
        return(false);
    }
    else {
        return p * sty(p, q-1);
    }
}
var Q = sty(2, 8);
console.log(Q);
