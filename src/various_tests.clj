(ns various-tests
  (:require [clojure.test :refer [deftest is testing]]
            [greenlight.test :as greenlight]
            [greenlight.step :refer [defstep]]
            [greenlight.runner :as runner]
            ))

;;; CLOJURE.TEST TESTS ;;;

(deftest test1
  ; put cursor here and invoke "Run Test1 in REPL"
  (is (= 1 1)))

(deftest test2
  ; TODO how to use the new Cursive test runner feature in the REPL?
  (is (= 1 1)))

;;; GREENLIGHT TESTS ;;;

(comment
  ; put cursor on the form below and invoke "Send to REPL" to run greenlight test
  ; this reports greenlight test results
  (test3)
  )

(greenlight/deftest test3
  ; TODO how to run greenlight tests using Cursive?
  (step1))

(defstep step1
  :test (fn [inputs]
          (is (= 1 1))))
