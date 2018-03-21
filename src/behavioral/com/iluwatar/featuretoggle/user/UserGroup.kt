package behavioral.com.iluwatar.featuretoggle.user

import java.util.ArrayList

/**
 * Contains the lists of users of different groups paid and free. Used to demonstrate the tiered example of feature
 * toggle. Allowing certain features to be available to only certain groups of users.
 *
 * @see User
 */
object UserGroup {

    private val freeGroup = ArrayList<User>()
    private val paidGroup = ArrayList<User>()


    /**
     * Add the passed [User] to the free user group list.
     *
     * @param user [User] to be added to the free group
     * @throws IllegalArgumentException when user is already added to the paid group
     * @see User
     */
    @Throws(IllegalArgumentException::class)
    fun addUserToFreeGroup(user: User) {
        if (paidGroup.contains(user)) {
            throw IllegalArgumentException("User all ready member of paid group.")
        } else {
            if (!freeGroup.contains(user)) {
                freeGroup.add(user)
            }
        }
    }

    /**
     * Add the passed [User] to the paid user group list.
     *
     * @param user [User] to be added to the paid group
     * @throws IllegalArgumentException when the user is already added to the free group
     * @see User
     */
    @Throws(IllegalArgumentException::class)
    fun addUserToPaidGroup(user: User) {
        if (freeGroup.contains(user)) {
            throw IllegalArgumentException("User all ready member of free group.")
        } else {
            if (!paidGroup.contains(user)) {
                paidGroup.add(user)
            }
        }
    }

    /**
     * Method to take a [User] to determine if the user is in the [UserGroup.paidGroup].
     *
     * @param user [User] to check if they are in the [UserGroup.paidGroup]
     *
     * @return true if the [User] is in [UserGroup.paidGroup]
     */
    fun isPaid(user: User): Boolean {
        return paidGroup.contains(user)
    }
}