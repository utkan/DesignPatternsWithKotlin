package behavioral.com.iluwatar.command

import org.slf4j.LoggerFactory
import java.util.*

/**
 * Wizard is the invoker of the commands
 */
class Wizard {

    private val undoStack = LinkedList<Command>()
    private val redoStack = LinkedList<Command>()

    /**
     * Cast spell
     */
    fun castSpell(command: Command, target: Target) {
        LOGGER.info("${this} casts $command at $target")
        command.execute(target)
        undoStack.offerLast(command)
    }

    /**
     * Undo last spell
     */
    fun undoLastSpell() {
        if (!undoStack.isEmpty()) {
            val previousSpell = undoStack.pollLast()
            redoStack.offerLast(previousSpell)
            LOGGER.info("${this} undoes $previousSpell")
            previousSpell.undo()
        }
    }

    /**
     * Redo last spell
     */
    fun redoLastSpell() {
        if (!redoStack.isEmpty()) {
            val previousSpell = redoStack.pollLast()
            undoStack.offerLast(previousSpell)
            LOGGER.info("${this} redoes $previousSpell")
            previousSpell.redo()
        }
    }

    override fun toString(): String {
        return "Wizard"
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(Wizard::class.java)
    }
}