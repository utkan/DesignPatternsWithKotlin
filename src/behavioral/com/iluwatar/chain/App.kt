package behavioral.com.iluwatar.chain

import org.apache.log4j.BasicConfigurator

/**
 *
 * The Chain of Responsibility pattern is a design pattern consisting of command objects and a
 * series of processing objects. Each processing object contains logic that defines the types of
 * command objects that it can handle; the rest are passed to the next processing object in the
 * chain. A mechanism also exists for adding new processing objects to the end of this chain.
 *
 *
 * In this example we organize the request handlers ([RequestHandler]) into a chain where each
 * handler has a chance to act on the request on its turn. Here the king ([OrcKing]) makes
 * requests and the military orcs ([OrcCommander], [OrcOfficer], [OrcSoldier])
 * form the handler chain.
 *
 */
object App {

    /**
     * Program entry point
     *
     * @param args command line args
     */
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val king = OrcKing()
        king.makeRequest(Request(RequestType.DEFEND_CASTLE, "defend castle"))
        king.makeRequest(Request(RequestType.TORTURE_PRISONER, "torture prisoner"))
        king.makeRequest(Request(RequestType.COLLECT_TAX, "collect tax"))

    }
}