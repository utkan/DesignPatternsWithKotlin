package creational.com.iluwatar.factorykit

class WeaponBuilder : Builder {
    override fun create(weaponType: WeaponType): Weapon? {
        return when (weaponType) {
            WeaponType.AXE -> Axe()
            WeaponType.SWORD -> Sword()
            WeaponType.BOW -> Bow()
            WeaponType.SPEAR -> Spear()
        }
    }

    override fun add(f: (WeaponType, Weapon?) -> Weapon?): Builder {
        f(WeaponType.AXE, create(WeaponType.AXE))
        f(WeaponType.SWORD, create(WeaponType.SWORD))
        f(WeaponType.BOW, create(WeaponType.BOW))
        f(WeaponType.SPEAR, create(WeaponType.SPEAR))
        return this
    }
}