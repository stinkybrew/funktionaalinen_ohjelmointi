//Kahden luvun suurin yhteinen tekijä on suurin luku, jolla molemmat luvut ovat jaollisia. 
//Esimerkiksi lukujen 102 ja 68 suurin tekijä on 34.

/* functio syt(p, q) {
  Jos q on 0, palauta p.
  Muuten 
    selvitä rekursiivisella metodikutsulla, mikä on suurin yhteinen tekijä q:lle ja p%q:lle,
	ja
    palauta sama luku, jonka rekursiivinen kutsukin palautti.
} */

function sty(p, q) {
    console.log(p, q);
    if (q === 0){
        return (p);
    }
    else {
        return sty(q, p%q);
    }
}
var Q = sty(48, 60);
console.log(Q);
