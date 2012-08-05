(ns warmup2)

(defn string-times[cadena n]
  (reduce (fn [a b] (str a b)) (repeat n cadena))
  )


(defn times-front[cadena n]
  (reduce (fn [a b] (str a b)) (repeat n (subs cadena 0 3)))
 )


(defn string-bits[cadena]
  (apply str (take-nth 2 cadena))
  )


(defn array-count-9 [arr]
  (count
    (filter (fn[a] (= a 9)) 
      arr
      ))  
  )

(defn front-array-9[arr]
  ( > (count (filter (fn [a] (= a 9))
               (take 4 arr)
               ))
    0)
  )

(defn array-123 [arr]
  (not= 
    (some #{[1 2 3]} (partition 3 1 arr))
    nil
    )  
)