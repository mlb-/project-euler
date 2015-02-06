(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core
             :as impl
             :refer :all]))

(deftest euler-1-test
  (testing "Example problem"
    (is (= (euler-1 10 3 5)
           23)))
  (testing "Actual problem"
    (is (= (euler-1 1000 3 5)
           233168))))

(deftest euler-2-test
  (testing "Fibonacci"
    (is (= (take 10 (#'impl/fibonacci))
           [1 2 3 5 8 13 21 34 55 89])))
  (testing "Test problem"
    (is (= (euler-2 89)
           44)))
  (testing "Actual problem"
    (is (= (euler-2 (int 4e6))
           4613732))))

; vim: fdm=indent
