package behavioral.com.iluwatar.dependency.injection

import com.google.inject.AbstractModule

/**
 * Guice module for binding certain concrete [Tobacco] implementation.
 */
class TobaccoModule : AbstractModule() {

    override fun configure() {
        bind(Tobacco::class.java).to(RivendellTobacco::class.java)
    }
}