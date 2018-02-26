package creational.com.iluwatar.prototype

data class OrcBeast(private val weapon: String) : Beast() {

    constructor(orcBeast: OrcBeast) : this(orcBeast.weapon)

    @Throws(CloneNotSupportedException::class)
    override fun copy(): Beast {
        return OrcBeast(this)
    }

    override fun toString(): String {
        return "Orcish wolf attacks with $weapon"
    }
}