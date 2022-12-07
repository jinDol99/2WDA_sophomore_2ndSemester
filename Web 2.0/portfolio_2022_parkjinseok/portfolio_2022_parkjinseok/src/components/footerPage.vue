<!-- 
***** footerPage.vue - 22.11.21 생성 *****

 * 사용자의 개인 홈페이지 및 연락수단, 저작권 표기 등의 정보를 페이지 최하단에 출력하는 컴포넌트


***** 구현 예정 - 22.11.21 *****

 * 미리 저장된 아이콘과 텍스트를 간격에 맞게 출력 (v-for 활용)
    * 아이콘과 텍스트 데이터를 JSON 형태로 미리 저장
-->

<!-- <a> 태그의 href 속성에서는 mustached 방식으로 바인딩 할 수 없음.
대안으로 v-bind:href (또는 :href) 디렉티브 아니면 @click 키워드를 사용하면 해결 가능. -->
<!-- 메일 링크를 입력할 때는 mailto: 속성을 사용하면 됨 -->

<template>
    <div class="foot">
        <hr>
        <div>
            <a :href="href.github">
                <img class="icons" src="../assets/github_logo.png">
            </a>
            <a v-bind:href="'mailto:' + href.email">
                <img class="icons" src="../assets/email_logo.png">
            </a>
            <a :href="href.notion">
                <img class="icons" src="../assets/notion_logo.png">
            </a>
        </div>
        <br>
        <p style="color: white;"> {{ copyright }}</p>
        
    </div>
</template>
  
<script>
export default {
    name: 'footerPage',
    data() {
        return {
            copyright: 'COPYRIGHT(C) 2WDA 2101107 박진석. ALL RIGHTS RESEVED.',
            href: {
                email: 'parkmoc21@gmail.com',
                github: 'https://github.com/jinDol99',
                notion: 'https://parkmoc21.notion.site/Vue-11386af26ea249edbc4211550fe78fbc',
            }
        }
    }
}
</script>

<style>
.foot {
    background-color: #454f50;
}

.icons {
    width: 50px;
    height: 50px;
}
</style>
  