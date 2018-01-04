package creational.com.iluwatar.builder

enum class HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;

    override fun toString(): String {
        return name.toLowerCase()
    }

}