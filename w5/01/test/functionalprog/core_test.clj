(:use projekti.core)
(:use  midje.sweet))

(ns lein-midje-proj.core-test
      (:use lein-midje-proj.core)
      (:use  midje.sweet)
)

(ns functionalprog.core-test
  (:require [clojure.test :refer :all]
            [functionalprog.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))


"T5"
(defn karkausvuodet [pr] 
  (= pr karkausvuosi?)
)
(karkausvuodet 200)
  

  
  (tabular "karkausvuosi? tehtävä 5 "
    (fact
      (karkausvuosi? ?vuosi) => ?expected)
      ?vuosi   ?expected
      100     false
      200     false
      400     true
      800     true
      2000    true
      2200    false
      12      true
      20      true
      15      false
      1913    false
  )
  
  