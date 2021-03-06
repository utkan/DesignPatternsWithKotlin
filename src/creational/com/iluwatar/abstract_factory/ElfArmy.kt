package creational.com.iluwatar.abstract_factory

class ElfArmy : Army {
    override fun getDescription() = DESCRIPTION

    companion object {
        private val DESCRIPTION = "This is the Elven Army!"
    }
}