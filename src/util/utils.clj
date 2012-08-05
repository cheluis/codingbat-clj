(ns util.utils)

(defn contains-not? [cadena]
  (if (= (subs cadena 0 3) "not") true false)
  )

(defn get-is-teen [a]
  (cond
    (and (and (>= a 13) (<= a 19)) (and (not= a 15) (not= a 16))) 0
    :else a    
    )
  
  )