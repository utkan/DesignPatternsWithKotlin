package behavioral.com.iluwatar.command

/**
 * Enumeration for target size.
 */
enum class Size(private val title: String) {

    SMALL("small"), NORMAL("normal");

    override fun toString(): String {
        return title
    }
}