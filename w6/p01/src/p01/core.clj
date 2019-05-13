(ns p01.core
  (:gen-class))

; T1
;(def vuodet
;  [{:vuosi 2015 :tammi -9 :helmi -16 :maalis -4 :huhti 5 :touko 12 :kesä 16 :heinä 21 :elo 22 :syys 16 :loka 8 :marras 1 :joulu -5}
;   {:vuosi 2016 :tammi -11 :helmi -10 :maalis -3 :huhti 10 :touko 15 :kesä 19 :heinä 20 :elo 15 :syys 7 :loka 2 :marras -2 :joulu -10}
;   ])
;(defn kesklampo ()) 

(def summ #(reduce + %))
(def average #(float(/ (summ %) (count %))))
  
(defn averagetemp
  [numbers]
  (map #(% (filter pos? numbers)) [average]))
  
(println (str "2015 ja 2016 vuosien kuukausittaiset positiiviset lämpökeskiarvot: "))
(averagetemp [-9 -16 -4 5 12 16 21 22 16 8 1 -5 -11 -10 -3 10 15 19 20 15 7 2 -2 -10])

; T2
(defn food-journal1
    [{:kk 3 :paiva 1 :neste 5.3 :vesi 2.0}
     {:kk 3 :paiva 2 :neste 5.1 :vesi 3.0}
     {:kk 3 :paiva 13 :neste 4.9 :vesi 2.0}
     {:kk 4 :paiva 5 :neste 5.0 :vesi 2.0}
     {:kk 4 :paiva 10 :neste 4.2 :vesi 2.5}
     {:kk 4 :paiva 15 :neste 4.0 :vesi 2.8}
     {:kk 4 :paiva 29 :neste 3.7 :vesi 2.0}
     {:kk 4 :paiva 30 :neste 3.7 :vesi 1.0}])

(defn lasku 
     (map (fn [x] (if (= (get x :kk) 4) (:kk (get x :kk) :paiva :neste ))) food-journal1))
     
; T3
; EI OLE AIVAN VALMIS!

(def food-journal2
  [{:kk 4 :paiva 5 :muuneste 3.0}
   {:kk 4 :paiva 10 :muuneste 1.7}
   {:kk 4 :paiva 15 :muuneste 1.2}
   {:kk 4 :paiva 29 :muuneste 1.7}
   {:kk 4 :paiva 30 :muuneste 2.7}])

(defn rakenne (into [] 
  (keep 
    (fn [x] 
      (if (= (get x :kk) 4) (:kk (get x :kk) :paiva (get x :paiva) :muuneste ))) food-journal2)))
(pritln rakenne)
