# 22.11.21 과제 LOG
✏️ 2022.11.21 과제 LOG

# 변경사항

- 기초적인 HTML 구조 설계 완료
    1. 푸터, 헤더, 네비게이션 구조를 위한 3개의 vue 파일(`footerPage.vue`, `headerPage.vue`, `navPage.vue`)을 src/components 디렉터리 내부에 생성
    2. 각각의 `background-color`을 서로 다른 색으로 지정
    3. src/components 디렉터리 내부에 있는 `main.vue` 파일에 상기한 헤더, 푸터, 네비 vue 파일을 등록
- 각 .vue 파일마다 간단한 설명과 구현 예정 요소를 주석으로 추가
    - `footerPage.vue`
    - `headerPage.vue`
    - `navPage.vue`
    - `main.vue`
    - 설명 주석은 새로운 파일 생성, 또는 기존 코드 수정 시 지속적으로 작성 예정
- 코드 작성에 필요없는 파일(Vue-CLI 구성 시 기본 제공 요소 등) 제거
    - `HelloWorld.vue`
- 개인 GitHub에 코드 변경사항 모두 저장 완료
    - 링크: [https://github.com/jinDol99/2WDA_sophomore_2ndSemester](https://github.com/jinDol99/2WDA_sophomore_2ndSemester)
    - 2WDA_sophomore_2ndSemester/Web 2.0/portfolio_2022_parkjinseok 디렉터리에서 파일 확인 가능
- 개인 Notion 및 파일 내부의 markdown 형식으로 개인 프로젝트 진행사항 저장 완료
    - 링크: [https://www.notion.so/parkmoc21/Vue-11386af26ea249edbc4211550fe78fbc](https://www.notion.so/Vue-11386af26ea249edbc4211550fe78fbc)
    - 또는 `buildLog_22.11.21.md` 파일 참조 시 확인 가능

# 오류 및 해결법

## 화면이 어두워지며  `Failed to Compile` 에러가 나요!

### Module not found: Error: Can’t resolve ‘…’ in ‘C:\ … ‘

- 해당 디렉터리에서 요청한 모듈(파일)을 찾을 수 없다는 의미.
- 보통 특정 컴포넌트나 파일 등이 있는 디렉터리 주소를 잘못 입력하였을 때 나타남.
- .vue 파일에서 `<script>` 내부에 `import … from` 뒤의 디렉터리 위치가 제대로 잡혀있는지, 오타가 있는지, `/`, `./`, `../` 을 올바르게 사용했는지 점검하는 것이 좋음

## 화면에 일부 요소들만 출력되요!

- 특정 컴포넌트가 `export` 되지 않으면 발생
- .vue 파일에서 `<script>` 내부의 `export default { … }` 안 `component: { … }` 부분에 화면 출력에 필요한 컴포넌트가 누락되었는지 확인

## 화면에 아무것도 보이지 않아요!

- 컴포넌트가 `import` 되어있지 않거나, `export`한 컴포넌트의 이름이 잘못 되어있으면 발생
- .vue 파일에서 `<script>` 내부의 `export default { … }` 안 `component: { … }` 부분에 화면 출력에 필요한 컴포넌트 이름이 오타가 있는지 확인
- 위의 상황을 점검하였는데 문제가 없다면 .vue 파일의 `<script>` 태그 내부 또는 .js 파일 속에서 필요한 컴포넌트(vue 파일)가 누락되었는지 확인