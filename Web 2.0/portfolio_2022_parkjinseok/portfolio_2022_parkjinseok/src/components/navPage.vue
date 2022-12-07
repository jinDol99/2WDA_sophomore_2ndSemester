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


***** 구현 일부 완료 - 22.12.07 *****
* 버튼 클릭 시 이벤트를 상위 컴포넌트(main.vue)로 전달 처리 완료
-->

<template>
    <div class="nav">
        <button class="navmenu" v-on:click="sendPageData(1)"> {{menu01}} </button>
        <button class="navmenu" v-on:click="sendPageData(2)"> {{menu02}} </button>
        <button class="navmenu" v-on:click="sendPageData(3)"> {{menu03}} </button>
    </div>
</template>
  
<script>
import Main from './main.vue';

export default {
    name: 'navPage',
    data() {
        return {
            menu01: '소개',
            menu02: '프로젝트',
            menu03: '기술 스택',
        }
    },
    methods: {
        sendPageData(num) {
            this.$emit('page', num)
        }
        // 부모 컴포넌트로 데이터를 전달하려면 this.$emit('이벤트명', 데이터) 의 형식으로 전달 가능
        // 참고 사이트: https://mchch.tistory.com/205
    },
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
    font-weight: bold;
    border: 0;
}
/* 자식 div 요소들을 수평 가운데 정렬하려면 부모 display 속성을 flex로하면 됨.
참고 사이트: https://wooncloud.tistory.com/10*/
</style>