package behavioral.com.iluwatar.memento

/**
 *
 * StarType enumeration
 *
 */
enum class StarType private constructor(private val title: String) {
    SUN("sun"),
    RED_GIANT("red giant"),
    WHITE_DWARF("white dwarf"),
    SUPERNOVA("supernova"),
    DEAD("dead star"),
    UNDEFINED("");

    override fun toString(): String {
        return title
    }
}