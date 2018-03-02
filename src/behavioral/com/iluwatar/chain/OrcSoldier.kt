package behavioral.com.iluwatar.chain

class OrcSoldier(handler: RequestHandler? = null) : RequestHandler(handler) {
    override fun handleRequest(req: Request) {
        if (req.requestType == RequestType.COLLECT_TAX) {
            printHandling(req)
            req.markHandled()
        } else {
            super.handleRequest(req)
        }
    }
}