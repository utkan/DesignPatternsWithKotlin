package creational.com.iluwatar.monostate

import org.slf4j.LoggerFactory

data class Server(private val host: String, private val port: Int, private val id: Int) {

    fun serve(request: Request) {
        LOGGER.info("Server ID {} associated to host : {} and port {}. Processed request with value {}",
                id, host, port, request.value)
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(Server::class.java)
    }
}