
function sty(p, q) {
    console.log(p, q);
    if (p === 0){
        console.log("jaollisia");
        return (true);
    }
    else if (q === 1) {
        console.log("jaoton")
        return(false);
    }
    else {
        return sty(q, p%q);
    }
}
var Q = sty(35, 8);
console.log(Q);
