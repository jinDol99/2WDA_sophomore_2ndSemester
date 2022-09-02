package com.examele.hello

fun sum(a:Int = 0, b:Int = 0): Int {
    return a + b
}

fun main() {
    println(sum(3, 5))
    
    println("------------")
    
    val year: Int = 2022
    println("Hello $year")
    
  	println("------------")
    
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
    
    println("------------")
    
    val array = Array(5){i->i}
    array.forEach { print("$it ") }
    println()
    println(array.any { it>5 })
    val filtered = array.filter { it > 2 }
    filtered.forEach { println("$it ") }
    
	println("------------")
    
    // 2장 5슬라이드
    val val1 = (1..5).random()
    val val2 = (1..5).random()
    println("val = $val1 | val2 = $val2")
    if (val1 > val2) println("$val1 > $val2")
    else println("$val2 > $val1")
    
    println("------------")
    
    // 2장 7슬라이드
    val value = (-5..5).random()
    val absValue = if (value < 0) value*-1 else value
    println("value = ${value}, abs = ${absValue}")
    
    println("------------")
    
    // 2장 8슬라이드
    val x = (1..3).random()
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
            println("x는 1도 2도 아니에오")
        }
    }
    
    println("------------")
    
    // 2장 9슬라이드
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }
    
    println("------------")
    
    //2장 10슬라이드
    val testNum1 (-1..1).random()
    when (testNum1) {
        0, 1 -> println("%testNum1 - pass")
        -1 -> println("%testNum1 - fail")
    }
    
    println("------------")
    
    // 2장 12슬라이드
    val score (0..100).random()
    var (grade) = when(score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("Scroe: $score, Grade:$grade")
    
    println("------------")
    
    // 2장 14슬라이드
    // 나중에 해보자ㅇㅇ
    
    println("------------")
    
    // 2장 16슬라이드
    val array = arrayOf(1, 2, 3, "a", "b", "c")
    array.forEach { it -> when(it) {
        is String -> 
    }}
    
}