fun main(args: Array<String>) {

    // 타입 추론 : kotlin은 타입추론으로 변수에 들어오는 값을 보고 타입을 알아서 지정해줌
    val s = "ABC"
    val i = 1
    val l = 1L
    val d = 1.0
    val f = 1.0f

    println("s = " + s::class)  // s = class java.lang.String (Kotlin reflection is not available)
    println("i = " + i::class)  // i = int (Kotlin reflection is not available)
    println("l = " + l::class)  // l = long (Kotlin reflection is not available)
    println("d = " + d::class)  // d = double (Kotlin reflection is not available)
    println("f = " + f::class)  // f = float (Kotlin reflection is not available)
}