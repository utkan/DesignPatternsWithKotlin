package creational.com.iluwatar.factorykit

fun main(args: Array<String>) {
    val builder = WeaponBuilder()
    val axe = WeaponFactory.factory(builder).create(WeaponType.AXE)
    println(axe)
}