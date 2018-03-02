package behavioral.com.iluwatar.command

/**
 * ShrinkSpell is a concrete command
 */
class ShrinkSpell : Command() {

    private var oldSize: Size? = null
    private var target: Target? = null

    override fun execute(target: Target) {
        oldSize = target.size
        target.size = Size.SMALL
        this.target = target
    }

    override fun undo() {
        oldSize?.let { size ->
            target?.let {
                val temp = it.size
                it.size = size
                oldSize = temp
            }
        }
    }

    override fun redo() {
        undo()
    }

    override fun toString(): String {
        return "Shrink spell"
    }
}