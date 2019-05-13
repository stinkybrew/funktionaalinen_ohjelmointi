(ns p01.core
  (:gen-class))

; T1
  (defn addStyle 
      [style name] 
      (str name style)
  )
  
  (def muod 
      (partial addStyle "Terveisin "
      )
  )
  
  (def epamuod 
      (partial addStyle "Se o moro, "
      )
  )
  
  (def engmuod 
      (partial addStyle 
               "Best regards, "
      )
  )
  
  (def engepamuod
      (partial addStyle 
               "Eat my shorts, "
      )
  )

; T2
(def vektor [[1 2 3][4 5 6][7 8 9]])

(defn mini
  [vektori]
  (map #(apply min %) vektori)
)

(def minimivektori
  (vec (mini vektor)
  )
)

; T3
(def vampire-database
  {0 {:makes-blood-puns? false, :has-pulse? true  :name "McFishwich"}
   1 {:makes-blood-puns? false, :has-pulse? true  :name "McMackson"}
   2 {:makes-blood-puns? true,  :has-pulse? false :name "Damon Salvatore"}
   3 {:makes-blood-puns? true,  :has-pulse? true  :name "Mickey Mouse"}}
)

(defn lisaa-vampyyrikantaan 
    [db mbp hp nimi]
    (assoc db (+(apply max(keys db))1){:makes-blood-puns? mbp :has-pulse? hp :name nimi}) 
)

; T4
(defn poistakannasta
  [db key]
  (dissoc db key)
)

(poistakannasta vampire-database 2)

; T5
(def simaa 
  [{:aine "Vesi", :yksikko "litraa", :maara 4}
  {:aine "Sokeri", :yksikko "grammaa", :maara 500}
  {:aine "Sitruuna", :yksikko "kpl", :maara 2}
  {:aine "Hiiva", :yksikko "grammaa", :maara 1}])

(defn kerrat
  [arvo kerroin]
  (* arvo kerroin))

(def uusiresepti (map #(update % :maara kerrat 3) omasima))
(println uusiresepti)