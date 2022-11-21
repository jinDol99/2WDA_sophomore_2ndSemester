<!-- 
***** main.vue - 22.11.21 생성 *****

 * 메인 페이지를 담당하는 페이지.
 * 헤더와 네비게이션, 푸터는 같은 디렉터리의 .vue 파일에서 가져옴


***** 구현 예정 - 22.11.21 *****

 * main 페이지의 내용 채우기(v-if 활용)
    * v-if에 사용될 로컬 스토리지 구현

-->

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
  