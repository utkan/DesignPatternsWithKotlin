package creational.com.iluwatar.stepbuilder

import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val car = Car.build(required = "rq value") {model = "X"}
        LOGGER.info(car.toString())

        val warrior = CharacterStepBuilder
                .newBuilder()
                .name("Amberjill")
                .fighterClass("Paladin")
                .withWeapon("Sword")
                .noAbilities()
                .build()

        LOGGER.info(warrior.toString())

        val mage = CharacterStepBuilder
                .newBuilder()
                .name("Riobard")
                .wizardClass("Sorcerer")
                .withSpell("Fireball")
                .withAbility("Fire Aura")
                .withAbility("Teleport")
                .noMoreAbilities()
                .build()

        LOGGER.info(mage.toString())

        val thief = CharacterStepBuilder
                .newBuilder()
                .name("Desmond")
                .fighterClass("Rogue")
                .noWeapon()
                .build()

        LOGGER.info(thief.toString())
    }
}