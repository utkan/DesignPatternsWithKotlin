package creational.com.iluwatar.factorymethod

class ElfBlacksmith : Blacksmith {
    override fun manufactureWeapon(weaponType: WeaponType): Weapon {
        return ElfWeapon(weaponType)
    }
}