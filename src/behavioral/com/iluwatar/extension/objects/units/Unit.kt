package behavioral.com.iluwatar.extension.objects.units

import behavioral.com.iluwatar.extension.objects.abstractextensions.UnitExtension

/**
 * Class defining Unit, other units will extend this class
 */
abstract class Unit(var name: String) {
    protected var unitExtension: UnitExtension? = null

    open fun getUnitExtension(extensionName: String): UnitExtension? {
        return null
    }
}