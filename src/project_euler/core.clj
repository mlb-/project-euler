(ns project-euler.core)

(defn euler-1
  "Given a limit and multiplicands, find the sum of all multiples less than
  the limit. This, of course, does not include duplicate products."
  [limit & multiplicands]
  {:pre [(= 2 (count multiplicands))]}
  (->> multiplicands
       (map (partial range 0 limit))
       (apply concat)
       set
       (apply +)))

(defn- fibonacci
  "Provide a Clojure lazy-sequence for Fibonacci numbers."
  ([]
   (fibonacci 1 2))
  ([a b]
  (cons a (lazy-seq (fibonacci b (+ b a))))))

(defn euler-2
  "By considering the terms in the Fibonacci sequence whose values do not
  exceed four million, find the sum of the even-valued terms."
  [limit]
  (->> (fibonacci)
       (take-while (partial > limit))
       (filter even?)
       (apply +)))

; vim: fdm=indent
