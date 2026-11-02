import mediumZoom from "medium-zoom";

import {
  NolebaseEnhancedReadabilitiesMenu,
  NolebaseEnhancedReadabilitiesScreenMenu,
} from "@nolebase/vitepress-plugin-enhanced-readabilities/client";
import "@nolebase/vitepress-plugin-enhanced-readabilities/client/style.css";

import {
  NolebaseGitChangelogPlugin,
  InjectionKey as InjectionKeyGitChangelogPlugin,
} from "@nolebase/vitepress-plugin-git-changelog/client";
import "@nolebase/vitepress-plugin-git-changelog/client/style.css";

import type { App } from "vue";
import { onMounted, watch, nextTick, h } from "vue";

import { useRoute } from "vitepress";
import DefaultTheme from "vitepress/theme";

import "./style/index.css";

export default {
  extends: DefaultTheme,

  /* Nólëbase Integrations */
  Layout: () => {
    return h(DefaultTheme.Layout, null, {
      "nav-bar-content-after": () => h(NolebaseEnhancedReadabilitiesMenu),
      "nav-screen-content-after": () =>
        h(NolebaseEnhancedReadabilitiesScreenMenu),
    });
  },
  enhanceApp({ app }: { app: App }) {
    app.use(NolebaseGitChangelogPlugin);
    app.provide(InjectionKeyGitChangelogPlugin, {
      hideChangelogNoChangesText: true,
      displayAuthorsInsideCommitLine: true,
    });
  },

  setup() {
    const route = useRoute();

    /* Medium Zoom */
    const initZoom = () => {
      mediumZoom(".main img", { background: "var(--vp-c-bg)" });
    };
    onMounted(() => {
      initZoom();
    });
    watch(
      () => route.path,
      () => nextTick(() => initZoom())
    );
  },
};
