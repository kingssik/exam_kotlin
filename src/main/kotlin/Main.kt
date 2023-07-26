fun main(args: Array<String>) {

    var i: Int = 10
    var j: Int? = 10

    var k: String = "ABC"
    var l: String? = "ABC"

//    i = null    // 에러 발생(null 불허)
    j = null

//    k = null    // 에러 발생(null 불허)
    l = null

    println(i)  // 10
    println(j)  // null

    println(k)  // ABC
    println(l)  // null
}