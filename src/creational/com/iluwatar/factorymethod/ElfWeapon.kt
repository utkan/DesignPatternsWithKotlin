package creational.com.iluwatar.factorymethod

class ElfWeapon(private val wt: WeaponType) : Weapon {
    override val weaponType: WeaponType
        get() = wt

    override fun toString(): String {
        return "Elven " + weaponType
    }
}