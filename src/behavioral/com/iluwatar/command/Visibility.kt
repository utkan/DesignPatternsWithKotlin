package behavioral.com.iluwatar.command

/**
 * Enumeration for target visibility.
 */
enum class Visibility(private val title: String) {

    VISIBLE("visible"), INVISIBLE("invisible");

    override fun toString(): String {
        return title
    }
}