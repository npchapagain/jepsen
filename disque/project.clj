(defproject jepsen.aerospike "0.1.0-SNAPSHOT"
  :description "Jepsen test for Disque"
  :url "https://github.com/aphyr/jepsen"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [jepsen "0.1.1-SNAPSHOT"]
                 [com.github.xetorthio/jedisque "0.0.4"]])
