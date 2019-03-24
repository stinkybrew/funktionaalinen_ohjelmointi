
function sty(p, q) {
    console.log(p, q);
    if (p%q === 0){
        console.log("jaollisia");
        return (true);
    }
    else if (p%q === 1) {
        console.log("jaoton")
        return(false);
    }
    else {
        return sty(q, p^q-1);
    }
}
var Q = sty(35, 8);
console.log(Q);
