package creational.com.iluwatar.property

interface Prototype {

    fun get(stat: Stats): Int?

    fun has(stat: Stats): Boolean

    fun set(stat: Stats, value: Int?)

    fun remove(stat: Stats)
}