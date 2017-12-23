import creational.com.iluwatar.singleton.*
import kotlin.test.assertTrue

fun main(args: Array<String>) {
    println("Hello")

    println("Enum based singleton implementation. Effective Java 2nd Edition (Joshua Bloch) p. 18")
    run {
        val instance1 = EnumIvoryTower.INSTANCE
        val instance2 = EnumIvoryTower.INSTANCE

        assertTrue(instance1 == instance2)
        assertTrue(instance1 === instance2)
    }

    println("Provides the lazy-loaded Singleton instance.")
    run {
        val instance1 = InitializingOnDemandHolderIdiom.INSTANCE
        val instance2 = InitializingOnDemandHolderIdiom.INSTANCE

        assertTrue(instance1 == instance2)
        assertTrue(instance1 === instance2)
    }

    println("Singleton class. Eagerly initialized static instance guarantees thread safety.")
    run {
        val instance1 = IvoryTower.getInstance()
        val instance2 = IvoryTower.getInstance()

        assertTrue(instance1 == instance2)
        assertTrue(instance1 === instance2)
    }

    println("Double check locking")
    run {
        val instance1 = ThreadSafeDoubleCheckLocking.getInstance()
        val instance2 = ThreadSafeDoubleCheckLocking.getInstance()

        assertTrue(instance1 == instance2)
        assertTrue(instance1 === instance2)
    }

    println("Thread-safe Singleton class. The instance is lazily initialized and thus needs synchronization mechanism.")
    run {
        val instance1 = ThreadSafeLazyLoadedIvoryTower.INSTANCE
        val instance2 = ThreadSafeLazyLoadedIvoryTower.INSTANCE

        assertTrue(instance1 == instance2)
        assertTrue(instance1 === instance2)
    }
}