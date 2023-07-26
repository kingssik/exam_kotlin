fun main(args: Array<String>) {

    val price: Int? = null

    if (price == null) {
        println("null check true")  // price가 null 일 경우 실행
    } else {
        println("price = $price")   // price가 null이 아닐 경우 실행
    }
}