infix fun Int.diff(other:Int):Int {
    if(this > other) return this-other
    else return other-this
}

// ----- 함수 return
fun getbody(type:Int=0):()->Unit {
    if(type==0){
        return fun(){
            println("Hello")
        }
    } else {
        return fun(){
            println("Everyone")
        }
    }
}

// ----- 함수를 변수에 할당하기, 함수를 파라미터로 받기
fun foo(i:Int, f:(Int)->Int):Int{
    return f(i)
}

fun bar(i:Int): Int {
	return i*-1
}

// ----- 인라인 함수
fun runner(ex:()->Unit) {
    println("runner-1")
    ex()
    println("runner-2")
}

fun outer() {
    println("outer-2")
    runner{
        println("Lambda")
    }
    println("outer-2")
}

// ----- 뮤터블리스트
fun myMutableList() {
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)  
}

// ----- 뮤터블테이블셋
fun myMutableSet() {
	val testSet = mutableSetOf(1, 2, 3, 1)
    testSet.add(5)
    println(testSet.size)
    testSet.remove(1)
    println(testSet.size)
}


// ----- 뮤터블 맵
fun myMutableMap() {
	val numbersMap = mutableMapOf("one" to 1, "two" to "둘")
    numbersMap.put("three", "쓰리")
    numbersMap["one"] = "일"
    println(numbersMap)
}





fun main() {
	var diff = 3 diff 1		// 3.diff(1) 과 같음
    
    var f = getbody(0)
    f()
    f = getbody(1)
    f()
    
    
    val myFun = ::bar		// type 추론
    val myFun2: (Int)->Int = ::bar	// type 지정
    println(myFun(1))
    println(myFun(2))
    
    println(foo(3, fun(i:Int):Int {return i*-1}))
    println(foo(4, ::bar))
    
    
    outer()
    
    
    myMutableList()
    
    myMutableSet()
    
    myMutableMap()
}