package creational.com.iluwatar.factorykit


interface Builder {
    fun add(f: (WeaponType, Weapon?) -> Weapon?): Builder
    fun create(weaponType: WeaponType): Weapon?
}