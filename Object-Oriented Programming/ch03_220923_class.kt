class Test {
    // nothing!
}

open class Position(var x: Int, var y: Int) {	// open: 클래스를 "상속 가능한 클래스"로 만드는 키워드
	//init { println("($x, $y)") }				// 18-실습 에서는 print 코드 삭제
    constructor(n:Int): this(n,n){}
    open fun printValue() {
        println("($x, $y)")
    }
    open val dimension = 2
}

class TPosition(x:Int, y:Int, var z: Int) : Position(x, y) {
    override val dimension = 3
    override fun printValue() {
        println("($x, $y, $z)")
    }
    
}	
// Position 클래스를 상속받아 새로운 자식 클래스를 만듦


open class Student(id: String, name: String, year: Int) {
    lateinit var name: String
    var enteranceYear:Int = 0
    val group: String by lazy {
		group = (1..5).random()
    }
    
    set(year) {
        if(year < 1950) field = 1950
        else field = year  
    }
    init {
        entranceYear = year
    }

    constructor(id:String, name:String, year:Int):this(id, year) {
        this.name = name
    }

    fun initName(n:String) {
        name = n
    }

    override fun toString(): string{
            if(::name.isInitialized)
        return "$id, $name, $entranceYear"
            else
        return "$id, $entranceYear"
    }
}

fun main() {
   val t = Test()
   
   val p1 = Position(0, 0)
   val p2 = Position(10, 10)
   val p3 = Position(3)
   p2.printValue()
   val p4 = TPosition(0, 0, 0)
   p4.printValue()
   
   
   val s = Student("123", 2020)
   println(s)
   s.initName("ABC")
   println(s)
}