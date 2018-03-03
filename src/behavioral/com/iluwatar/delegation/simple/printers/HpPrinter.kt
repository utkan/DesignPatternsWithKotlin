package behavioral.com.iluwatar.delegation.simple.printers

import behavioral.com.iluwatar.delegation.simple.Printer
import org.slf4j.LoggerFactory

/**
 * Specialised Implementation of [Printer] for a HP Printer, in
 * this case the message to be printed is appended to "HP Printer : "
 *
 * @see Printer
 */
class HpPrinter : Printer {

    /**
     * {@inheritDoc}
     */
    override fun print(message: String) {
        LOGGER.info("HP Printer : $message")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(HpPrinter::class.java)
    }

}