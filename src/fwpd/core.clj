(ns fwpd.core)

(def filename "suspects.csv")

(defn parse
  "Convert a CSV into rows of columns"
  [input]
  (map #(clojure.string/split % #",")
       (clojure.string/split input #"\n")))
