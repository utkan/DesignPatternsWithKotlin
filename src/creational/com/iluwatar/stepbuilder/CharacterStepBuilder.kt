package creational.com.iluwatar.stepbuilder

import java.util.ArrayList

object CharacterStepBuilder {

    fun newBuilder(): NameStep {
        return CharacterSteps()
    }

    interface NameStep {
        fun name(name: String): ClassStep
    }

    interface ClassStep {
        fun fighterClass(fighterClass: String): WeaponStep

        fun wizardClass(wizardClass: String): SpellStep
    }

    interface WeaponStep {
        fun withWeapon(weapon: String): AbilityStep

        fun noWeapon(): BuildStep
    }

    interface SpellStep {
        fun withSpell(spell: String): AbilityStep

        fun noSpell(): BuildStep
    }

    interface AbilityStep {
        fun withAbility(ability: String): AbilityStep

        fun noMoreAbilities(): BuildStep

        fun noAbilities(): BuildStep
    }

    interface BuildStep {
        fun build(): Character
    }

    private class CharacterSteps : NameStep, ClassStep, WeaponStep, SpellStep, AbilityStep, BuildStep {

        private lateinit var name: String
        private var fighterClass: String? = null
        private var wizardClass: String? = null
        private var weapon: String? = null
        private var spell: String? = null
        private val abilities = ArrayList<String>()

        override fun name(name: String): ClassStep {
            this.name = name
            return this
        }

        override fun fighterClass(fighterClass: String): WeaponStep {
            this.fighterClass = fighterClass
            return this
        }

        override fun wizardClass(wizardClass: String): SpellStep {
            this.wizardClass = wizardClass
            return this
        }

        override fun withWeapon(weapon: String): AbilityStep {
            this.weapon = weapon
            return this
        }

        override fun noWeapon(): BuildStep {
            return this
        }

        override fun withSpell(spell: String): AbilityStep {
            this.spell = spell
            return this
        }

        override fun noSpell(): BuildStep {
            return this
        }

        override fun withAbility(ability: String): AbilityStep {
            this.abilities.add(ability)
            return this
        }

        override fun noMoreAbilities(): BuildStep {
            return this
        }

        override fun noAbilities(): BuildStep {
            return this
        }

        override fun build(): Character {
            val character = Character(name)

            if (fighterClass != null) {
                character.fighterClass = fighterClass
            } else {
                character.wizardClass = wizardClass
            }

            if (weapon != null) {
                character.weapon = weapon
            } else {
                character.spell = spell
            }

            if (!abilities.isEmpty()) {
                character.abilities = abilities
            }

            return character
        }
    }
}