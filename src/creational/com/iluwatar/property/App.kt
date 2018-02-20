package creational.com.iluwatar.property

import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    @JvmStatic
    fun main(args: Array<String>) {
        BasicConfigurator.configure()

        val charProto = Character()
        charProto.set(Stats.STRENGTH, 10)
        charProto.set(Stats.AGILITY, 10)
        charProto.set(Stats.ARMOR, 10)
        charProto.set(Stats.ATTACK_POWER, 10)

        val mageProto = Character(Character.Type.MAGE, charProto)
        mageProto.set(Stats.INTELLECT, 15)
        mageProto.set(Stats.SPIRIT, 10)

        val warProto = Character(Character.Type.WARRIOR, charProto)
        warProto.set(Stats.RAGE, 15)
        warProto.set(Stats.ARMOR, 15) // boost default armor for warrior

        val rogueProto = Character(Character.Type.ROGUE, charProto)
        rogueProto.set(Stats.ENERGY, 15)
        rogueProto.set(Stats.AGILITY, 15) // boost default agility for rogue

        /* usage */
        val mag = Character("Player_1", mageProto)
        mag.set(Stats.ARMOR, 8)
        LOGGER.info(mag.toString())

        val warrior = Character("Player_2", warProto)
        LOGGER.info(warrior.toString())

        val rogue = Character("Player_3", rogueProto)
        LOGGER.info(rogue.toString())

        val rogueDouble = Character("Player_4", rogue)
        rogueDouble.set(Stats.ATTACK_POWER, 12)
        LOGGER.info(rogueDouble.toString())
    }
}
