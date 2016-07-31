(ns webapp.components)


(defn navbar-component [content]
  [:div.layoutheader-transparent.mdl-layout.mdl-js-layout
   [:header.mdl-layout__header.mdl-layout__header--transparent
    [:div.mdl-layout__header-row
     [:span.mdl-layout-title "Portfolio"]
     [:div.mdl-layout-spacer]
     [:nav.mdl-navigation
      [:a.mdl-navigation__link {:href ""} "About"]
      [:a.mdl-navigation__link {:href ""} "Projects"]]]]
   [:div.mdl-layout__drawer
    [:span.mdl-layout-title "Portfolio"]
    [:nav.mdl-navigation
     [:a.mdl-navigation__link {:href ""} "About"]
     [:a.mdl-navigation__link {:href ""} "Projects"]]]
   [:main.mdl-layout__content
    [:div.content
     content]]])

