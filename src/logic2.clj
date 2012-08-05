(ns logic2
  (:use util.utils)
  )


(defn make-bricks [small big goal]
  (let [sum-small (* small 1)
        sum-big (* big 5)
        ]
    (if (>= (+ sum-small sum-big) goal) true false)
    )  
  )

(defn lone-sum [a b c]
  (reduce (fn [a b] (+ a b)) (distinct [a b c]))
  
  )

(defn lucky-sum [a b c]
  (cond 
    (= c 13) (+ a b )
    (= b 13) a
    (= a 13) 0
    :else (+ a b c)    
    )
  )

(defn not-teen-sum [a b c]
  (+ (get-is-teen a) (get-is-teen b) (get-is-teen c))
  
  )