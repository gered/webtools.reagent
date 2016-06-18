(ns webtools.reagent.components)

(defn ->keyed-comps
  [components]
  (map-indexed
    (fn [idx comp]
      (if (vector? comp)
        (with-meta comp {:key idx})
        comp))
    components))

(defn raw-html
  ([comp html-content]
   (raw-html comp nil html-content))
  ([comp props html-content]
   [comp (assoc props :dangerouslySetInnerHTML {:__html html-content})]))
