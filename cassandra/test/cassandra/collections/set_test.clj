(ns cassandra.collections.set-test
  (:require [clojure.test :refer :all]
            [clojure.pprint :refer [pprint]]
            [cassandra.collections.set :refer :all]
            [cassandra.core-test :refer :all]
            [jepsen [core :as jepsen]
             [report :as report]]))

(deftest ^:set ^:steady cql-set-bridge
  (run-test! bridge-test))

(deftest ^:set ^:steady cql-set-isolate-node
  (run-test! isolate-node-test))

(deftest ^:set ^:steady cql-set-halves
  (run-test! halves-test))

(deftest ^:set ^:steady cql-set-crash-subset
  (run-test! crash-subset-test))

(deftest ^:set ^:steady cql-set-flush-compact
  (run-test! flush-compact-test))

