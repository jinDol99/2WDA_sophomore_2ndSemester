fun main() {
   /*
    val array = IntArray(5) {
       it +3
   }
   println(array)
   */
   
   // 2~9까지의 값을 random 생성한 뒤 for 문으로 구구단 출력
   
   /*
   val gugu = (2..9).random()
   for (i in 1..9) {
       println("$gugu x $i = ${gugu*i}")
   }
   
   val myArr1 = Array(5) { it + 1 }
   for(( index, value) in array.withIndex()) {
       println("[${index}] $value")
   }
   */
   
//    do {
//        val myRandomVal1 = (-5..5).random()
//        print("$myRandomVal1 ")
//    } while (myRandomVal1 > 0)
//    println("$myRandomVal1")


	fun foo() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit
            print(it)
        }
        print("명시적 라벨을 붙인 람다식 출력 완료")
    }
}