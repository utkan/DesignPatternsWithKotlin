package creational.com.iluwatar.prototype

data class ElfMage(private val helpType: String) : Mage() {

    constructor(elfMage: ElfMage) : this(elfMage.helpType)

    @Throws(CloneNotSupportedException::class)
    override fun copy(): ElfMage {
        return ElfMage(this)
    }

    override fun toString(): String {
        return "Elven mage helps in $helpType"
    }
}