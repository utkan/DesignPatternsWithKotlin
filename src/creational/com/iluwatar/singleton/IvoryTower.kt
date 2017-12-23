package creational.com.iluwatar.singleton

class IvoryTower private constructor() {
    companion object {
        private val INSTANCE = IvoryTower()
        fun getInstance(): IvoryTower {
            return INSTANCE
        }
    }
}