package creational.com.iluwatar.objectpool

import java.util.HashSet

abstract class ObjectPool<T> {

    private val available = HashSet<T>()
    private val inUse = HashSet<T>()

    protected abstract fun create(): T

    @Synchronized
    fun checkOut(): T {
        if (available.isEmpty()) {
            available.add(create())
        }
        val instance = available.iterator().next()
        available.remove(instance)
        inUse.add(instance)
        return instance
    }

    @Synchronized
    fun checkIn(instance: T) {
        inUse.remove(instance)
        available.add(instance)
    }

    @Synchronized
    override fun toString(): String {
        return String.format("Pool available=%d inUse=%d", available.size, inUse.size)
    }
}