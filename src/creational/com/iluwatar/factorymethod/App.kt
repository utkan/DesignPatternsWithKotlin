package creational.com.iluwatar.factorymethod

fun main(args: Array<String>) {

    OrcBlacksmith().run {
        val weaponSpear = manufactureWeapon(WeaponType.SPEAR)
        val weaponAxe = manufactureWeapon(WeaponType.AXE)
        println(weaponSpear)
        println(weaponAxe)
    }
}