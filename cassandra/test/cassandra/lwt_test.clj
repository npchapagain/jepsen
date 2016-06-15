(ns cassandra.lwt-test
  (:require [clojure.test :refer :all]
            [clojure.pprint :refer [pprint]]
            [cassandra.lwt :refer :all]
            [cassandra.core-test :refer :all]
            [jepsen [core :as jepsen]
             [report :as report]]))

;; Steady state cluster tests
(deftest ^:lwt ^:steady lwt-bridge
  (run-test! bridge-test))

(deftest ^:lwt ^:steady lwt-isolate-node
  (run-test! isolate-node-test))

(deftest ^:lwt ^:steady lwt-halves
  (run-test! halves-test))

(deftest ^:lwt ^:steady lwt-crash-subset
  (run-test! crash-subset-test))

(deftest ^:lwt ^:steady lwt-flush-compact
  (run-test! flush-compact-test))

(deftest ^:clock lwt-clock-drift
  (run-test! clock-drift-test))

