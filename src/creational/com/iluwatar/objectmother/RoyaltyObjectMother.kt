package creational.com.iluwatar.objectmother

object RoyaltyObjectMother {

    /**
     * Method to create a sober and unhappy king. The standard paramters are set.
     * @return An instance of [com.iluwatar.objectmother.King] with the standard properties.
     */
    fun createSoberUnhappyKing(): King {
        return King()
    }

    /**
     * Method of the object mother to create a drunk king.
     * @return A drunk [com.iluwatar.objectmother.King].
     */
    fun createDrunkKing(): King {
        return King(isDrunk = true)
    }

    /**
     * Method to create a happy king.
     * @return A happy [com.iluwatar.objectmother.King].
     */
    fun createHappyKing(): King {
        return King(isHappy = true)
    }

    /**
     * Method to create a happy and drunk king.
     * @return A drunk and happy [com.iluwatar.objectmother.King].
     */
    fun createHappyDrunkKing(): King {
        return King(isHappy = true, isDrunk = true)
    }

    /**
     * Method to create a flirty queen.
     * @return A flirty [com.iluwatar.objectmother.Queen].
     */
    fun createFlirtyQueen(): Queen {
        return Queen(isFlirty = true)
    }

    /**
     * Method to create a not flirty queen.
     * @return A not flirty [com.iluwatar.objectmother.Queen].
     */
    fun createNotFlirtyQueen(): Queen {
        return Queen()
    }
}