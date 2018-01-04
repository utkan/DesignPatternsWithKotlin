package creational.com.iluwatar.builder

enum class Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    override fun toString(): String {
        return name.toLowerCase()
    }

}