<template>
  <page>
      <iframe :src="apiUrl" width="1900em" height="1000em"></iframe>
  </page>
</template>

<script>
import Page from "@/components/Page";

export default {
  name: "API",
  components: {Page},
  data: function () {
    return {
      baiduUrl: "https://www.baidu.com/",
      testUrl: "https://segmentfault.com/q/1010000017204878",
      apiUrl: "http://114.67.168.56/doc/ClapSQL/api-1.0/index.html",
      githubUrl: "https://github.com/totoro-dev/ClapSQL"
    }
  }
}
</script>

<style scoped>

</style>
