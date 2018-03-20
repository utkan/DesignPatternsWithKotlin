package behavioral.com.iluwatar.extension.objects.units

import behavioral.com.iluwatar.extension.objects.abstractextensions.UnitExtension
import behavioral.com.iluwatar.extension.objects.concreteextensions.Commander

/**
 * Class defining CommanderUnit
 */
class CommanderUnit(name: String) : Unit(name) {

    override fun getUnitExtension(extensionName: String): UnitExtension? {

        if (extensionName == "CommanderExtension") {
            if (unitExtension == null) {
                unitExtension = Commander(this)
            }
            return unitExtension
        }

        return super.getUnitExtension(extensionName)
    }
}