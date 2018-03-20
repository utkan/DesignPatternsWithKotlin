package behavioral.com.iluwatar.extension.objects.concreteextensions

import behavioral.com.iluwatar.extension.objects.abstractextensions.SoldierExtension
import behavioral.com.iluwatar.extension.objects.units.SoldierUnit
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Class defining Soldier
 */
class Soldier(private val unit: SoldierUnit) : SoldierExtension {

    internal val logger = LoggerFactory.getLogger(Soldier::class.java)

    override fun soldierReady() {
        logger.info("[Solider] ${unit.name} is ready!")
    }
}