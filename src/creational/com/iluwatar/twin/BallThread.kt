package creational.com.iluwatar.twin

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.properties.Delegates

/**
 * This class is a UI thread for drawing the [BallItem], and provide the method for suspend
 * and resume. It hold the reference of [BallItem] to delegate the draw task.
 *
 */

class BallThread : Thread() {

    internal var twin: BallItem by Delegates.notNull()

    @Volatile
    private var isSuspended: Boolean = false

    @Volatile
    private var isRunning = true

    /**
     * Run the thread
     */
    override fun run() {

        while (isRunning) {
            if (!isSuspended) {
                twin.draw()
                twin.move()
            }
            try {
                Thread.sleep(250)
            } catch (e: InterruptedException) {
                throw RuntimeException(e)
            }

        }
    }

    fun suspendMe() {
        isSuspended = true
        LOGGER.info("Begin to suspend BallThread")
    }

    fun resumeMe() {
        isSuspended = false
        LOGGER.info("Begin to resume BallThread")
    }

    fun stopMe() {
        this.isRunning = false
        this.isSuspended = true
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(BallThread::class.java)
    }
}