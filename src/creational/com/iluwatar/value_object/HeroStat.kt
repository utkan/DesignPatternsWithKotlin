package creational.com.iluwatar.value_object

data class HeroStat// All constructors must be private.
private constructor(
        val strength: Int,
        val intelligence: Int,
        val luck: Int) {

    companion object {

        // Static factory method to create new instances.
        fun valueOf(strength: Int, intelligence: Int, luck: Int): HeroStat {
            return HeroStat(strength, intelligence, luck)
        }
    }

    // The clone() method should not be public. Just don't override it.

}