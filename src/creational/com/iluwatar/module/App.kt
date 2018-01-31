package creational.com.iluwatar.module

import org.apache.log4j.BasicConfigurator
import java.io.FileNotFoundException

object App {
    private var fileLoggerModule: FileLoggerModule? = null
    private var consoleLoggerModule: ConsoleLoggerModule? = null

    @Throws(FileNotFoundException::class)
    private fun prepare() {

        /* Create new singleton objects and prepare their modules */
        fileLoggerModule = FileLoggerModule.singleton?.prepare()
        consoleLoggerModule = ConsoleLoggerModule.singleton?.prepare()
    }

    private fun unprepare() {

        /* Close all resources */
        fileLoggerModule?.unprepare()
        consoleLoggerModule?.unprepare()
    }


    private fun execute(vararg args: String) {

        /* Send logs on file system */
        fileLoggerModule?.run {
            printString("Message")
            printErrorString("Error")
        }

        /* Send logs on console */
        consoleLoggerModule?.run {
            printString("Message")
            printErrorString("Error")
        }
    }

    @Throws(FileNotFoundException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        BasicConfigurator.configure()
        prepare()
        execute(*args)
        unprepare()
    }
}