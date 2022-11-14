<template>                          <!-- 하나의 템플릿 하나에는 하나의 app 이름을 -->
  <div id="app">                    <!-- 가진 div 태그 하나만 올 수 있음.-->
    <img src="./assets/logo.png">
    <router-view/>
  </div>
</template>

<!-- <script scoped> scoped 속성을 사용하면 아래의 style 태그로 만들어진 -->
<!-- 스타일에 구애받지 않고 단독으로 사용할 수 있음 -->
<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
