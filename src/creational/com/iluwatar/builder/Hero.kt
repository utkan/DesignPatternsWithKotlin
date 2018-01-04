package creational.com.iluwatar.builder

data class Hero(
        val profession: Profession,
        val name: String,
        val hairType: HairType?,
        val hairColor: HairColor?,
        val armor: Armor?,
        val weapon: Weapon?) {

    class Builder {
        private lateinit var profession: Profession
        private lateinit var name: String
        private var hairType: HairType? = null
        private var hairColor: HairColor? = null
        private var armor: Armor? = null
        private var weapon: Weapon? = null

        fun withProfession(profession: Profession): Builder {
            this.profession = profession
            return this
        }

        fun withName(name: String): Builder {
            this.name = name
            return this
        }

        fun withHairType(hairType: HairType): Builder {
            this.hairType = hairType
            return this
        }

        fun withHairColor(hairColor: HairColor): Builder {
            this.hairColor = hairColor
            return this
        }

        fun withArmor(armor: Armor): Builder {
            this.armor = armor
            return this
        }

        fun withWeapon(weapon: Weapon): Builder {
            this.weapon = weapon
            return this
        }

        fun build() = Hero(profession, name, hairType, hairColor, armor, weapon)
    }
}