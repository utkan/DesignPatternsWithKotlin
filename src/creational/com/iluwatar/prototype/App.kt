package creational.com.iluwatar.prototype

import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        var factory: HeroFactory
        var mage: Mage?
        var warlord: Warlord?
        var beast: Beast?

        factory = HeroFactoryImpl(ElfMage("cooking"), ElfWarlord("cleaning"), ElfBeast("protecting"))
        mage = factory.createMage()
        warlord = factory.createWarlord()
        beast = factory.createBeast()
        LOGGER.info(mage!!.toString())
        LOGGER.info(warlord!!.toString())
        LOGGER.info(beast!!.toString())

        factory = HeroFactoryImpl(OrcMage("axe"), OrcWarlord("sword"), OrcBeast("laser"))
        mage = factory.createMage()
        warlord = factory.createWarlord()
        beast = factory.createBeast()
        LOGGER.info(mage!!.toString())
        LOGGER.info(warlord!!.toString())
        LOGGER.info(beast!!.toString())

        /*
        *
0 [main] INFO creational.com.iluwatar.prototype.App  - Elven mage helps in cooking
1 [main] INFO creational.com.iluwatar.prototype.App  - Elven warlord helps in cleaning
1 [main] INFO creational.com.iluwatar.prototype.App  - Elven eagle helps in protecting
3 [main] INFO creational.com.iluwatar.prototype.App  - Orcish mage attacks with axe
3 [main] INFO creational.com.iluwatar.prototype.App  - Orcish warlord attacks with sword
3 [main] INFO creational.com.iluwatar.prototype.App  - Orcish wolf attacks with laser
        * */
    }
}