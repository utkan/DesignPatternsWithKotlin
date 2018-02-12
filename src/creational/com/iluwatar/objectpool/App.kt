package creational.com.iluwatar.objectpool

import org.apache.log4j.BasicConfigurator
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    @JvmStatic
    fun main(args: Array<String>) {
        BasicConfigurator.configure()

        val pool = OliphauntPool()
        LOGGER.info(pool.toString())

        val oliphaunt1 = pool.checkOut()
        LOGGER.info("Checked out {}", oliphaunt1)
        LOGGER.info(pool.toString())

        val oliphaunt2 = pool.checkOut()
        LOGGER.info("Checked out {}", oliphaunt2)

        val oliphaunt3 = pool.checkOut()
        LOGGER.info("Checked out {}", oliphaunt3)
        LOGGER.info(pool.toString())
        LOGGER.info("Checking in {}", oliphaunt1)
        pool.checkIn(oliphaunt1)
        LOGGER.info("Checking in {}", oliphaunt2)
        pool.checkIn(oliphaunt2)
        LOGGER.info(pool.toString())

        val oliphaunt4 = pool.checkOut()
        LOGGER.info("Checked out {}", oliphaunt4)

        val oliphaunt5 = pool.checkOut()
        LOGGER.info("Checked out {}", oliphaunt5)
        LOGGER.info(pool.toString())
    }
}
