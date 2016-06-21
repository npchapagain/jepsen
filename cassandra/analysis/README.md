## Cassandra Jepsen Tests Analysis

### Introduction

 My work as a Data Engineering Fellow at Insight Data Science involved researching distributed system failures. In particular, I explored the implications of the CAP Theorem on production-grade data stores, in terms of both architectural design and correctness. A core component of the project involved hands-on experience with [Jepsen](https://github.com/aphyr/jepsen), the well-regarded partitioning testing framework by Kyle Kingsbury (aka Aphyr). My most fruitful Jepsen experiments involved leveraging existing [Cassandra Jepsen tests](http://www.datastax.com/dev/blog/testing-apache-cassandra-with-jepsen) written by DataStax, a noted Cassandra vendor.
 The results of these test runs make up the core contents of this directory. 
