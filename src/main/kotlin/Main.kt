fun main(args: Array<String>) {

    val item = Item("Book", 10_000)
    println("Item name is ${item.name}, price is ${item.price}")

    item.buy()
    item.sell()
}

// 클래스, 생성자 -> Item(var name: String, val price: Int)
class Item(
    val name: String,
    val price: Int
) : ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}

// 인터페이스
interface ItemTrade {
    fun buy()
    fun sell()
}