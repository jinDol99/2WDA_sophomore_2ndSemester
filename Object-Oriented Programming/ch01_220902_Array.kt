// 객체지향 프로그래밍2 - 1장. 기본 정보 및 문법

package com.examele.hello

/********* [7페이지] ********
패키지를 가져오는 것은 위처럼 package 키워드를 사용하면 됨.

주석은 맨 위와 현재 라인과 같이 Java에서 사용하는 두 개의 주석 방식을
그대로 사용 가능함. 참고로, /* */ 이러한 여러 줄 주석의 경우 중첩 사용 가능!
*************************/

/*************************
자바에서는 ==와 .equals()는 각각 참조 타입의 주소가 같은가, 값 자체가 같은가를 비교하지만
코틀린에서는 ==와 ===를 각각 값 자체가 같은가, 참조 타입의 주소가 같은가를 비교함.
자바에서의 예는 같은 디렉터리의 equalTest.java 파일을 참고할 것. 
*************************/



fun sum(a: Int = 0, b: Int = 0): Int {
    return a + b
}

fun minus(a: Int, b: Int) = a - b

/******** [8페이지] ********
함수는 fun 키워드를 사용하여 정의하며, 함수의 리턴 타입은 파라미터 뒤에 : 와 함께 작성
매개변수는 함수명 뒤 소괄호로 감싸여 변수명: 변수타입 = 초기화 의 형태로 작성됨

값을 반환하지 않는다면 리턴타입을 Int 대신 Unit(자바의 void와 비슷)을 사용할 수 있으며, 이는 생략 가능.
또한 위의 두 번째 함수처럼 표현식(expression)을 간략히 작성할 수 있음.
************************/

/******** [9페이지] ********
여기서 표현식(Expression), 그리고 서술문(Statement)을 자세히 알아보자
Statement - 진술, 서술, 서술문
    "실행"이 가능한 최소의 독립적인 코드로, for문 같은 제어문 등이 있음.

Expression - 식, 수식, 표현식
    Statement의 일부로, 평가를 통해 하나의 "값"이 되는 코드를 의미함. 수학 연산, 함수 호출 등이 있음.

쉽게 말해 return 값이 있으면 Expression, 없으면 Statement 라고 생각해도 됨.
************************/



fun valueAndVariableTest(num01: Int) {
    var year: Int = 1998
    val numberPI: Double = 3.141592
    println("오늘은 $year 년입니ㄷ...")
    year = num01
    println("아이고, 숫자를 잘못 셌네요. 정확한 연도는 $year 입니다.")
    println("원주율은 $numberPI 입니다.")
}
/********* [10페이지] ********
변수를 선언하는 방법으로 아래 두 가지가 있음.
    val 상수명 : 타입
    var 변수명 : 타입

val은 value의 약자로, 변하지 않는 값. 즉 "상수"를 의미함.
var은 variable의 약자로, 변할 수 있는 값. 즉, "변수"를 의미함.

Int와 String 타입의 경우, 변수 타입을 굳이 적지 않아도 알아서 인식함.
하지만, val이냐 var이냐는 꼭 지정을 해줘야 함!
*************************/



fun nullTypeTest(str: String) {
    var nullstr: String? = null
    println(if (nullstr != null) nullstr.length else "null값 입니다.")
    println(nullstr?.length)
    nullstr = str
    nullstr = nullstr!!
    println("null 값이 들어있는 nullstr 변수의 값을 $nullstr 으로 변경하였습니다.")

}
/********* [11페이지] ********
기본적으로 val과 var은 모두 null을 엄격히 허용하지 않음.
하지만 null을 허용하는 변수를 선언하고 싶을 때는 변수타입 뒤에 ? 연산자를 사용하면 됨.

단, ? 연산자로 생성된 변수에 null 을 넣을 순 있지만, 이를 가지고 계산하거나 출력. 즉, 사용하면 오류가 발생함.
null 값이 있는지 모르는 변수를 안전하게 대응하려면 출력할 때 if 또는 ? 연산자와 함께 맴버 함수(.length)를 사용하거나
변수명 뒤에 !! 키워드를 입력하여 일반 변수로 변환한 후 출력하면 됨. (단, 이 경우는 null 값이 없음을 확신할 때만 사용)
*************************/



fun numberTest() {

}
/********* [18페이지] *********
변수타입으로 여러가지 종류가 있음.
    Any - null을 제외한 모든 클래스의 최상위 객체로, 자바의 Object 객체와 비슷함.
    Byte, Short, Int, Long - 정수형 타입. 각각 1, 2, 4, 8 바이트의 크기를 가짐.
    UByte, UShort, UInt, ULong - 정수형 타입 중 하나. 위와 같지만 양수만 사용 가능한 특징. 앞의 U는 Unsigned의 약자.
    Float, Double - 실수형 타입.
*************************/



fun main() {
    println(sum(3, 5))
    println(minus(9, 7))
    
    println("------------")
    
    valueAndVariableTest(2022)
    
  	println("------------")

    nullTypeTest("HELLO")

    println("------------")



    println("------------")
    // val asc = Array(5) { i -> (i * i).toString() }
    // asc.forEach { println(it) }
    
    // println("------------")
    
    // val array = Array(5){i->i}
    // array.forEach { print("$it ") }
    // println()
    // println(array.any { it>5 })
    // val filtered = array.filter { it > 2 }
    // filtered.forEach { println("$it ") }
    
	// println("------------")
    
    // // 2장 5슬라이드
    // val val1 = (1..5).random()
    // val val2 = (1..5).random()
    // println("val = $val1 | val2 = $val2")
    // if (val1 > val2) println("$val1 > $val2")
    // else println("$val2 > $val1")
    
    // println("------------")
    
    // // 2장 7슬라이드
    // val value = (-5..5).random()
    // val absValue = if (value < 0) value*-1 else value
    // println("value = ${value}, abs = ${absValue}")
    
    // println("------------")
    
    // // 2장 8슬라이드
    // val x = (1..3).random()
    // when (x) {
    //     1 -> println("x == 1")
    //     2 -> println("x == 2")
    //     else -> {
    //         println("x is neither 1 nor 2")
    //         println("x는 1도 2도 아니에오")
    //     }
    // }
    
    // println("------------")
    
    // // 2장 9슬라이드
    // when (x) {
    //     0, 1 -> println("x == 0 or x == 1")
    //     else -> println("otherwise")
    // }
    
    // println("------------")
    
    // //2장 10슬라이드
    // val testNum1 (-1..1).random()
    // when (testNum1) {
    //     0, 1 -> println("%testNum1 - pass")
    //     -1 -> println("%testNum1 - fail")
    // }
    
    // println("------------")
    
    // // 2장 12슬라이드
    // val score (0..100).random()
    // var (grade) = when(score){
    //     in 90..100 -> "A"
    //     in 80..89 -> "B"
    //     in 70..79 -> "C"
    //     in 60..69 -> "D"
    //     else -> "F"
    // }
    // println("Scroe: $score, Grade:$grade")
    
    // println("------------")
    
    // // 2장 14슬라이드
    // // 나중에 해보자ㅇㅇ
    
    // println("------------")
    
    // // 2장 16슬라이드
    // val array = arrayOf(1, 2, 3, "a", "b", "c")
    // array.forEach { it -> when(it) {
    //     is String -> 
    // }}
    
}