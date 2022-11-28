# 22.11.28 과제 LOG

# 변경사항

- 네비게이션 컴포넌트(components/navPage.vue)의 3개의 `div` 형식 버튼 추가
    - 글꼴 형식, 배경 색 설정 완료
    - 요소 정상 출력 테스트 완료
    - 버튼과 관련된 동작 요소는 구현 미완료. 추후 구현 예정
- `main.vue`, `navPage.vue` 의 `style` 요소 개선
    - 배경색 및 요소 색상 통일 완료
- 오류 해결 완료: `'webpack-dev-server'은(는) 내부 또는 외부 명령, 실행할 수 있는 프로그램, 또는 배치 파일이 아닙니다.`
    - 기존 PC가 아닌 다른 PC에서 서버 실행시 해당 오류가 지속적으로 발생
    - 경로 문제로 인해 `webpack`과 관련된 파일 또는 모듈이 발견하지 못했거나 환경변수에 npm이 등록되어 있지 않을 때 발생하는 원인 파악 완료
    - `npm install --dev` 명령어를 통해 `dev` Dependencie(의존)을 제외하여 설치하는 옵션을 걸어  npm 모듈을 재설치한 후 다시 `npm run dev`를 하면 정상적으로 서버가 열림
        - ⚠️ 위 명령어에 대한 설명은 여러 사이트를 검색하여 추측한 내용임. 정확한 것은 아니므로 해당 명령어에 대한 자세한 정보는 추후에 알아 볼 예정
    - 참고 사이트: https://kmhan.tistory.com/321, https://docs.npmjs.com/cli/v6/commands/npm-install


# 기타사항

- 개인 GitHub에 코드 변경사항 모두 저장 완료
    - 링크: https://github.com/jinDol99/2WDA_sophomore_2ndSemester
    - 2WDA_sophomore_2ndSemester/Web 2.0/portfolio_2022_parkjinseok 디렉터리에서 파일 확인 가능
- 개인 Notion 및 파일 내부의 markdown 형식으로 개인 프로젝트 진행사항 저장 완료
    - 링크: https://www.notion.so/Vue-11386af26ea249edbc4211550fe78fbc
    - 또는 `buildLog_22.11.28.md` 파일 참조 시 확인 가능
- 그 외의 구현 요소는 시간 상 해결하지 못함. 타 프로젝트가 끝나는 **12월 2일(금) 이후 본격적으로 진행 예정**.