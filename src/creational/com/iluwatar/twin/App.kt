package creational.com.iluwatar.twin

import org.apache.log4j.BasicConfigurator

/**
 * Twin pattern is a design pattern which provides a standard solution to simulate multiple
 * inheritance in java.
 *
 *
 * In this example, the essence of the Twin pattern is the [BallItem] class and
 * [BallThread] class represent the twin objects to coordinate with each other(via the twin
 * reference) like a single class inheriting from [GameItem] and [Thread].
 */

object App {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val ballItem = BallItem()
        val ballThread = BallThread()

        ballItem.twin = ballThread
        ballThread.twin = ballItem

        ballThread.start()

        waiting()

        ballItem.click()

        waiting()

        ballItem.click()

        waiting()

        // exit
        ballThread.stopMe()
    }

    @Throws(Exception::class)
    private fun waiting() {
        Thread.sleep(750)
    }
}