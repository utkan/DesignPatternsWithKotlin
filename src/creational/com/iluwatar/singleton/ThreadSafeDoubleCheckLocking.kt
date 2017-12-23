package creational.com.iluwatar.singleton

class ThreadSafeDoubleCheckLocking private constructor() {
    init {
        if (instanceHolder != null) {
            throw IllegalStateException("Already initialized.")
        }
    }
    companion object {
        @Volatile
        private var instanceHolder: ThreadSafeDoubleCheckLocking? = null

        fun getInstance(): ThreadSafeDoubleCheckLocking? {

            var result: ThreadSafeDoubleCheckLocking? = instanceHolder

            if (result == null) {
                synchronized(ThreadSafeDoubleCheckLocking::class.java) {
                    result = instanceHolder
                    if (result == null) {
                        result = ThreadSafeDoubleCheckLocking()
                        result?.let {
                            instanceHolder = it
                        }
                    }
                }
            }
            return instanceHolder
        }
    }
}