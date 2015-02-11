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

(deftest euler-3-test
  (testing "Prime generation"
    (is (= (take 11 (#'impl/primes))
           [2 3 5 7 11 13 17 19 23 29 31])))
  (testing "Prime factorization"
    (is (= (#'impl/prime-factorization 13195)
           [5 7 13 29])))
  (testing "Test problem"
    (is (= (euler-3 13195)
           29)))
  (testing "Actual problem"
    (is (= (euler-3 600851475143)
           6857))))

(deftest euler-4-test
  (testing "Palindronic number"
    (is (true? (#'impl/palindromic-number? 1221)))
    (is (true? (#'impl/palindromic-number? 12321)))
    (is (false? (#'impl/palindromic-number? 123)))
    (is (false? (#'impl/palindromic-number? 123210))))
  (testing "Actual problem"
    (is (= (euler-4)
           906609))))

; vim: fdm=indent
