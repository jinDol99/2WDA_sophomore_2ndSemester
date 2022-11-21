<!-- 
***** main.vue - 22.11.21 생성 *****

 * 네이게이션 바를 담당하는 컴포넌트


***** 구현 예정 - 22.11.21 *****

 * 3개의 버튼 추가 (로컬 스토리지 활용)
    * 각각의 버튼에 알맞는 로컬 스토리지 값을 저장 및 출력하는 함수 구현
 * 스크롤되어도 네비게이션 바가 움직이지 않게 구현(fixed-position)
-->

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