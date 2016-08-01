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
    [:div.page-content
     content]]])

(defn section-component
  [content]
  [:div.singlecard
   [:div.mdl-card.mdl-shadow--2dp.subsection
    content]])

(defn about-component
  [description]
  [:div#profile {:class "profile"}
   [section-component
    [:div.profilecard
     [:div.profileheader.mdl-card__title
      [:h3 "About"]]
     [:div.profilecontent.mdl-card__supporting-text
      [:p description]]]]])
