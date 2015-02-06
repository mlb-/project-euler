(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest euler-1-test
  (testing "Example problem"
    (is (= (euler-1 10 3 5)
           23)))
  (testing "Actual problem"
    (is (= (euler-1 1000 3 5)
           233168))))

; vim: fdm=indent
