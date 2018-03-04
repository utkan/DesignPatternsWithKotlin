package behavioral.com.iluwatar.dependency.injection

import com.google.inject.Guice
import com.google.inject.Injector
import org.apache.log4j.BasicConfigurator

/**
 * Dependency Injection pattern deals with how objects handle their dependencies. The pattern
 * implements so called inversion of control principle. Inversion of control has two specific rules:
 * - High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * - Abstractions should not depend on details. Details should depend on abstractions.
 *
 *
 * In this example we show you three different wizards. The first one ([SimpleWizard]) is a
 * naive implementation violating the inversion of control principle. It depends directly on a
 * concrete implementation which cannot be changed.
 *
 *
 * The second and third wizards([AdvancedWizard] and [AdvancedSorceress]) are more flexible.
 * They do not depend on any concrete implementation but abstraction. They utilizes Dependency Injection
 * pattern allowing their [Tobacco] dependency to be injected through constructor ([AdvancedWizard])
 * or setter ([AdvancedSorceress]). This way, handling the dependency is no longer the wizard's
 * responsibility. It is resolved outside the wizard class.
 *
 *
 * The fourth example takes the pattern a step further. It uses Guice framework for Dependency
 * Injection. [TobaccoModule] binds a concrete implementation to abstraction. Injector is then
 * used to create [GuiceWizard] object with correct dependencies.
 */
object App {

    /**
     * Program entry point
     *
     * @param args command line args
     */
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        SimpleWizard().smoke()

        AdvancedWizard(SecondBreakfastTobacco()).smoke()

        AdvancedSorceress().apply {
            setTobacco(SecondBreakfastTobacco())
        }.smoke()

        with(Guice.createInjector(TobaccoModule())) {
            getInstance(GuiceWizard::class.java).smoke()
        }
    }
}