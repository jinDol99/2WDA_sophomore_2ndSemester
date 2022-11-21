<!-- 
***** footerPage.vue - 22.11.21 생성 *****

 * 사용자의 개인 홈페이지 및 연락수단, 저작권 표기 등의 정보를 페이지 최하단에 출력하는 컴포넌트


***** 구현 예정 - 22.11.21 *****

 * 미리 저장된 아이콘과 텍스트를 간격에 맞게 출력 (v-for 활용)
    * 아이콘과 텍스트 데이터를 JSON 형태로 미리 저장
-->

<template>
    <div class="foot">
        <h1>{{ msg }}</h1>
    </div>
</template>
  
<script>
export default {
    name: 'footerPage',
    data() {
        return {
            msg: '푸터 TEST'
        }
    }
}
</script>

<style>
.foot {
    background-color: #454f50;
}
</style>
  