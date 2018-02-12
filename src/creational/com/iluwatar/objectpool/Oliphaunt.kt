package creational.com.iluwatar.objectpool

data class Oliphaunt(private var id: Int = -1) {
    init {
        if (id == -1) {
            id = 0
        }
        id = counter++
        try {
            Thread.sleep(1000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    companion object {
        private var counter = 1
    }
}
