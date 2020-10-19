import Vue from 'vue'
import App from './App.vue'
import VueRouter from "vue-router"
import router from "@/router/router"
// 引入ElementUI
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import VueQuillEditor from "vue-quill-editor/src"
import mavonEditor from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'

// 引入axios
import axios from "axios"
Vue.prototype.$axios = axios

Vue.config.productionTip = false

Vue.use(VueRouter)

Vue.use(ElementUI)

Vue.use(VueQuillEditor)

Vue.use(mavonEditor)  //让Vue使用mavonEditor


new Vue({
  render: h => h(App),
  router
}).$mount('#app')
