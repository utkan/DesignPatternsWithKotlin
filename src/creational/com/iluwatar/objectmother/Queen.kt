package creational.com.iluwatar.objectmother

data class Queen(
        private var isDrunk:Boolean = false,
        private var isHappy:Boolean = false,
        private var isFlirty:Boolean = false) : Royalty {

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

    fun setFlirtiness(flirtiness: Boolean) {
        this.isFlirty = flirtiness
    }

    /**
     * Method which is called when the king is flirting to a queen.
     * @param king King who initialized the flirt.
     * @return A value which describes if the flirt was successful or not.
     */
    fun getFlirted(king: King): Boolean {
        return this.isFlirty && king.isHappy && !king.isDrunk
    }
}