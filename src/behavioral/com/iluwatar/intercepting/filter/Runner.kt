package behavioral.com.iluwatar.intercepting.filter

class Client {
    lateinit var filterManager: FilterManager

    fun sendRequest(order: Order): String {
        return filterManager.filterRequest(order)
    }
}

fun main(args: Array<String>) {

    val filterChain = FilterChain()
    val filterManager = FilterManager(filterChain)
    filterManager.addFilter(NameFilter())
    filterManager.addFilter(ContactFilter())
    filterManager.addFilter(AddressFilter())
    filterManager.addFilter(DepositFilter())
    filterManager.addFilter(OrderFilter())

    val client = Client()
    client.filterManager = filterManager

    println(client.sendRequest(Order(
            name = "Utkan",
            contactNumber = "123456789",
            address = "Barfusßtrase",
            depositNumber = "A-123",
            orderItem = ""
    )))
}