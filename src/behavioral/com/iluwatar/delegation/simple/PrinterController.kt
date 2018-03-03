package behavioral.com.iluwatar.delegation.simple

import behavioral.com.iluwatar.delegation.simple.printers.HpPrinter
import org.slf4j.LoggerFactory

/**
 * Delegator Class to delegate the implementation of the Printer.
 * This ensures two things:
 * - when the actual implementation of the Printer class changes the delegation will still be operational
 * - the actual benefit is observed when there are more than one implementors and they share a delegation control
 */
class PrinterController(private val printer: Printer) : Printer {

    /**
     * This method is implemented from [Printer] however instead on providing an
     * implementation, it instead calls upon the class passed through the constructor. This is the delegate,
     * hence the pattern. Therefore meaning that the caller does not care of the implementing class only the owning
     * controller.
     *
     * @param message to be printed to the screen
     */
    override fun print(message: String) {
        LOGGER.info("Controller")
        printer.print(message)
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(HpPrinter::class.java)
    }
}