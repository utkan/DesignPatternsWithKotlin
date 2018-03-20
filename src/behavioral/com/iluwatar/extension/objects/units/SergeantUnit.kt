package behavioral.com.iluwatar.extension.objects.units

import behavioral.com.iluwatar.extension.objects.abstractextensions.UnitExtension
import behavioral.com.iluwatar.extension.objects.concreteextensions.Sergeant

/**
 * Class defining SergeantUnit
 */
class SergeantUnit(name: String) : Unit(name) {

    override fun getUnitExtension(extensionName: String): UnitExtension? {

        if (extensionName == "SergeantExtension") {
            if (unitExtension == null) {
                unitExtension = Sergeant(this)
            }
            return unitExtension
        }

        return super.getUnitExtension(extensionName)
    }
}
