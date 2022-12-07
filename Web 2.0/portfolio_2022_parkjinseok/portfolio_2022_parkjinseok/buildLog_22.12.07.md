# 22.12.07 과제 LOG

# 변경사항

- 네비게이션 컴포넌트(components/navPage.vue)의 버튼을 기존 `div` 형식에서 `button` 형식으로 변경
    - 디자인 요소는 변경사항 없음
- 버튼을 클릭할 때의 이벤트 추가 및 메인 컴포넌트(components/main.vue)와 바인딩 완료
    - 각각의 버튼을 클릭할 때 마다 다른 숫자를 `main.vue`에 전달
    - `main.vue`에 이벤트 핸들러를 추가하여 버튼 클릭 이벤트가 수신될 때 마다 같이 전달받는 숫자 데이터를 메인 컴포넌트의 변수(`page`)에 입력
- 메인 컴포넌트의 각 페이지 내용 보강
    - `page` 변수의 값에 따라 `v-if`문을 활용하여 페이지가 다르게 보이도록 설정
    - 각각의 페이지마다 보여지는 내용을 추가
    - 단, **새로운 vue 컴포넌트 페이지를 생성한 것이 아닌, `main.vue`에 하드코딩하는 방식을 택함.** 이는 추후 여유가 있을 때 수정 예정

# 기타사항

- 개인 GitHub에 코드 변경사항 모두 저장 완료
    - 링크: [https://github.com/jinDol99/2WDA_sophomore_2ndSemester](https://github.com/jinDol99/2WDA_sophomore_2ndSemester)
    - 2WDA_sophomore_2ndSemester/Web 2.0/portfolio_2022_parkjinseok 디렉터리에서 파일 확인 가능
- 개인 Notion 및 파일 내부의 markdown 형식으로 개인 프로젝트 진행사항 저장 완료
    - 링크: [https://www.notion.so/parkmoc21/Vue-11386af26ea249edbc4211550fe78fbc](https://www.notion.so/Vue-11386af26ea249edbc4211550fe78fbc)
    - 또는 `buildLog_22.12.07.md` 파일 참조 시 확인 가능
- **그 외의 구현 요소는 시간 상 해결하지 못함. 방학 기간 중 시간을 내어 페이지를 다듬고 남에게 보여줄 수 있을 만큼의 퀄리티로 코드를 보강하겠습니다.**