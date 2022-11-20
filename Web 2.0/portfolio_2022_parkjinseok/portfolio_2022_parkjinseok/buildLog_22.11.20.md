# 2022.11.20 과제 LOG

# 변경사항
1. vue-CLI를 통해 서버 구축 완료
2. 개인 GitHub에 변경사항 모두 저장 완료

# Vue-CLI 설치

Vue-CLI를 사용하여 서버를 구축하고 기존의 사용하던 Vue 프로젝트를 실행할 수 있음.

- Windows에서 cmd를 열어 `node -v` 그리고 `npm -v` 명령어를 입력하여 각각 node.js, npm(Node Project Management)이 설치되어 있는지 확인.
    - `16.15.0` 그리고 `8.5.5` 처럼 버전이 나오면 설치가 되어져 있는 것이고, 아니라면 `npm install -g vue-cli`를 입력하여 설치를 진행하면 됨
    - 만약 `run npm install … to update!` 라는 문구가 나오면 그대로 위 명령어를 입력하여 업데이트 설치를 진행하면 됨.
- 서버 구축 전, 원하는 곳에 새로운 폴더를 만들어 `cd` 명령어로 해당 디렉터리로 프롬프트를 이동시킴
- `vue init webpack petstore` 을 입력하여 방금 설치한 Vue-CLI에 웹팩 템플릿을 사용하여 애플리케이션을 만들라고 요청
- 이제 거의 설치가 완료되었음. 아래와 같은 입력사항 및 설정사항을 기입하면 됨.

<aside>
`? Project name`, `? Project description`, `? Author` 3가지 입력사항이 필요함. 각각 프로젝트 이름, 프로젝트 설명(Git 관리시 보임), 저자(보통 이메일을 지정)를 입력.
`Install vue-router?` → Vue 라우터 설치 여부 → **Y**
`Use ESLint to lint your code` → 자동으로 코드 교정하는 서비스. 설치할 경우 랙이 걸리는 경우가 있으므로 미설치 → **N**
`Set up unit tests` → 유닛 테스트를 하는 서비스 설치여부. → **Y**
`Pick a test runner` → 테스트를 할 때 어떤 방식으로 할 것인지 선택 → 화살표를 이용하여 **karma** 선택
`Setup e2e tests with Nightwatch?` → 테스트 시 야간 테스트 서비스를 시행할 것인가 선택 → **Y**
`Should we run ***…*** created? (recommend)?` → 화살표를 이용해 **npm** 선택

</aside>
- 잠시 기다려 설치가 완료 되면 `cd portfolio***...(기존 Project name에서 입력한것)`*** 명령어로 디렉터리를 변경하고 `npm run dev` 명령어로 새로운 서버를 구축하고 실행.
- `Your application is running here: http://localhost:8080` 처럼 나오는데 이 링크를 웹 브라우저에 입력하면 Vue.js 형태의 웹 서비스를 바로 실행할 수 있는 것을 확인할 수 있음.
- 이러한 cmd를 종료하면 자동으로 서버가 종료되며, 다시 실행시키기 위해서는 `cd` 명령어로 디렉터리 이동 후, `npm run dev` 를 입력하면 시간이 조금 지난 후 서버가 실행됨.

# Vue-CLI 디렉터리 구조와 설명

Vue-CLI를 통해 웹 페이지와 서버를 만들었다면 해당 디렉터리에 아래와 같은 파일과 폴더(디렉터리)가 만들어진 것을 확인할수 있음.

## src 디렉터리

- 웹페이지를 구성하는 여러 요소들이 담긴 디렉터리.
- 이 디렉터리 내부에서 사이트의 골격을 짜고, 컴포넌트를 생성하고, 함수를 짜는 대부분의 작업을 함.

### assets 디렉터리

- CSS 파일, 이미지 파일 같은 디자인 요소가 들어가 있는 디렉터리

### components 디렉터리

