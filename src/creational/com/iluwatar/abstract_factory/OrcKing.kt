package creational.com.iluwatar.abstract_factory

class OrcKing : King {
    override fun getDescription() = DESCRIPTION

    companion object {
        private val DESCRIPTION = "This is the Orc king!"
    }
}