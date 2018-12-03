 (defproject my-service "0.1.0-SNAPSHOT"
   :description "FIXME: write description"
   :dependencies [[org.clojure/clojure "1.8.0"]
                  [org.clojure/java.jdbc "0.7.8"]
                  [org.postgresql/postgresql "42.2.2"]
                  [metosin/compojure-api "1.1.11"]]
   :ring {:handler my-service.handler/app}
   :uberjar-name "server.jar"
   :profiles {:dev {:dependencies [[ring/ring-jetty-adapter "1.6.3"]
                                   [javax.servlet/javax.servlet-api "3.1.0"]]
                   :plugins [[lein-ring "0.12.0"]]}})
