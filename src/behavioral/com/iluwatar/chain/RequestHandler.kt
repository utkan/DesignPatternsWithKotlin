package behavioral.com.iluwatar.chain

import org.slf4j.LoggerFactory

abstract class RequestHandler(private val next: RequestHandler?) {

    open fun handleRequest(req: Request) {
        next?.handleRequest(req)
    }

    protected fun printHandling(req: Request) {
        LOGGER.info("{} handling request \"{}\"", this, req)
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(RequestHandler::class.java)
    }
}