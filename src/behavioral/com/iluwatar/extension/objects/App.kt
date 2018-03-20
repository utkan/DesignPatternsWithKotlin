package behavioral.com.iluwatar.extension.objects

import behavioral.com.iluwatar.extension.objects.abstractextensions.CommanderExtension
import behavioral.com.iluwatar.extension.objects.abstractextensions.SergeantExtension
import behavioral.com.iluwatar.extension.objects.abstractextensions.SoldierExtension
import behavioral.com.iluwatar.extension.objects.units.CommanderUnit
import behavioral.com.iluwatar.extension.objects.units.SergeantUnit
import behavioral.com.iluwatar.extension.objects.units.SoldierUnit
import behavioral.com.iluwatar.extension.objects.units.Unit
import org.apache.log4j.BasicConfigurator
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Anticipate that an object’s interface needs to be extended in the future.
 * Additional interfaces are defined by extension objects.
 */
object App {

    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val logger = LoggerFactory.getLogger(App::class.java)

        //Create 3 different units
        val soldierUnit = SoldierUnit("SoldierUnit1")
        val sergeantUnit = SergeantUnit("SergeantUnit1")
        val commanderUnit = CommanderUnit("CommanderUnit1")

        //check for each unit to have an extension
        logger.info("___________")
        checkExtensionsForUnit(soldierUnit)
        logger.info("___________\n")

        logger.info("___________")
        checkExtensionsForUnit(sergeantUnit)
        logger.info("___________\n")

        logger.info("___________")
        checkExtensionsForUnit(commanderUnit)
        logger.info("___________")
    }

    private fun checkExtensionsForUnit(unit: Unit) {
        val logger = LoggerFactory.getLogger(App::class.java)

        val soldierExtension = unit.getUnitExtension("SoldierExtension") as SoldierExtension?
        val sergeantExtension = unit.getUnitExtension("SergeantExtension") as SergeantExtension?
        val commanderExtension = unit.getUnitExtension("CommanderExtension") as CommanderExtension?

        //if unit have extension call the method
        soldierExtension?.soldierReady()

        sergeantExtension?.sergeantReady()

        commanderExtension?.commanderReady()


        if (soldierExtension == null) {
            logger.info("${unit.name} without SoldierExtension")
        }

        if (sergeantExtension == null) {
            logger.info("${unit.name} without SoldierExtension")
        }

        if (commanderExtension == null) {
            logger.info("${unit.name} without SoldierExtension")
        }
    }
}