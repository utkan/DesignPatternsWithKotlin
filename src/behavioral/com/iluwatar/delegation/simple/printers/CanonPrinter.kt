package behavioral.com.iluwatar.delegation.simple.printers

import behavioral.com.iluwatar.delegation.simple.Printer
import org.slf4j.LoggerFactory

/**
 * Specialised Implementation of [Printer] for a Canon Printer, in
 * this case the message to be printed is appended to "Canon Printer : "
 *
 * @see Printer
 */
class CanonPrinter : Printer {

    /**
     * {@inheritDoc}
     */
    override fun print(message: String) {
        LOGGER.info("Canon Printer : $message")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(CanonPrinter::class.java)
    }
}