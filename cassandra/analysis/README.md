## Cassandra Jepsen Tests Analysis

### Introduction

 My project as a Data Engineering Fellow at Insight Data Science involved researching distributed system failures. In particular, I explored the implications of the CAP Theorem on production-grade data stores, in terms of both architectural design and correctness. A core component of the project involved hands-on experience with [Jepsen](https://github.com/aphyr/jepsen), the well-regarded partitioning testing framework by Kyle Kingsbury (aka Aphyr). My most fruitful Jepsen experiments involved leveraging existing [Cassandra Jepsen tests](http://www.datastax.com/dev/blog/testing-apache-cassandra-with-jepsen) written by DataStax, a noted Cassandra vendor.
 The results of these test runs make up the core content of this directory.

 ### Contents

Published results are the direct output of the DataStax's that I merged together with current Jepsen IV reporting. They are subdivied first by tested version of Cassandara (2.1.14 & 2.2.6), then test type and associated consistency parameter tuning. Within these directories then, is the Jepsen reporting directories, further subdivided by defined Jepsen test and its nemesis type (eg `clock skew` or `isolate node`) High-lebel test types are as follows:

- batch update
- counters
- lightweight transactions (lwt)
- collections, including:
  - set
  - map

The semantics of most consistency parameter identifiers are dependent of above test type, with the exception of `_h/hints` and `_nh/nohints`. For all tests, these indicate, respectively, that [hinted_handoff](http://www.datastax.com/dev/blog/modern-hinted-handoff) is enabled and hinted_handoff is disabled.
