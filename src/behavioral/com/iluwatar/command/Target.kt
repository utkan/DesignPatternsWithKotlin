package behavioral.com.iluwatar.command

import org.slf4j.LoggerFactory

/**
 * Base class for spell targets.
 */
abstract class Target {

    var size: Size? = null

    var visibility: Visibility? = null

    abstract override fun toString(): String

    /**
     * Print status
     */
    fun printStatus() {
        LOGGER.info("${this}, [size=$size] [visibility=$visibility]")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(Target::class.java)
    }
}