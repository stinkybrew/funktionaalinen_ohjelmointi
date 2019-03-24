
var qlista = [];
var plista = [];
var pqlista = [];
function sty(p, q) {
    console.log(p, q);
    qlista.push(q);
    plista.push(p);
    pqlista.push(q, p);
    
    if (p%q === 0){
        console.log("jaollinen");
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
console.log("q-lista: " + qlista);
console.log("p-lista: " + plista);
console.log("pq-lista: " + pqlista);


funktio lajittelu(taulukko)
    jos taulukon koko > 1
        vasen = lajittelu(taulukon vasen puolisko)
        oikea = lajittelu(taulukon oikea puolisko)
        uusi = vasen ja oikea yhdistettynä järjestyksessä
        palauta uusi
    muuten
        palauta taulukko