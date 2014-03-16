(defproject tailrecursion/boot.core "2.2.2-SNAPSHOT"
  :description  "A script interpreter for Clojure. Also a build tool."
  :url          "https://github.com/tailrecursion/boot.core"
  :license      {:name  "Eclipse Public License"
                 :url   "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins      [[lein-marginalia                 "0.8.0-SNAPSHOT"]]
  :dependencies [[org.springframework/spring-core "1.2.2"]
                 [tailrecursion/warp              "0.1.0" :exclusions [org.clojure/clojure]]
                 [digest                          "1.4.3" :exclusions [org.clojure/clojure]]])
