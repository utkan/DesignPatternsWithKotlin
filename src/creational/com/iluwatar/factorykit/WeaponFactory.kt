package creational.com.iluwatar.factorykit

object WeaponFactory {
    private val map = mutableMapOf<WeaponType, Weapon?>()

    fun factory(builder: Builder): WeaponFactory {
        builder.add(map::put)
        return this
    }

    fun create(weaponType: WeaponType): Weapon? {
        return map[weaponType]
    }

}