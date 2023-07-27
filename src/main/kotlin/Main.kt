fun main(args: Array<String>) {

    val item = Item("Book", 10_000)
    println("Item name is ${item.name}, price is ${item.price}")
}

// 클래스, 생성자 -> Item(var name: String, val price: Int)
class Item(
    val name: String,
    val price: Int
)

