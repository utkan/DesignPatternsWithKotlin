package creational.com.iluwatar.twin

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.properties.Delegates

/**
 * This class represents a Ball which extends [GameItem] and implements the logic for ball
 * item, like move and draw. It hold a reference of [BallThread] to delegate the suspend and
 * resume task.
 */
class BallItem : GameItem() {

    private var isSuspended: Boolean = false

    internal var twin: BallThread by Delegates.notNull()

    override fun doDraw() {
        LOGGER.info("doDraw")
    }

    fun move() {
        LOGGER.info("move")
    }

    override fun click() {
        isSuspended = !isSuspended

        if (isSuspended) {
            twin.suspendMe()
        } else {
            twin.resumeMe()
        }
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(BallItem::class.java)
    }
}