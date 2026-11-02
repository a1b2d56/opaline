---
# https://vitepress.dev/reference/default-theme-home-page
layout: home

hero:
  name: Opaline
  text: ColorOS 17 design for Compose Multiplatform
  tagline: Components, theming and the glass material, calibrated against the real system.
  image:
    src: /Icon.webp
    alt: Opaline logo
  actions:
    - theme: brand
      text: Getting Started
      link: /guide/getting-started
    - theme: alt
      text: Components
      link: /components/index
    - theme: alt
      text: Live Demo
      link: https://a1b2d56.github.io/opaline/example/
      target: _blank

features:
  - icon: 🫧
    title: ColorOS 17 Glass
    details: Bars, search, dialogs and sheets draw the system glass material over a backdrop blur, with solid fallbacks where shaders are unavailable.
    link: /guide/material
    linkText: Material guide
  - icon: 📐
    title: Calibrated, Not Guessed
    details: Colors, radii, metrics and motion are read from ColorOS 17 and every value cites the system resource it came from.
  - icon: 📦
    title: Rich Components
    details: Over 70 components, from buttons and switches to pickers, preferences, menus, dialogs and navigation.
    link: /components/index
    linkText: Browse components
  - icon: 🌐
    title: Cross-Platform
    details: One codebase for Android, iOS, macOS, Desktop and the Web via Compose Multiplatform.
    link: /guide/multiplatform
    linkText: Platform support
  - icon: 🧩
    title: Familiar API
    details: Shaped like Compose Material. Moving from Miuix or COUI is mostly a rename.
    link: /guide/migration
    linkText: Migration guide
  - icon: 🤝
    title: Open Source Lineage
    details: Built on Miuix and COUI under Apache-2.0, with their notices kept.
    link: /guide/credits
    linkText: Credits

nolebase:
  gitChangelog: false
  pageProperties: false
---
