package creational.com.iluwatar.objectmother

/**
 * Defines all attributes and behaviour related to the King
 */
data class King(
        internal var isDrunk:Boolean = false,
        internal var isHappy:Boolean = false) : Royalty {

    override fun makeDrunk() {
        isDrunk = true
    }

    override fun makeSober() {
        isDrunk = false
    }

    override fun makeHappy() {
        isHappy = true
    }

    override fun makeUnhappy() {
        isHappy = false
    }

    /**
     * Method to flirt to a queen.
     * @param queen Queen which should be flirted.
     */
    fun flirt(queen: Queen) {
        when (queen.getFlirted(this)) {
            true -> makeHappy()
            false -> makeUnhappy()
        }
    }
}