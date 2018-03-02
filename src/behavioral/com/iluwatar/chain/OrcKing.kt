package behavioral.com.iluwatar.chain

/**
 *
 * OrcKing makes requests that are handled by the chain.
 *
 */
class OrcKing {

    internal lateinit var chain: RequestHandler

    init {
        buildChain()
    }

    private fun buildChain() {
        chain = OrcCommander(OrcOfficer(OrcSoldier()))
    }

    fun makeRequest(req: Request) {
        chain.handleRequest(req)
    }
}