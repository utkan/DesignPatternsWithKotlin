package behavioral.com.iluwatar.dependency.injection

/**
 * AdvancedWizard implements inversion of control. It depends on abstraction that can be injected
 * through its constructor.
 */
class AdvancedWizard(private val tobacco: Tobacco) : Wizard {

    override fun smoke() {
        tobacco.smoke(this)
    }
}