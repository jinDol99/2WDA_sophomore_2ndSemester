import Vue from 'vue'
import Router from 'vue-router'
import Form from '@/components/Form'
import Main from '@/components/Main'
import Product from '@/components/Product'
import EditProduct from '@/components/EditProduct'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'iMain',
      component: Main,
      props: true
    },
    {
      path: '/form',
      name: 'Form',
      component: Form,
      props: true
    },
    {
      path: '/product/:id',
      name: 'Id',
      component: Product,
      props: true,
      children: [
          {
              path: 'edit',
              name: 'Edit',
              component: EditProduct,
              props: true
          }
          // children: 한 컴포넌트(페이지) 내부의 서브 컴포넌트(페이지)를 만들 때 사용하는 객체로,
          // 이렇게 생성된 컴포넌트는 components/Product.vue의 <router-view> 태그에 보여지게 됨.
          // 생성될 컴포넌트는 components/EditProduct.vue를 사용하려면 component 속성의 값으로
          // 해당 파일의 이름을 입력하면 됨
      ]
    },
    {
      path: '*',
      redirect: '/'
    }
  ]
})
