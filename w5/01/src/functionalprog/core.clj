(ns functionalprog.core)

(defn name
  [y]
  (println y " is your name!")))
(defn foo
  "I don't do a whole lot."
  [x]
  [name]
  (println x "Hello, World!"))

  (println (* 2 5(+ 4))
  (println (+ 1 2 3 4 5))

((fn [name] 
  (str "Tervetuloa Tylypahkaan " name)
) "wille")


(def m {:a 1 :b 2})

(def names {:name {:first "Urho" :middle "Kaleva" :last "Kekkonen"}})

(println (get ["a" {:name {:middle}} "c"] 1))

(-> {:name {:first "Urho" :middle "Kaleva" :last "Kekkonen"}} :name :middle)


(defn square [x]
  (* x x)
)
(square 2)




  