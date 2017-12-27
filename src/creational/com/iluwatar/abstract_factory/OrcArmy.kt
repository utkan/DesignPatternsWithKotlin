package creational.com.iluwatar.abstract_factory

class OrcArmy : Army {
    override fun getDescription() = DESCRIPTION

    companion object {
        private val DESCRIPTION = "This is the Orc Army!"
    }
}