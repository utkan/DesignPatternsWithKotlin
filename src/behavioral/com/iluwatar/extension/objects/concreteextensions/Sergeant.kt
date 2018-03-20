package behavioral.com.iluwatar.extension.objects.concreteextensions

import behavioral.com.iluwatar.extension.objects.abstractextensions.SergeantExtension
import behavioral.com.iluwatar.extension.objects.units.SergeantUnit
import org.slf4j.LoggerFactory

/**
 * Class defining Sergeant
 */
class Sergeant(private val unit: SergeantUnit) : SergeantExtension {

    internal val logger = LoggerFactory.getLogger(Sergeant::class.java)

    override fun sergeantReady() {
        logger.info("[Sergeant] ${unit.name} is ready! ")
    }
}