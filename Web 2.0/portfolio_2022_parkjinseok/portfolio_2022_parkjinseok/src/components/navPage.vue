<template>
    <div class="nav">
        <h1>{{ msg }}</h1>
    </div>
</template>
  
<script>
export default {
    name: 'navPage',
    data() {
        return {
            msg: '네비게이션 테스트'
        }
    }
}
</script>

<style>
.nav {
    background-color: #00bdbd;
}
</style>