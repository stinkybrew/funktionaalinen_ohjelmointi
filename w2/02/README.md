# viikko 2 02


# Funktioita ja tietorakenteita

Erilaisia funktionaalisen ohjelmoinnin kulmakiviä..

Ota tehtäviä varten käyttöön immutable.js: npm install immutable 

1. Mäkihypyn pistelasku. Hyppääjä saa K-pisteelle kantaneesta hypystä 60 pistettä. Normaalimäen K-piste on 75–99 metrissä ja suurmäen 100-130 metrissä.
Mäet ovat erilaisia:  Jokainen lisämetri tuo normaalimäessä 2,0 pistettä ja suurmäessä 1,8 pistettä lisää. K-pisteen alle jäämisestä vähennetään pisteitä samalla tavalla.<br/><br/>
Voisit kirjoittaa esimerkiksi funktion, jolle annetaan parametrina kaikki nuo kolme tietoa tyyliin:

```
function laskePisteet(pituus, kPiste, lisapisteet){...}

```

* Käytä hyväksesi currying-menetelmää (palautetaan asiakkaan käyttöön yksiparametrinen funktio) ja osaksi soveltamista (partial application) tuottaaksesi eri mäkiin sovellettavia funktioita, joille annetaan parametrina vain hypyn pituus tyylin:
 
```
let pisteet = normaaliLahti(98);
```

* Vinkki: toteuta kaksiparametrinen funktio, joka saa parametreinaan mäen K-pisteen ja lisäpistemäärän (1,8 tai 2,0) ja joka palauttaa edelläkuvatunlaisen yksiparametrisen funktion.

* Kirjoita lopuksi testiohjelma, jossa lasket taulukossa olevien pituuksien tuottamat pisteet esim. Lahden normaalimäessä hypätyille hypyille. Käytä map-funktiota.




2. Määrittele Auto-luokka, jolla on kaksi ominaisuutta, tankki ja matkamittari, ja parametrillinen konstruktori näiden alkuarvojen asettamiseksi. Tankki sisältää polttoaineen määrän ja matkamittari ajetut kilometrit. 
Suojaa matkamittari siten (WeakMap), että lukemaa ei pääse muuttamaan luokan ulkopuolelta käsin. Jätä tankki suojaamatta.
Matkamittarin lukema muuttuu eli kasvaa, kun autolla ajetaan (metodi aja(), joka vähentää myös polttoainen määrää).  
Kirjoita getterit matkamittarin lukeman ja polttoaineen määrän selvittämiseksi.  
Kirjota myös metodi polttoaineen lisäystä varten, mutta esitä myös, kuinka voit käsitellä suoraan tankki-muuttujaa.

* Katso ideoita gitissä olevasta ohjelmasta v2/02/ominaisuuden_suojaus.js.


3. Tee edellisestä Auto-luokasta immutable value object -variaatio: Kerran luotua auto-oliota ei voi  muuttaa.


4. Määrittele seuraava joukko:

```
const set1 = Immutable.Set(['punainen', 'vihreä', 'keltainen']);
```

* Lisää joukkoon set1 'ruskea' tyyliin set2 = set1 & 'ruskea'. Mitä on (set1 === set2)? Lisää 'ruskea' uudestaan joukkoon set2 ja tuota uusi joukko set3. Mitä toteat, kun teet ==== -vertailun set2 ja set3:lle?

5. Toteuta jokin ohjelma, jolla voit havainnollistaa "lazy evaluation" -toteutustapaa.

