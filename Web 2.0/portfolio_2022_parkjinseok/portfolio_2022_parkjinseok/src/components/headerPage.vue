<!-- 
***** headerPage.vue - 22.11.21 생성 *****

 * 페이지 최상단에 보이는 페이지 안내 컴포넌트


***** 구현 예정 - 22.11.21 *****

 * 간단한 소개말 추가
 * 스크롤되어도 헤더가 움직이지 않게 구현(fixed-position)

-->

<template>
    <div class="head">
        <h1>{{ msg }}</h1>
    </div>
</template>
  
<script>
export default {
    name: 'headerPage',
    data() {
        return {
            msg: '개인 포트폴리오 페이지 - 2101107 박진석'
        }
    }
}
</script>

<style>
.head {
    background-color: #b4e0e1;
}
</style>
  