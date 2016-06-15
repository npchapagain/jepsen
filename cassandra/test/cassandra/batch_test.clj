(ns cassandra.batch-test
  (:require [clojure.test :refer :all]
            [clojure.pprint :refer [pprint]]
            [cassandra.batch :refer :all]
            [cassandra.core-test :refer :all]
            [jepsen [core :as jepsen]
             [report :as report]]))

;; Steady state cluster tests
(deftest ^:batch ^:steady batch-bridge
  (run-test! bridge-test))

(deftest ^:batch ^:steady batch-isolate-node
  (run-test! isolate-node-test))

(deftest ^:batch ^:steady batch-halves
  (run-test! halves-test))

(deftest ^:batch ^:steady batch-crash-subset
  (run-test! crash-subset-test))

(deftest ^:batch ^:steady batch-flush-compact
  (run-test! flush-compact-test))

(deftest ^:clock batch-clock-drift
  (run-test! clock-drift-test))

