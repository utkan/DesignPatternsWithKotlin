package behavioral.com.iluwatar.dependency.injection

import kotlin.properties.Delegates

/**
 * AdvancedSorceress implements inversion of control. It depends on abstraction that can be injected
 * through its setter.
 */
class AdvancedSorceress : Wizard {

    private lateinit var tobacco: Tobacco

    fun setTobacco(tobacco: Tobacco) {
        this.tobacco = tobacco
    }

    override fun smoke() {
        tobacco.smoke(this)
    }
}