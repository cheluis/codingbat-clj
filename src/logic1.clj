(ns logic1
  (:use clojure.contrib.math)
  )

(defn cigar-party [cigars is_weekend]
  (cond 
    (= is_weekend true) true
    (and (>= cigars 40) (<= cigars 60)) true
    :else false
    )  
  )

(defn date-fashion [you date]
  (cond
    (or (>= you 8) (>= date 8)) 2
    (or (<= you 2) (<= date 2)) 0
    :else 1
    )  
  )

(defn squirrel-play [temp, is_summer]
  (cond
    (and (= is_summer true) (>= temp 60) (<= temp 100)) true
    (and (= is_summer false) (>= temp 60) (<= temp 90)) true
    :else false
    )
  
  )

(defn caught-speeding [speed is_bday]
  (cond
    (or (and (= is_bday false) (<= speed 60)) (and (= is_bday true) (<= speed 65))) 0
    (or (and (= is_bday false) (>= speed 81)) (and (= is_bday true) (< speed 86))) 2
    :else 1
    )
  
  )

(defn sorta-sum [a b]
  (let [sum (+ a b)]
    (cond
      (and (>= sum 10) (< sum 20)) 20
      :else sum
      )
    )
  )

(defn alarm-clock [day vacation]
  (cond
    (and (= vacation true) (and (>= day 1)(<= day 5))) "10:00"
    (and (= vacation true) (or (= day 0)(= day 6))) "off"
    (and (= vacation false) (and (>= day 1)(<= day 5))) "07:00"
    (and (= vacation false) (or (= day 0)(= day 6))) "10:00"    
    )  
  )

(defn love-6 [a b]
  (let [sum (abs (+ a b))
    res (abs (- a b))]
    (cond
      (or (= a 6) (= b 6)) true
      (= sum 6) true
      (= res 6) true
      :else false
      )    
    )  
  )

(defn in-1-to-10 [n outside-mode]
  (cond
    (and (= outside-mode false) (and (>= n 1)(<= n 10))) true
    (and (= outside-mode true) (or (<= n 1)(>= n 10))) true
    :else false
    )
  )

;;Necesita arreglarse.
(defn near-ten [n]
  (let [res (mod n 10)]
    (cond 
      (<= res 2) true
      :else false      
     )
    )
 )