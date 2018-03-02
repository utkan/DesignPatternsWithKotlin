package behavioral.com.iluwatar.chain

class OrcOfficer(handler: RequestHandler) : RequestHandler(handler) {

    override fun handleRequest(req: Request) {
        if (req.requestType == RequestType.TORTURE_PRISONER) {
            printHandling(req)
            req.markHandled()
        } else {
            super.handleRequest(req)
        }
    }
}