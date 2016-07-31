(ns webapp.app
  (:require
   [reagent.core :as reagent :refer [atom]]
   [webapp.components :as comps]))



(defn main-component []
  [:div
   [comps/navbar-component
    [:div
     [:span "some text"]
     [:div
      [:p "more text"]]]]])

(defn init []
  (reagent/render-component [main-component]
                            (.getElementById js/document "container")))
