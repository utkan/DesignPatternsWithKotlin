package creational.com.iluwatar.property

import java.util.HashMap

class Character : Prototype {

    private val prototype: Prototype
    private val properties = HashMap<Stats, Int?>()

    private lateinit var name: String
    private lateinit var type: Type

    enum class Type {
        WARRIOR, MAGE, ROGUE
    }

    constructor() {
        this.prototype = object : Prototype { // Null-value object
            override fun get(stat: Stats): Int? {
                return null
            }

            override fun has(stat: Stats): Boolean {
                return false
            }

            override fun set(stat: Stats, value: Int?) {}

            override fun remove(stat: Stats) {}
        }
    }

    constructor(type: Type, prototype: Prototype) {
        this.type = type
        this.prototype = prototype
    }

    constructor(name: String, prototype: Character) {
        this.name = name
        this.type = prototype.type
        this.prototype = prototype
    }

    override fun get(stat: Stats): Int? {
        val containsValue = properties.containsKey(stat)
        return if (containsValue) {
            properties[stat]
        } else {
            prototype.get(stat)
        }
    }

    override fun has(stat: Stats): Boolean {
        return get(stat) != null
    }

    override fun set(stat: Stats, value: Int?) {
        properties[stat] = value
    }

    override fun remove(stat: Stats) {
        properties[stat] = null
    }

    override fun toString(): String {
        val builder = StringBuilder()
                .append("Player: $name")
                .append('\n')
                .append("Character type: ${type.name}")
                .append('\n')
                .append("Stats:\n")
        Stats.values().forEach { stat ->
            val value = this.get(stat)
            value?.let {
                builder.append(" - ${stat.name}")
                        .append(": $it")
                        .append('\n')
            }
        }
        return builder.toString()
    }
}