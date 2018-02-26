package creational.com.iluwatar.prototype

data class ElfWarlord(private val helpType: String) : Warlord() {

    constructor(elfWarlord: ElfWarlord) : this(elfWarlord.helpType)

    @Throws(CloneNotSupportedException::class)
    override fun copy(): ElfWarlord {
        return ElfWarlord(this)
    }

    override fun toString(): String {
        return "Elven warlord helps in $helpType"
    }
}