package behavioral.com.iluwatar.delegation.simple

import behavioral.com.iluwatar.delegation.simple.printers.CanonPrinter
import behavioral.com.iluwatar.delegation.simple.printers.EpsonPrinter
import behavioral.com.iluwatar.delegation.simple.printers.HpPrinter

/**
 * Interface that both the Controller and the Delegate will implement.
 *
 * @see CanonPrinter
 *
 * @see EpsonPrinter
 *
 * @see HpPrinter
 */
interface Printer {

    /**
     * Method that takes a String to print to the screen. This will be implemented on both the
     * controller and the delegate allowing the controller to call the same method on the delegate class.
     *
     * @param message to be printed to the screen
     */
    fun print(message: String)
}