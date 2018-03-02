package behavioral.com.iluwatar.chain

class OrcCommander(handler: RequestHandler) : RequestHandler(handler) {

    override fun handleRequest(req: Request) {
        if (req.requestType == RequestType.DEFEND_CASTLE) {
            printHandling(req)
            req.markHandled()
        } else {
            super.handleRequest(req)
        }
    }
}