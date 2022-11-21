<template> 
    <div class="main">
        <headerPage></headerPage>
        <nav>
            <navPage></navPage>
        </nav>
        <main>
            <h1> MAIN 페이지 테스트</h1>
        </main>
        <footerPage></footerPage>
    </div>
</template>
  
<script>
import headerPage from './headerPage.vue';
import footerPage from './footerPage.vue';
import navPage from './navPage.vue';


export default {
    name: 'main',
    components: {
        headerPage,
        footerPage,
        navPage,
    },
    data() {
        return {
            msg: '메인 TEST'
        }
    },
}
</script>

<style>
.main {
    background-color: #edf6f5;
}
</style>
  