package creational.com.iluwatar.multiton

import org.apache.log4j.BasicConfigurator
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    /**
     * Program entry point
     *
     * @param args command line args
     */
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        LOGGER.info("KHAMUL={}", Nazgul.getInstance(NazgulName.KHAMUL))
        LOGGER.info("MURAZOR={}", Nazgul.getInstance(NazgulName.MURAZOR))
        LOGGER.info("DWAR={}", Nazgul.getInstance(NazgulName.DWAR))
        LOGGER.info("JI_INDUR={}", Nazgul.getInstance(NazgulName.JI_INDUR))
        LOGGER.info("AKHORAHIL={}", Nazgul.getInstance(NazgulName.AKHORAHIL))
        LOGGER.info("HOARMURATH={}", Nazgul.getInstance(NazgulName.HOARMURATH))
        LOGGER.info("ADUNAPHEL={}", Nazgul.getInstance(NazgulName.ADUNAPHEL))
        LOGGER.info("REN={}", Nazgul.getInstance(NazgulName.REN))
        LOGGER.info("UVATHA={}", Nazgul.getInstance(NazgulName.UVATHA))
    }
}