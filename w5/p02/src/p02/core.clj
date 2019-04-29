(ns p02.core
  (:gen-class))

;Kirjoita ohjelma (funktio), joka kysyy sinulta yhden luvun (> 0) ja kertoo, onko luku parillinen. Jos luku on <= 0, 
;ohjelma tulostaa virheilmoituksen. Merkkijonosyötteen (read-line) voi muuttaa kokonaisluvuksi operaattorilla Integer., esim. (Integer. "2")
(println "Anna luku joka on suurempi kuin 0")
(defn vertailu
[luku] ; parametrina saatu arvo
(if (= luku 0) "ERROR! Virheellinen syöte.")
(if (/ luku 2) "parillinen luku"))

(defn vertailu2
[luku2] ; parametrina saatu arvo
(if (<= :0 luku2) "Menen puistoon." "Luennolle."))