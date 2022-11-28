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
        <div class="navmenu"> {{menu01}} </div>
        <div class="navmenu"> {{menu02}} </div>
        <div class="navmenu"> {{menu03}} </div>
    </div>
</template>
  
<script>
export default {
    name: 'navPage',
    data() {
        return {
            menu01: '소개',
            menu02: '프로젝트',
            menu03: '기술 스택',
        }
    }
}
</script>

<style>
.nav {
    background-color: green;
    display: flex;
    justify-content: center;
}
.navmenu {
    background-color: yellow;
    margin: 1%;
}
/* 자식 div 요소를 정렬하려면 부모 display 속성을 flex로하면 됨.
참고 사이트: https://wooncloud.tistory.com/10*/
</style>