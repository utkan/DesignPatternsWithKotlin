package creational.com.iluwatar.stepbuilder

data class Character(val name: String) {
    var fighterClass: String? = null
    var wizardClass: String? = null
    var weapon: String? = null
    var spell: String? = null
    var abilities: List<String>? = null

    override fun toString(): String {
        return "This is a ${fighterClass ?: wizardClass} named $name armed with a ${weapon ?: spell
        ?: "with nothing"} " + abilities?.let { " and wielding $it" } ?: ""
    }
}