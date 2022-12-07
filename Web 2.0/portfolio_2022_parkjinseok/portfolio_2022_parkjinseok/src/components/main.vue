<!-- 
***** main.vue - 22.11.21 생성 *****

 * 메인 페이지를 담당하는 페이지.
 * 헤더와 네비게이션, 푸터는 같은 디렉터리의 .vue 파일에서 가져옴


***** 구현 예정 - 22.11.21 *****

 * main 페이지의 내용 채우기(v-if 활용)
    * v-if에 사용될 로컬 스토리지 구현


***** 구현 완료 - 22.12.07 *****
 * navPage.vue에서 전달받은 이벤트를 수신하는 이벤트 핸들러 추가
 * v-if 구현. 단, 로컬 스토리지가 아닌 내부 변수를 이용함
 * 각 페이지마다의 내용 추가 완료. 단, 각각의 컴포넌트를 새로 생성한 방식이 아닌 현재 컴포넌트(main.vue)에서 모두 작성함

-->

<template>
    <div class="main">
        <headerPage></headerPage>
        <nav>
            <navPage @page="setPage"></navPage>
            <!-- 컴포넌트 명시 태그 부분에 이벤트 핸들러를 위와 같이 추가한 후, 이벤트 발생 시
            실행할 동작을 method 부분에 함수의 형태로 제작하면 컴포넌트간 데이터 전달 완료! -->
        </nav>
        <main>
            <div v-if="(page == 1)">
                <h1> 소개 페이지 </h1>
                <p> 개인 인적사항, 학력, 자격증 등을 한 번에 보여주는 소개 페이지 입니다. </p>
                <hr>
                <div style="text-align: left;">
                    <b>초기 구상:</b>
                    <ul>
                        <li>장문을 글을 사용하는 것보다는 아이콘 또는 도표, 차트 등 시각적 요소를 활용</li>
                    </ul>
                </div>
            </div>

            <div v-else-if="(page == 2)">
                <h1> 프로젝트 페이지 </h1>
                <p> 현재까지 시행했었던 그룹 및 개인 프로젝트를 보여주는 페이지 입니다. </p>
                <hr>
                <div style="text-align: left;">
                    <b>초기 구상:</b>
                    <ul>
                        <li>프로젝트 기간, 사용 기술, 사진을 간단히 출력</li>
                        <li>프로젝트의 결과 및 상세 내용은 푸터의 아이콘과 같이 github 또는 notion 링크 처리</li>
                        <li>v-for을 활용하여 여러 개의 프로젝트를 리스트업</li>
                    </ul>
                </div>
            </div>

            <div v-else-if="(page == 3)">
                <h1> 기술 스택 페이지 </h1>
                <p> 활용할 수 있는 기술을 종류별로 나눠 개인의 능력을 어필하는 페이지 입니다. </p>
                <hr>
                <div style="text-align: left;">
                    <b>초기 구상:</b>
                    <ul>
                        <li>Java, Linux, HTML 등 기술 스택과 Github, VS Code, SourceTree 등 개발에 필요한 도구를 종류별로 나눠 리스트업</li>
                        <li>리스트가 많아질 경우 프론트엔드/백엔드, IDE/VCS 처럼 카테고리를 나눠 정렬</li>
                        <li>v-for을 활용하여 여러 개의 요소들을 리스트업</li>
                    </ul>
                </div>
            </div>

            <div v-else>
                <h1> 메인 페이지 </h1>
                <p> 개인 포트폴리오 웹사이트의 메인 페이지입니다.</p>
                <p> 위의 3개의 버튼 중 원하는 버튼을 클릭하여 특정 메뉴로 이동해보세요!</p>
            </div>
            
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
            msg: '메인 TEST',
            page: 0,
        }
    },
    methods: {
        setPage(num) {
            this.page = num
        }
    }
}
</script>

<style>
.main {
    background-color: #edf6f5;
}
.goback {
    background-color: #b4e0e1;
    margin: 1%;
    padding: 1%;
    border-radius: 0.5rem;
    border: 0;
}
</style>
  