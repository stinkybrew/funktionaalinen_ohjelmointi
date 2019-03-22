/* function f(p, q) {
    console.log(p, q);
    if (p < q)
        return p;
    else {
        return q * f(q-1);
    }
}
var Q = f(4, 5);
console.log(Q);
*/


function sty(p, q) {
    console.log(q, p);
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
