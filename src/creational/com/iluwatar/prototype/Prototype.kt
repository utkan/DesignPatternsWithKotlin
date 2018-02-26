package creational.com.iluwatar.prototype

abstract class Prototype : Cloneable {

    @Throws(CloneNotSupportedException::class)
    abstract fun copy(): Any
}