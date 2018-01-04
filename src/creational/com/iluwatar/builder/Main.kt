package creational.com.iluwatar.builder

fun main(args: Array<String>) {
    val mage = Hero.Builder()
            .withProfession(Profession.MAGE)
            .withName("Riobard")
            .withHairColor(HairColor.BLACK)
            .withWeapon(Weapon.DAGGER)
            .build()
    println(mage)

    val warrior = Hero.Builder()
            .withProfession(Profession.WARRIOR)
            .withName("Amberjill")
            .withHairColor(HairColor.BLOND)
            .withHairType(HairType.LONG_CURLY)
            .withArmor(Armor.CHAIN_MAIL)
            .withWeapon(Weapon.SWORD)
            .build()
    println(warrior)

    val thief = Hero.Builder()
            .withProfession(Profession.THIEF)
            .withName("Desmond")
            .withHairType(HairType.BALD)
            .withWeapon(Weapon.BOW)
            .build()
    println(thief)
}