package creational.com.iluwatar.prototype

data class OrcWarlord(private val weapon: String) : Warlord() {

    constructor(orcWarlord: OrcWarlord) : this(orcWarlord.weapon)

    @Throws(CloneNotSupportedException::class)
    override fun copy(): OrcWarlord {
        return OrcWarlord(this)
    }

    override fun toString(): String {
        return "Orcish warlord attacks with $weapon"
    }
}