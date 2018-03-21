package behavioral.com.iluwatar.featuretoggle.pattern.propertiesversion

import behavioral.com.iluwatar.featuretoggle.pattern.Service
import behavioral.com.iluwatar.featuretoggle.user.User
import behavioral.com.iluwatar.featuretoggle.pattern.tieredversion.TieredFeatureToggleVersion

import java.util.Properties

/**
 * This example of the Feature Toogle pattern is less dynamic version than
 * [TieredFeatureToggleVersion] where the feature is turned on
 * or off at the time of creation of the service. This example uses simple Java [Properties] however it could as
 * easily be done with an external configuration file loaded by Spring and so on. A good example of when to use this
 * version of the feature toggle is when new features are being developed. So you could have a configuration property
 * boolean named development or some sort of system environment variable.
 *
 * @see Service
 *
 * @see TieredFeatureToggleVersion
 *
 * @see User
 */
class PropertiesFeatureToggleVersion
/**
 * Creates an instance of [PropertiesFeatureToggleVersion] using the passed [Properties] to determine,
 * the status of the feature toggle [PropertiesFeatureToggleVersion.isEnhanced]. There is also some defensive
 * code to ensure the [Properties] passed are as expected.
 *
 * @param properties [Properties] used to configure the service and toggle features.
 * @throws IllegalArgumentException when the passed [Properties] is not as expected
 * @see Properties
 */
(properties: Properties?) : Service {

    private var isEnhanced: Boolean = false

    init {
        if (properties == null) {
            throw IllegalArgumentException("No Properties Provided.")
        } else {
            try {
                isEnhanced = properties["enhancedWelcome"] as Boolean
            } catch (e: Exception) {
                throw IllegalArgumentException("Invalid Enhancement Settings Provided.")
            }

        }
    }

    /**
     * Generate a welcome message based on the user being passed and the status of the feature toggle. If the enhanced
     * version is enabled, then the message will be personalised with the name of the passed [User]. However if
     * disabled then a generic version fo the message is returned.
     *
     * @param user the [User] to be displayed in the message if the enhanced version is enabled see
     * [PropertiesFeatureToggleVersion.isEnhanced]. If the enhanced version is enabled, then the
     * message will be personalised with the name of the passed [User]. However if disabled then a
     * generic version fo the message is returned.
     * @return Resulting welcome message.
     * @see User
     */
    override fun getWelcomeMessage(user: User): String {

        return if (isEnhanced()) {
            "Welcome $user. You're using the enhanced welcome message."
        } else "Welcome to the application."

    }

    /**
     * Method that checks if the welcome message to be returned is the enhanced venison or not. For this service it will
     * see the value of the boolean that was set in the constructor
     * [PropertiesFeatureToggleVersion.PropertiesFeatureToggleVersion]
     *
     * @return Boolean value `true` if enhanced.
     */
    override fun isEnhanced(): Boolean {
        return isEnhanced
    }
}