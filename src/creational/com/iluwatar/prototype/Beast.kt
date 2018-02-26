package creational.com.iluwatar.prototype

abstract class Beast : Prototype() {

    @Throws(CloneNotSupportedException::class)
    abstract override fun copy(): Beast
}