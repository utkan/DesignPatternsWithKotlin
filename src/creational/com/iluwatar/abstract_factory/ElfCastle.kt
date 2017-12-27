package creational.com.iluwatar.abstract_factory

class ElfCastle : Castle {
    override fun getDescription() = DESCRIPTION

    companion object {
        private val DESCRIPTION = "This is the Elven castle!"
    }
}