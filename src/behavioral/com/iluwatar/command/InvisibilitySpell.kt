package behavioral.com.iluwatar.command

import kotlin.properties.Delegates

/**
 * InvisibilitySpell is a concrete command
 */
class InvisibilitySpell : Command() {

    private lateinit var target: Target

    override fun execute(target: Target) {
        target.visibility = Visibility.INVISIBLE
        this.target = target
    }

    override fun undo() {
        target.visibility = Visibility.VISIBLE
    }

    override fun redo() {
        target.visibility = Visibility.INVISIBLE
    }

    override fun toString(): String {
        return "Invisibility spell"
    }
}