package creational.com.iluwatar.abstract_factory

class ElfKing : King {
    override fun getDescription() = DESCRIPTION

    companion object {
        private val DESCRIPTION = "This is the Elven king!"
    }
}