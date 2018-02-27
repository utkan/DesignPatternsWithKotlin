package creational.com.iluwatar.twin

import org.slf4j.LoggerFactory

/**
 * GameItem is a common class which provides some common methods for game object.
 */
abstract class GameItem {

    /**
     * Template method, do some common logic before draw
     */
    fun draw() {
        LOGGER.info("draw")
        doDraw()
    }

    abstract fun doDraw()

    abstract fun click()

    companion object {

        private val LOGGER = LoggerFactory.getLogger(GameItem::class.java)
    }
}