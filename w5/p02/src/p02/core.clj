(ns p02.core
  (:gen-class))

;T1
;Kirjoita ohjelma (funktio), joka kysyy sinulta yhden luvun (> 0) ja kertoo, onko luku parillinen. Jos luku on <= 0, 
;ohjelma tulostaa virheilmoituksen. Merkkijonosyötteen (read-line) voi muuttaa kokonaisluvuksi operaattorilla Integer., esim. (Integer. "2")
(println "Anna luku joka on suurempi kuin 0")
(let [luku (read-line)] ; parametrina saatu arvo
  (if (<= (Integer. luku) 0) "ERROR! Virheellinen syöte." 
    (if (= (rem (Integer. luku) 2) 0) "syöte oli parillinen luku" "pariton luku")))


;T2
;Lisää edelliseen funktioon toisto recur-operaattorilla: jos annettu luku on virheellinen, sitä pyydetään uudestaan (funktio kutsuu tässä tapauksessa itseään).
(println "Anna luku joka on suurempi kuin 0")
(let [luku2 (read-line)] ; parametrina saatu arvo
(loop [(Integer. luku2) 0] 
  (println ((Integer. luku2))
    (if (<= (Integer. luku2) 0) "test" (recur (luku2))
))))


;T3
;Kirjoita funktio, joka tulostaa silmukassa kolmella jaolliset luvut väliltä 1 - yläraja, kun yläraja annetaan funktiolle parametrina.
(println "Anna luku")
(let [k (read-line)]
  (loop [r 0]
    (println (str "Kierros " r))
    (if (>= r (Integer. k))
    (println "loppu")
    (recur (+ r 3)))))


;T4
;Arvo lottorivi: 7 numeroa väliltä 1-39. Arvo luvut valitsemaasi tietorakenteeseen ja tulosta ne. Joukko (set) on tässä paras ratkaisu). 
;Käytä Clojuren loop-silmukkarakennetta.
(defn rln []
  (inc (rand-int 39)))

(defn rand-lottery-row []
  (loop [lottery-row #{}]
    (if (= (count lottery-row) 7)
      lottery-row
      (recur (conj lottery-row (rln))))))
(rand-lottery-row)


;T5
;Kahden luvun suurin yhteinen tekijä on suurin luku, jolla molemmat luvut ovat jaollisia. Esimerkiksi lukujen 102 ja 68 suurin tekijä on 34.
;MALLI!
;syt(p, q) {
 ; Jos q on 0, palauta p.
  ;Muuten 
   ; selvitä rekursiivisella metodikutsulla, mikä on suurin yhteinen tekijä q:lle ja p%q:lle,
	;ja
   ; palauta sama luku, jonka rekursiivinen kutsukin palautti.
;}
(defn jj [p q]
  (println (str "testi tulostus " q " " p))
  (if (= q 0)
    p
    (if (= (/ q p) 0) 
      (println (str "yhteinen tekijä on:  " q )) (recur q (- p 1))
      )))
(jj 102 77)