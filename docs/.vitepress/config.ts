import { defineConfig } from "vitepress";
import locales from "./locales";
import {
  GitChangelog,
  GitChangelogMarkdownSection,
} from "@nolebase/vitepress-plugin-git-changelog/vite";

export default defineConfig({
  base: "/opaline/",
  title: "Opaline",
  locales: locales.locales,
  head: [
    ['meta', { name: 'color-scheme', content: 'light dark' }],
    ['link', { rel: 'icon', href: '/opaline/Icon.webp' }],
  ],
  markdown: {
    image: {
      lazyLoading: true,
    },
  },
  cleanUrls: true,
  // The dokka API reference lives in public/ as raw static HTML, invisible to
  // the dead-link checker which only knows VitePress pages.
  ignoreDeadLinks: [/\/dokka\//],
  themeConfig: {
    logo: "/Icon.webp",
    socialLinks: [
      { icon: 'github', link: 'https://github.com/a1b2d56/opaline' }
    ],
    search: {
      provider: "local",
    },
    docFooter: {
      prev: false,
      next: false,
    },
  },
  vite: {
    optimizeDeps: {
      exclude: [
        "@nolebase/vitepress-plugin-enhanced-readabilities/client",
        "vitepress",
        "@nolebase/ui",
      ],
    },
    ssr: {
      noExternal: [
        "@nolebase/vitepress-plugin-enhanced-readabilities",
        "@nolebase/ui",
      ],
    },
    plugins: [
      GitChangelog({
        repoURL: () => "https://github.com/a1b2d56/opaline",
      }),
      GitChangelogMarkdownSection({
        sections: {
          disableContributors: true,
        },
      }),
    ],
  },
});
