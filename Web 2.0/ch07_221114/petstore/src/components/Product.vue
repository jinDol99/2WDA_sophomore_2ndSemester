<template>
  <div>
    <my-header></my-header>
    <h1>id {{$route.params.id}} 입니다.</h1>
    <div class="row">
      <div class="col-md-5 col-md-offset-0">
        <figure>
          <img class="product" v-bind:src="product.image">
        </figure>
      </div>
      <div class="col-md-6 col-md-offset-0 description">
        <h1>{{product.title}}</h1>
        <p v-html="product.description"></p>
        <p class="price">{{product.price}}</p>
        <button @click="edit">상품 수정</button>
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

<script>
import MyHeader from './Header.vue'
export default {
  components: { MyHeader },
  data() {
    return {
      product: ''
      // [02.] [01.]에서 가져온 데이터를 화면에 출력
    }
  },
  methods: {
    edit() {
      this.$router.push({name: 'Edit'})
    }
  },
  created: function() {
    axios.get('/static/products.json')
    .then((response) => {
      this.product = response.data.products.filter(data => data.id == this.$route.params.id)[0];
      // [01.] JSON 파일(static/products.json)에서 모든 데이터를 가져온 후 id값을 비교하여
      // 현재 id와 같은 값만 필터링(filter) 해서 그 값을 배열에 저장한 후, 그 배열의 0번째 인덱스를
      // 현재 product 객체에 저장. 이는 [02.] 에서 그대로 출력함
      this.product.image = '/' + this.product.image;
    });
  }
}
</script>
