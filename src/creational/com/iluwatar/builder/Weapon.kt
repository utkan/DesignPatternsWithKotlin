package creational.com.iluwatar.builder

enum class Weapon {
    DAGGER, SWORD, AXE, WAR_HAMMER, BOW;

    override fun toString(): String {
        return name.toLowerCase()
    }

}