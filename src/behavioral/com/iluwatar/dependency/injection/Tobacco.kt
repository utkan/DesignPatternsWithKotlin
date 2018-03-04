package behavioral.com.iluwatar.dependency.injection

import org.slf4j.LoggerFactory

/**
 * Tobacco abstraction
 */
abstract class Tobacco {

    fun smoke(wizard: Wizard) {
        LOGGER.info("${wizard.javaClass.simpleName} smoking ${this.javaClass.simpleName}")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(Tobacco::class.java)
    }
}