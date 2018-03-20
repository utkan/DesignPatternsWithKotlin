package behavioral.com.iluwatar.extension.objects.concreteextensions

import behavioral.com.iluwatar.extension.objects.abstractextensions.CommanderExtension
import behavioral.com.iluwatar.extension.objects.units.CommanderUnit
import org.slf4j.LoggerFactory

/**
 * Class defining Commander
 */
class Commander(private val unit: CommanderUnit) : CommanderExtension {

    internal val logger = LoggerFactory.getLogger(Commander::class.java)

    override fun commanderReady() {
        logger.info("[Commander] ${unit.name} is ready!")
    }
}