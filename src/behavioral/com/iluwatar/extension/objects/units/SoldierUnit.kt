package behavioral.com.iluwatar.extension.objects.units

import behavioral.com.iluwatar.extension.objects.abstractextensions.UnitExtension
import behavioral.com.iluwatar.extension.objects.concreteextensions.Soldier

/**
 * Class defining SoldierUnit
 */
class SoldierUnit(name: String) : Unit(name) {

    override fun getUnitExtension(extensionName: String): UnitExtension? {

        if (extensionName == "SoldierExtension") {
            if (unitExtension == null) {
                unitExtension = Soldier(this)
            }
            return unitExtension
        }
        return super.getUnitExtension(extensionName)
    }
}