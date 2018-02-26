package creational.com.iluwatar.prototype

abstract class Mage : Prototype() {

    @Throws(CloneNotSupportedException::class)
    abstract override fun copy(): Mage
}