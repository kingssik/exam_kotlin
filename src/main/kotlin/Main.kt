fun main(args: Array<String>) {

    // 함수
    val price1: Int = 100
    val price2: Int = 200

    val price3: Int = sumPrice(price1, price2)
    println("price3 = $price3") // price3 = 300
}

fun sumPrice(price1: Int, price2: Int): Int {
//    val price = price1 + price2
    return price1 + price2  // 이런 경우 함수를 정의할 때 fun sumPrice(price1: Int, price2: Int) = price1 + price2 라고 쓸 수 있다
}