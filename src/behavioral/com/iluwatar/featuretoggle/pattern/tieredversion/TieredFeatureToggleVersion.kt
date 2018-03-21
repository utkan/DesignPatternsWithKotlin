package behavioral.com.iluwatar.featuretoggle.pattern.tieredversion

import behavioral.com.iluwatar.featuretoggle.user.User
import behavioral.com.iluwatar.featuretoggle.user.UserGroup
import behavioral.com.iluwatar.featuretoggle.pattern.Service
import behavioral.com.iluwatar.featuretoggle.pattern.propertiesversion.PropertiesFeatureToggleVersion

/**
 * This example of the Feature Toogle pattern shows how it could be implemented based on a [User]. Therefore
 * showing its use within a tiered application where the paying users get access to different content or
 * better versions of features. So in this instance a [User] is passed in and if they are found to be
 * on the [UserGroup.isPaid] they are welcomed with a personalised message. While the other is more
 * generic. However this pattern is limited to simple examples such as the one below.
 *
 * @see Service
 *
 * @see User
 *
 * @see PropertiesFeatureToggleVersion
 *
 * @see UserGroup
 */
class TieredFeatureToggleVersion : Service {

    /**
     * Generates a welcome message from the passed [User]. The resulting message depends on the group of the
     * [User]. So if the [User] is in the [UserGroup.paidGroup] then the enhanced version of the
     * welcome message will be returned where the username is displayed.
     *
     * @param user the [User] to generate the welcome message for, different messages are displayed if the user is
     * in the [UserGroup.isPaid] or [UserGroup.freeGroup]
     * @return Resulting welcome message.
     * @see User
     *
     * @see UserGroup
     */
    override fun getWelcomeMessage(user: User): String {
        return if (UserGroup.isPaid(user)) {
            "You're amazing $user. Thanks for paying for this awesome software."
        } else "I suppose you can use this software."

    }

    /**
     * Method that checks if the welcome message to be returned is the enhanced version. For this instance as the logic
     * is driven by the user group. This method is a little redundant. However can be used to show that there is an
     * enhanced version available.
     *
     * @return Boolean value `true` if enhanced.
     */
    override fun isEnhanced(): Boolean {
        return true
    }

}