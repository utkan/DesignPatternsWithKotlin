package behavioral.com.iluwatar.memento

import kotlin.properties.Delegates

/**
 *
 * Star uses "mementos" to store and restore state.
 *
 */
data class Star(private var type: StarType, private var ageYears: Int, private var massTons: Int) {

    internal var memento: StarMemento
        get() {
            val state = StarMementoInternal()
            state.ageYears = ageYears
            state.massTons = massTons
            state.type = type
            return state

        }
        set(memento) {
            val state = memento as StarMementoInternal
            this.type = state.type
            this.ageYears = state.ageYears
            this.massTons = state.massTons

        }

    /**
     * Makes time pass for the star
     */
    fun timePasses() {
        ageYears *= 2
        massTons *= 8
        when (type) {
            StarType.RED_GIANT -> type = StarType.WHITE_DWARF
            StarType.SUN -> type = StarType.RED_GIANT
            StarType.SUPERNOVA -> type = StarType.DEAD
            StarType.WHITE_DWARF -> type = StarType.SUPERNOVA
            StarType.DEAD -> {
                ageYears *= 2
                massTons = 0
            }
//            else -> {
//            }
        }
    }

    override fun toString(): String {
        return "$type age: $ageYears years mass: $massTons tons"
    }

    /**
     *
     * StarMemento implementation
     *
     */
    private class StarMementoInternal : StarMemento {
        lateinit var type: StarType
        var ageYears: Int by Delegates.notNull()
        var massTons: Int by Delegates.notNull()

        override fun toString(): String {
            return "$type age: $ageYears years mass: $massTons tons"
        }
    }
}