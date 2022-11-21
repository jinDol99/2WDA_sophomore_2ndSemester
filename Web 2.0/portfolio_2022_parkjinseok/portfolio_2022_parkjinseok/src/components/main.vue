<template>
    <div class="main">
        <header></header>
        <h1> MAIN 페이지 테스트</h1>
        <footer></footer>
    </div>
</template>
  
<script>
import header from '@/components/header';
import footer from '@/components/footer';

export default {
    name: 'main',
    components: {
        header: 'header',
        footer: 'footer',
    },
    data() {
        return {
            msg: '메인 TEST'
        }
    }
}
</script>

<style scoped>
h1,
h2 {
    font-weight: normal;
}

ul {
    list-style-type: none;
    padding: 0;
}

li {
    display: inline-block;
    margin: 0 10px;
}

a {
    color: #42b983;
}

.main {
    background-color: #edf6f5;
}
</style>
  