package creational.com.iluwatar.abstract_factory

class OrcCastle : Castle {
    override fun getDescription() = DESCRIPTION

    companion object {
        private val DESCRIPTION = "This is the Orc castle!"
    }
}