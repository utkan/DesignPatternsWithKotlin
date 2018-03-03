package behavioral.com.iluwatar.delegation.simple.printers

import behavioral.com.iluwatar.delegation.simple.Printer
import org.slf4j.LoggerFactory

/**
 * Specialised Implementation of [Printer] for a Epson Printer, in
 * this case the message to be printed is appended to "Epson Printer : "
 *
 * @see Printer
 */
class EpsonPrinter : Printer {

    /**
     * {@inheritDoc}
     */
    override fun print(message: String) {
        LOGGER.info("Epson Printer : $message")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(EpsonPrinter::class.java)
    }
}