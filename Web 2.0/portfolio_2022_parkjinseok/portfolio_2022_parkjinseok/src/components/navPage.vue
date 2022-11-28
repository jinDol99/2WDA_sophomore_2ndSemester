<!-- 
***** main.vue - 22.11.21 생성 *****

 * 네이게이션 바를 담당하는 컴포넌트


***** 구현 예정 - 22.11.21 *****

 * 3개의 버튼 추가 (로컬 스토리지 활용)
    * 각각의 버튼에 알맞는 로컬 스토리지 값을 저장 및 출력하는 함수 구현
 * 스크롤되어도 네비게이션 바가 움직이지 않게 구현(fixed-position)


***** 구현 일부 완료 - 22.11.28 *****
* 3개 버튼 추가 및 정상 출력 완료
    * 버튼과 관련한 동작 요소는 구현 미완료. 추후 구현 예정

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
    display: flex;
    justify-content: center;
}
.navmenu {
    background-color: #b4e0e1;
    margin: 1%;
    padding: 1%;
    border-radius: 0.5rem;
    font-size: large;
    font-weight: bold;
}
/* 자식 div 요소들을 수평 가운데 정렬하려면 부모 display 속성을 flex로하면 됨.
참고 사이트: https://wooncloud.tistory.com/10*/
</style>