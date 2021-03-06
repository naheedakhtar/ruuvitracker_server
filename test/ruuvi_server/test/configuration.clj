(ns ruuvi-server.test.configuration
  (:require [clojure.java.io :as io])
  (:use midje.sweet
        ruuvi-server.configuration)
  )

(fact (read-config (io/resource "ruuvi_server/test/dummy-config.clj")) => {:dummy1 1 :dummy2 "abc"})
(fact (read-config (io/resource "server-dev-config.clj")) => truthy )
(fact (read-config (io/resource "server-prod-config.clj")) => truthy )
