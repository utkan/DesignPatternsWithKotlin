package creational.com.iluwatar.module

import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.PrintStream

import org.apache.log4j.Logger

class FileLoggerModule private constructor() {
    private var output: PrintStream? = null
    private var error: PrintStream? = null

    @Throws(FileNotFoundException::class)
    fun prepare(): FileLoggerModule {
        LOGGER.debug("FileLoggerModule::prepare();")

        this.output = PrintStream(FileOutputStream(OUTPUT_FILE))
        this.error = PrintStream(FileOutputStream(ERROR_FILE))

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
        LOGGER.debug("FileLoggerModule::unprepare();")
    }

    fun printString(value: String) {
        this.output?.println(value)
    }

    fun printErrorString(value: String) {
        this.error?.println(value)
    }

    companion object {
        private val LOGGER = Logger.getLogger(FileLoggerModule::class.java)

        internal var singleton: FileLoggerModule? = null
            get() {
                if (field == null) {
                    field = FileLoggerModule()
                }

                return field
            }
        private const val OUTPUT_FILE = "output.txt"
        private const val ERROR_FILE = "error.txt"
    }
}