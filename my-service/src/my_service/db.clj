(ns my-service.db
  (:require [clojure.java.jdbc :as j]))

(def pg {:dbtype "postgresql"
         :dbname "foo"
         :host "localhost"
         :port 55432
         :user "postgres"})

(defn test []
  (j/query pg "select 3*5 as jotain"))

(defn next-number [x]
  (println "next-number called, x = " x)
  (->> x
       (vector "select 1+? as result")
       (j/query pg)
       first
       :result))
