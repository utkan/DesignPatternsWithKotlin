package creational.com.iluwatar.monostate

class LoadBalancer {

    val noOfServers: Int
        get() = servers.size

    fun addServer(server: Server) {
        synchronized(servers) {
            servers.add(server)
        }
    }

    @Synchronized
    fun serverRequest(request: Request) {
        if (lastServedId >= servers.size) {
            lastServedId = 0
        }
        val server = servers[lastServedId++]
        server.serve(request)
    }

    companion object {
        private val servers = mutableListOf(Server("localhost", 8081, 1))
        var lastServedId: Int = 0
            private set

        init {
            var id = 1
            servers.run {
                add(Server("localhost", 8080, ++id))
                add(Server("localhost", 8082, ++id))
                add(Server("localhost", 8083, ++id))
                add(Server("localhost", 8084, ++id))
            }
        }
    }
}