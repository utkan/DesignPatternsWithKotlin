package behavioral.com.iluwatar.memento

import org.apache.log4j.BasicConfigurator
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.util.Stack

/**
 *
 * The Memento pattern is a software design pattern that provides the ability to restore an object
 * to its previous state (undo via rollback).
 *
 *
 * The Memento pattern is implemented with three objects: the originator, a caretaker and a memento.
 * The originator is some object that has an internal state. The caretaker is going to do something
 * to the originator, but wants to be able to undo the change. The caretaker first asks the
 * originator for a memento object. Then it does whatever operation (or sequence of operations) it
 * was going to do. To roll back to the state before the operations, it returns the memento object
 * to the originator. The memento object itself is an opaque object (one which the caretaker cannot,
 * or should not, change). When using this pattern, care should be taken if the originator may
 * change other objects or resources - the memento pattern operates on a single object.
 *
 *
 * In this example the object ([Star]) gives out a "memento" ([StarMemento]) that
 * contains the state of the object. Later on the memento can be set back to the object restoring
 * the state.
 *
 */
object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    /**
     * Program entry point
     */
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val states = Stack<StarMemento>()

        val star = Star(StarType.SUN, 10000000, 500000)
        LOGGER.info(star.toString())

        states.add(star.memento)
        star.timePasses()
        LOGGER.info(star.toString())

        states.add(star.memento)
        star.timePasses()
        LOGGER.info(star.toString())

        states.add(star.memento)
        star.timePasses()
        LOGGER.info(star.toString())

        states.add(star.memento)
        star.timePasses()
        LOGGER.info(star.toString())
        println("____________")
        println("____________")
        while (states.size > 0) {
            star.memento = states.pop()
            LOGGER.info(star.toString())
        }
        println("____________")
//        states.forEach {
////            star.memento = states.pop()
//            LOGGER.info(it.toString())
//        }
    }
}