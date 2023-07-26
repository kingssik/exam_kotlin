fun main(args: Array<String>) {

    val price: Int = 100

    if (price in arrayOf(100, 200, 300)) {    
        println("contain")    // price의 값이 100, 200, 300 중에 있을 경우 실행
    } else {
        println("not contained")     // price의 값이 100, 200, 300 중에 없을 경우 실행
    }
}