- MVC로 따지면 View에 해당하는 요소들이 모인 디렉터리.
- 화면에 출력되게 되는 작은 컴포넌트 요소들이 조각조각 나눠져 .vue 확장자로 관리되고 있음.


### router 디렉터리

- 웹 사이트에서 URL의 경로에 따라 어떤 페이지를 보여줄지 관리
- router 디렉터리 안의 index.js 파일이 위 기능을 담당하고 있으며, 아래와 같은 구조로 이루어짐

```jsx
import Main from '@/components/Main' // [07.] 아래에서 설정했던 두 개의 컴포넌트를
import Form from '@/components/Form' // import함. 이 파일은 components 디렉터리 안에
                                     //.vue 확장자로 구성된 파일로 만들면 됨.

Vue.use(Router)

export default new Router({
  mode: 'history',      // [01.]
  routes: [             // [02.]
    {
      path: '/',
      name: 'iMain',    // [03.]
      component: Main,  // [04.]
      props: true,      // [05.] 
    },
    {
      path: '/form', 
      name: 'form',
      component: Form,
      props: true,
			children: [       // [06.]
          {
              path: 'edit',
              name: 'Edit',
              component: EditProduct,
              props: true
          }
          // children: 한 컴포넌트(페이지) 내부의 서브 컴포넌트(페이지)를 만들 때 사용하는 객체로,
          // 
      ]            
    },
    {
      path: '*', 
      redirect: '/',        
    },
  ]
})
```

[01.] `mode: history` → 페이지 접속 시 hash, history 모드를 정할 수 있음. 페이지 로딩 방식의 차이가 있는데, 그냥 지금은 *“history 방식을 사용하기 위한 속성이구나”* 라고만 이해하고 넘어가자

[02.] `routes: [ ***…*** ]` → 각각의 URL 경로(`path` 속성 값)에 따라 `[ ***…*** ]` 내부에 있는 컴포넌트와 연결. 자바의 switch-case문이라고 생각하면 편함

[03.] `name: 'iMain',` → `path`가 `/`에 해당하는 모든 웹페이지를 `iMain` 이라는 이름을 가진 페이지와 연결하겠다는 의미. 이러한 페이지의 정보는 components 디렉터리 내부에 .vue 파일 속 `<script>` 태그로 지정할 수 있음.
참고로, 위의 `iMain`은 components/Main.vue 파일에서 확인 가능.

[04.] `component: Main,` → `path`가 `/`에 해당하는 모든 웹페이지를 `Main`이라는 이름을 가진 컴포넌트와 연결하겠다는 의미. 이 또한 components/Main.vue 파일에서 확인 가능.

[05.] `props: true,` → routes(현재 파일)의 여러 파라미터 값을 components로 넘겨 사용토록 설정. 이 예시에서는 대표적으로 components/Product.vue 파일에서 현재 product의 id값과 넘겨받은 URL의 id값을 비교하여 값을 반환하는데 쓰임.(39 라인)

[06.] `children: [ { ***…*** } ]` → 한 컴포넌트(페이지) 내부에서 서브 컴포넌트(페이지)를 만들때 사용. 이렇게 생성된 컴포넌트는 components/Product.vue의 <router-view> 태그에 보여지게 됨. 생성될 컴포넌트는 components/EditProduct.vue를 사용하려면 component 속성의 값으로 해당 파일의 이름을 입력하면 됨

# 오류 및 해결법

## CMD에서 서버 실행이 안되요!

`npm ERR! code ENOENT ...`
`... npm ERR! enoent This is related to npm not being able to find a file.`

- 위와 같은 Error 메시지들이 출력된다면 디렉터리가 제대로 인식하지 못한 경우가 많음.
- `cd` 명령어를 이용해 자신이 설정한 디렉터리를 정확히 입력 후, 다시 `npm run dev`를 하면 정상적으로 서버가 열림.