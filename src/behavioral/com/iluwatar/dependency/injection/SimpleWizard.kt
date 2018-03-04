package behavioral.com.iluwatar.dependency.injection

/**
 * Naive Wizard implementation violating the inversion of control principle. It should depend on
 * abstraction instead.
 */
class SimpleWizard : Wizard {

    private val tobacco = OldTobyTobacco()

    override fun smoke() {
        tobacco.smoke(this)
    }
}