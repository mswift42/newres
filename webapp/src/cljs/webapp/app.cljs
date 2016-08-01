(ns webapp.app
  (:require
   [reagent.core :as reagent :refer [atom]]
   [webapp.components :as comps]
   [webapp.res :as res :refer [sample-resume]]))



(defn main-component []
  [:div
   [comps/navbar-component
    [:div.maincontent
     [comps/about-component (:profile sample-resume)]]]])

(defn init []
  (reagent/render-component [main-component]
                            (.getElementById js/document "container")))
