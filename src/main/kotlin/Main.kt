fun main(args: Array<String>) {

    val price: Int = 100

    when (price) {
        100 -> println("1. price = $price") // price 값이 100일 경우 실행
        200 -> println("2. price = $price") // price 값이 200일 경우 실행
        300 -> println("3. price = $price") // price 값이 300일 경우 실행
        else -> println("4. Not")    // 조건에 해당하는 price 값이 없을 경우 실행
    }
}