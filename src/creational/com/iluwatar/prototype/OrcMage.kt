package creational.com.iluwatar.prototype

data class OrcMage(private val weapon: String) : Mage() {

    constructor(orcMage: OrcMage) : this(orcMage.weapon)

    @Throws(CloneNotSupportedException::class)
    override fun copy(): OrcMage {
        return OrcMage(this)
    }

    override fun toString(): String {
        return "Orcish mage attacks with $weapon"
    }
}