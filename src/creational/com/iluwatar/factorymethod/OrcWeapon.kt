package creational.com.iluwatar.factorymethod

class OrcWeapon(private val wt: WeaponType) : Weapon {
    override val weaponType: WeaponType
        get() = wt
    override fun toString(): String {
        return "Orcish " + weaponType
    }
}