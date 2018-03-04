package behavioral.com.iluwatar.dependency.injection

import javax.inject.Inject

/**
 *
 * GuiceWizard implements inversion of control. Its dependencies are injected through its
 * constructor by Guice framework.
 *
 */
class GuiceWizard @Inject
constructor(private val tobacco: Tobacco) : Wizard {

    override fun smoke() {
        tobacco.smoke(this)
    }
}