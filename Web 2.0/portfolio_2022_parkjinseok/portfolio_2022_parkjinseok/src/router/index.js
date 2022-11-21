import Vue from 'vue'
import Router from 'vue-router'
import main from '@/components/main'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'main',
      component: main
    },
    // {
    //   path: '/introduce',
    //   name: 'footer',
    //   component: footer
    // },
    // {
    //   path: '/project',
    //   name: 'footer',
    //   component: footer
    // },
    // {
    //   path: '/skill',
    //   name: 'footer',
    //   component: footer
    // }
  ]
})
