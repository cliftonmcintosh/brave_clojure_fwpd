(ns fwpd.core-spec
  (:require [speclj.core :refer :all]
            [fwpd.core :refer :all]))


(def mock-csv
  (str "Edward Cullen,10"
       "\n"
       "Bella Swan,0"
       "\n"
       "Charlie Swan,0"
       "\n"
       "Jacob Black,0"
       "\n"
       "Carlisle Cullen,6"))

(def expected-parse-output
  '(["Edward Cullen" "10"]
    ["Bella Swan" "0"]
    ["Charlie Swan" "0"]
    ["Jacob Black" "0"]
    ["Carlisle Cullen" "6"]))

(describe "parse"
  (it "should convert a string into rows and columns"
    (should= expected-parse-output (parse mock-csv))))

(run-specs)
