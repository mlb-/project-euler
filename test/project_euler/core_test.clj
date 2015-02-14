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

(deftest euler-5-test
  (testing "Greatest common divisor"
    (is (= (#'impl/greatest-common-divisor 2345 2345)
           2345)
        (= (#'impl/greatest-common-divisor 3 0)
           (#'impl/greatest-common-divisor 0 3)
           (#'impl/greatest-common-divisor 21 6)
           (#'impl/greatest-common-divisor 6 21)
           3)))
  (testing "Least common multiple"
    (is (= (#'impl/least-common-multiple 17 17)
           17))
    (is (= (#'impl/least-common-multiple 23 7)
           161))
    (is (= (#'impl/greatest-common-divisor 21 6)
           3)))
  (testing "Test problem"
    (is (= (euler-5 10)
           2520)))
  (testing "Actual problem"
    (is (= (euler-5 20)
           232792560))))

(deftest euler-6-test
  (testing "Triangular numbers"
    (is (= (#'impl/triangle-number 11)
           66)))
  (testing "Square pyramidal number"
    (is (= (#'impl/square-pyramidal-number 11)
           506)))
  (testing "Test problem"
    (is (= (euler-6 10)
           2640)))
  (testing "Actual problem"
    (is (= (euler-6 100)
           25164150))))

(deftest euler-7-test
  (testing "Test problem"
    (is (= (euler-7 6)
           13)))
  (testing "Actual problem"
    (is (= (euler-7 10001)
           104743))))

(deftest euler-8-test
  (testing "Test problem"
    (is (= (euler-8 4)
           5832)))
  (testing "Actual problem"
    (is (= (euler-8 13)
           23514624000))))

(deftest euler-9-test
  (testing "Power set"
    (is (= (#'impl/power-set [1 2 3])
           [[] [1] [2] [1 2] [3] [1 3] [2 3] [1 2 3]])))
  (testing "Factors"
    (is (= (#'impl/factors (#'impl/prime-factorization 80))
           #{1 2 4 5 8 10 16 20 40 80})))
  (testing "Coprime Factors"
    (is (= (#'impl/coprime-factors (#'impl/prime-factorization 90))
           [2 5 9 10 18 45]))))

; vim: fdm=indent
