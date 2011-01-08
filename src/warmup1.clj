(ns warmup1
  (:use clojure.contrib.math)
  )



(defn sleep-in[weekday vacation]
  (if (or (= weekday false) (= vacation true))  true false)
)

(defn monkey-trouble[a b]
  (if (or (and (= a false) (= b false)) (and (= a true) (= b true)))  true false)
  )

(defn sum-double[a b]
  (if (= a b) (* 2 (+ a a)) (+ a b))
  
  )

(defn diff-21[a]
  (if (>= a 21) (* 2 (abs (- a 21))) (abs (- a 21)))
  
  )

(defn parrot-trouble[talking hour]
  (if (and (or (< 7 hour) (> 20 hour)) (= talking true)) true false)
  )

(defn makes-10[a b]
  (if (or (or (= a 10)(= b 10))(= (+ a b) 10)) true false)
  )

(defn near-hundred[a]
  (if (or 
        (<= (abs(- 100 a)) 10)
        (<= (abs(- 200 a)) 10)) true false)
  )