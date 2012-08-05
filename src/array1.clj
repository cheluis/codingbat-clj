(ns array1)


(defn first-last-6 [arr]
  (or (= (first arr) 6) (= (last arr) 6))
  )


(defn same-first-last [arr]
  (and (> (count arr) 1)
    (and (= (first arr) (last arr)))
    )  
  
  )

(defn common-end [arr-a arr-b]
  (or (= (first arr-a) (first arr-b))    
    (= (last arr-b) (last arr-a)))
  )

(defn sum-3 [arr]
  (reduce (fn [a b] (+ a b)) arr)
  )


(defn reverse-3 [arr]
  (reverse arr)
  )

(defn max-end-3 [arr]
  (if (> (first arr) (last arr)) (repeat 3 (first arr)) (repeat 3 (last arr)))  
  )

