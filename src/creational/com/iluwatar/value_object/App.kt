package creational.com.iluwatar.value_object

import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val statA = HeroStat.valueOf(10, 5, 0)
        val statB = HeroStat.valueOf(10, 5, 0)
        val statC = HeroStat.valueOf(5, 1, 8)

        val copy = statA.copy()
        LOGGER.info(statA.toString())
        LOGGER.info(copy.toString())

        LOGGER.info("Is statA and statB equal : {}", statA == statB)
        LOGGER.info("Is statA and statC equal : {}", statA == statC)
    }
}