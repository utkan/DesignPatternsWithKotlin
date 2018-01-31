package creational.com.iluwatar.module

import java.io.PrintStream

import org.apache.log4j.Logger

class ConsoleLoggerModule private constructor() {
    private var output: PrintStream? = null
    private var error: PrintStream? = null

    fun prepare(): ConsoleLoggerModule {
        LOGGER.debug("ConsoleLoggerModule::prepare();")

        output = PrintStream(System.out)
        error = PrintStream(System.err)

        return this
    }

    fun unprepare() {
        output?.run {
            flush()
            close()
        }
        error?.run {
            flush()
            close()
        }
        LOGGER.debug("ConsoleLoggerModule::unprepare();")
    }

    fun printString(value: String) {
        output?.println(value)
    }

    fun printErrorString(value: String) {
        error?.println(value)
    }

    companion object {
        private val LOGGER = Logger.getLogger(ConsoleLoggerModule::class.java)

        internal var singleton: ConsoleLoggerModule? = null
            get() {
                if (field == null) {
                    field = ConsoleLoggerModule()
                }

                return field
            }
    }
}