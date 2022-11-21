<template> 
    <div class="main">
        <headerPage></headerPage>
        <main>
            <h1> MAIN 페이지 테스트</h1>
        </main>
        <footerPage></footerPage>
    </div>
</template>
  
<script>
import headerPage from './headerPage.vue';
import footerPage from './footerPage.vue';

export default {
    name: 'main',
    components: {
        headerPage,
        footerPage,
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
  