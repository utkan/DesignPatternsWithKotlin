package creational.com.iluwatar.singleton

class ThreadSafeLazyLoadedIvoryTower private constructor() {
    companion object {
        val INSTANCE: ThreadSafeLazyLoadedIvoryTower? by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            ThreadSafeLazyLoadedIvoryTower()
        }
    }
}