package behavioral.com.iluwatar.featuretoggle.pattern

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.util.Properties

import behavioral.com.iluwatar.featuretoggle.user.User
import behavioral.com.iluwatar.featuretoggle.user.UserGroup
import behavioral.com.iluwatar.featuretoggle.pattern.propertiesversion.PropertiesFeatureToggleVersion
import behavioral.com.iluwatar.featuretoggle.pattern.tieredversion.TieredFeatureToggleVersion
import org.apache.log4j.BasicConfigurator

/**
 * The Feature Toggle pattern allows for complete code executions to be turned on or off with ease. This allows features
 * to be controlled by either dynamic methods just as [User] information or by [Properties]. In the App
 * below there are two examples. Firstly the [Properties] version of the feature toggle, where the enhanced
 * version of the welcome message which is personalised is turned either on or off at instance creation. This method
 * is not as dynamic as the [User] driven version where the feature of the personalised welcome message is
 * dependant on the [UserGroup] the [User] is in. So if the user is a memeber of the
 * [UserGroup.isPaid] then they get an ehanced version of the welcome message.
 *
 * Note that this pattern can easily introduce code complexity, and if not kept in check can result in redundant
 * unmaintained code within the codebase.
 *
 */
object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    /**
     * Block 1 shows the [PropertiesFeatureToggleVersion] being run with [Properties] setting the feature
     * toggle to enabled.
     *
     * Block 2 shows the [PropertiesFeatureToggleVersion] being run with [Properties] setting the feature
     * toggle to disabled. Notice the difference with the printed welcome message the username is not included.
     *
     * Block 3 shows the [TieredFeatureToggleVersion] being
     * set up with two users on who is on the free level, while the other is on the paid level. When the
     * [Service.getWelcomeMessage] is called with the paid [User] note that the welcome message
     * contains their username, while the same service call with the free tier user is more generic. No username is
     * printed.
     *
     * @see User
     *
     * @see UserGroup
     *
     * @see Service
     *
     * @see PropertiesFeatureToggleVersion
     *
     * @see TieredFeatureToggleVersion
     */
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val properties = Properties()
        properties["enhancedWelcome"] = true
        val service = PropertiesFeatureToggleVersion(properties)
        val welcomeMessage = service.getWelcomeMessage(User("Jamie No Code"))
        LOGGER.info(welcomeMessage)

        // ---------------------------------------------

        val turnedOff = Properties()
        turnedOff["enhancedWelcome"] = false
        val turnedOffService = PropertiesFeatureToggleVersion(turnedOff)
        val welcomeMessageturnedOff = turnedOffService.getWelcomeMessage(User("Jamie No Code"))
        LOGGER.info(welcomeMessageturnedOff)

        // --------------------------------------------

        val service2 = TieredFeatureToggleVersion()

        val paidUser = User("Jamie Coder")
        val freeUser = User("Alan Defect")

        UserGroup.addUserToPaidGroup(paidUser)
        UserGroup.addUserToFreeGroup(freeUser)

        val welcomeMessagePaidUser = service2.getWelcomeMessage(paidUser)
        val welcomeMessageFreeUser = service2.getWelcomeMessage(freeUser)
        LOGGER.info(welcomeMessageFreeUser)
        LOGGER.info(welcomeMessagePaidUser)
    }
}