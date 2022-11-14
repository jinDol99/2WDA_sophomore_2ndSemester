// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'         // 같은 디렉터리의 App.vue 파일을 가져옴
import router from './router'   // router.js 또는 router.vue 파일을 가져옴. 만약 파일이 없다면
                                // router 디렉터리로 가서 index 파일을 가져옴
import HelloWorld from '@components/HelloWorld/'

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
