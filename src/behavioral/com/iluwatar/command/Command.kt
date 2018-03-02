package behavioral.com.iluwatar.command

/**
 * Interface for Commands.
 */
abstract class Command {

    abstract fun execute(target: Target)

    abstract fun undo()

    abstract fun redo()

    abstract override fun toString(): String

}