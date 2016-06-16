(ns webtools.reagent.page
  (:require
    [hiccup.page :refer [include-css]]))

(defn include-bootstrap-metatags
  []
  (list
    [:meta {:charset "utf-8"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]))

(defn include-bootstrap-css
  [& [use-bootstrap-theme?]]
  (->> ["https://maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css"
        (if use-bootstrap-theme? "https://maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap-theme.min.css")
        "https://npmcdn.com/react-bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css"
        "https://npmcdn.com/react-select/dist/react-select.min.css"]
       (remove nil?)
       (apply include-css)))
