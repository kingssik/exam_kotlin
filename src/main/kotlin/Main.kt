fun main(args: Array<String>) {

    val price: Int = 100

    when (price) {
        in 100..199 -> println("1. price = $price") // price 값이 해당 범위 내에 있을 경우 실행
        in 200..299 -> println("2. price = $price") // price 값이 해당 범위 내에 있을 경우 실행
        in 300..399 -> println("3. price = $price") // price 값이 해당 범위 내에 있을 경우 실행
        else -> println("4. Not")    // 위 조건에 해당하는 경우가 없을 때 실행
    }
}