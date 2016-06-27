(defproject gered/webtools.reagent "0.2-SNAPSHOT"
  :description  "Various helper functions and other things specifically for use in ClojureScript/Reagent applications."
  :url          "https://github.com/gered/webtools.reagent"
  :license      {:name "MIT License"
                 :url  "http://opensource.org/licenses/MIT"}

  :dependencies [[cljsjs/bootstrap "3.3.6-0"]
                 [cljsjs/react-bootstrap "0.29.2-0"]
                 [cljsjs/react-bootstrap-datetimepicker "0.0.22-0" :exclusions [org.webjars.bower/jquery]]
                 [cljsjs/react-select "1.0.0-beta13-0"]
                 [hiccup "1.0.5"]]

  :plugins      [[lein-cljsbuild "1.1.3"]]

  :profiles     {:provided
                 {:dependencies [[org.clojure/clojure "1.8.0"]
                                 [org.clojure/clojurescript "1.8.51"]
                                 [reagent "0.6.0-alpha2"]]}}

  :cljsbuild    {:builds
                 {:main
                  {:source-paths ["src"]}}})
