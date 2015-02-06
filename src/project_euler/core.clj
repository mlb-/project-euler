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

; vim: fdm=indent
