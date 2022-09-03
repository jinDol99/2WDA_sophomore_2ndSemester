// 현재 코틀린 기본 문법 유튜브 강의로 공부중...
// https://youtu.be/IDVnZPjRCYg

fun main() {
    helloWorld()

    println(add(4, 5))

}

fun helloWorld() : Unit {
    println("Hello World!")
}
/*********************
함수는 위와 같이     fun 함수명() : 리턴타입 {
                        실행할 코드들
                    }
의 형식으로 사용됨.
이 때, 리턴이 없는 경우는 Unit을 사용하지만 Unit 타입은 생략 가능함.
또한 실행할 코드가 한 줄이라면 중괄호( {} )도 생략 가능함.
**********************/

fun add(a : Int, b : Int) : Int {
    return a + b
}
/*
함수 선언 시 주의사항으로는, 파라미터명 뒤에 파라미터의 타입이 : Int 형식으로 쓰이고
함수의 리턴 타입도 파라미터 작성한 직후. 즉 함수의 body 직전에 입력해 줘야 함.
*/

fun hi() {
    val a : Int = 10
    var b : Int = 9
    println(a + b)
}

/*
변수를 선언하는 방법으로 아래 두 가지가 있음.
val 상수명 : 상수타입
var 변수명 : 변수타입

val은 value의 약자로, 변하지 않는 값. 즉 "상수"를 의미함.
var은 variable의 약자로, 변할 수 있는 값. 즉, "변수"를 의미함.

Int와 String 타입의 경우, 변수 타입을 굳이 적지 않아도 알아서 인식함.
하지만, val이냐 var이냐는 꼭 지정을 해줘야 함!
*/