package creational.com.iluwatar.prototype

abstract class Warlord : Prototype() {

    @Throws(CloneNotSupportedException::class)
    abstract override fun copy(): Warlord
}