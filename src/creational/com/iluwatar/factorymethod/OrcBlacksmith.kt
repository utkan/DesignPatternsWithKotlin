package creational.com.iluwatar.factorymethod

class OrcBlacksmith : Blacksmith {
    override fun manufactureWeapon(weaponType: WeaponType): Weapon {
        return OrcWeapon(weaponType)
    }
}