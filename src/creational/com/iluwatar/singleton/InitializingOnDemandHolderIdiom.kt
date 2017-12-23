package creational.com.iluwatar.singleton

class InitializingOnDemandHolderIdiom private constructor() {
    companion object {
       val INSTANCE: InitializingOnDemandHolderIdiom by lazy {
            InitializingOnDemandHolderIdiom()
        }
    }
}