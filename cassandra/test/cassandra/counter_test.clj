(ns cassandra.counter-test
  (:require [clojure.test :refer :all]
            [clojure.pprint :refer [pprint]]
            [cassandra.counter :refer :all]
            [cassandra.core-test :refer :all]
            [jepsen [core :as jepsen]
             [report :as report]]))

;; Regular tests without cluster composition changes
(deftest ^:counter ^:steady cql-counter-inc-bridge
  (run-test! bridge-inc-test))

(deftest ^:counter ^:steady cql-counter-inc-isolate-node
  (run-test! isolate-node-inc-test))

(deftest ^:counter ^:steady cql-counter-inc-halves
  (run-test! halves-inc-test))

(deftest ^:counter ^:steady cql-counter-inc-crash-subset
  (run-test! crash-subset-inc-test))

(deftest ^:counter ^:steady cql-counter-inc-flush-compact
  (run-test! flush-compact-inc-test))

(deftest ^:counter ^:steady cql-counter-inc-dec-bridge
  (run-test! bridge-inc-dec-test))

(deftest ^:counter ^:steady cql-counter-inc-dec-isolate-node
  (run-test! isolate-node-inc-dec-test))

(deftest ^:counter ^:steady cql-counter-inc-dec-halves
  (run-test! halves-inc-dec-test))

(deftest ^:counter ^:steady cql-counter-inc-dec-crash-subset
  (run-test! crash-subset-inc-dec-test))

(deftest ^:counter ^:steady cql-counter-inc-dec-flush-compact
  (run-test! flush-compact-inc-dec-test))

