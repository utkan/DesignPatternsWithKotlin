package creational.com.iluwatar.prototype

data class ElfBeast(private val helpType: String) : Beast() {

    constructor(elfBeast: ElfBeast) : this(elfBeast.helpType)

    @Throws(CloneNotSupportedException::class)
    override fun copy(): Beast {
        return ElfBeast(this)
    }

    override fun toString(): String {
        return "Elven eagle helps in $helpType"
    }
}