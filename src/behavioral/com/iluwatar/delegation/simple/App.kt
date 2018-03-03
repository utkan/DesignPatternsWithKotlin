package behavioral.com.iluwatar.delegation.simple

import behavioral.com.iluwatar.delegation.simple.printers.CanonPrinter
import behavioral.com.iluwatar.delegation.simple.printers.EpsonPrinter
import behavioral.com.iluwatar.delegation.simple.printers.HpPrinter
import org.apache.log4j.BasicConfigurator

/**
 * The delegate pattern provides a mechanism to abstract away the implementation and control of the desired action.
 * The class being called in this case [PrinterController] is not responsible for the actual desired action,
 * but is actually delegated to a helper class either [CanonPrinter], [EpsonPrinter] or [HpPrinter].
 * The consumer does not have or require knowledge of the actual class carrying out the action, only the
 * container on which they are calling.
 *
 *
 * In this example the delegates are [EpsonPrinter], [HpPrinter] and [CanonPrinter] they all implement
 * [Printer]. The [PrinterController] class also implements [Printer]. However neither provide the
 * functionality of [Printer] by printing to the screen, they actually call upon the instance of [Printer]
 * that they were instantiated with. Therefore delegating the behaviour to another class.
 */
object App {

    private const val MESSAGE_TO_PRINT = "hello world"

    /**
     * Program entry point
     *
     * @param args command line args
     */
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

//        PrinterController(HpPrinter()).print(MESSAGE_TO_PRINT)
//        PrinterController(CanonPrinter()).print(MESSAGE_TO_PRINT)
//        PrinterController(EpsonPrinter()).print(MESSAGE_TO_PRINT)

        HpPrinter().printMessage(MESSAGE_TO_PRINT)
        CanonPrinter().printMessage(MESSAGE_TO_PRINT)
        EpsonPrinter().printMessage(MESSAGE_TO_PRINT)
    }

    private fun Printer.printMessage(msg:String) {
        PrinterController(this).print(msg)
    }
}