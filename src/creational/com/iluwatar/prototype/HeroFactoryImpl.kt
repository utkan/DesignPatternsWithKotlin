package creational.com.iluwatar.prototype

class HeroFactoryImpl
(private val mage: Mage, private val warlord: Warlord, private val beast: Beast) : HeroFactory {

    override fun createMage(): Mage? {
        return try {
            mage.copy()
        } catch (e: CloneNotSupportedException) {
            null
        }
    }

    override fun createWarlord(): Warlord? {
        return try {
            warlord.copy()
        } catch (e: CloneNotSupportedException) {
            null
        }
    }

    override fun createBeast(): Beast? {
        return try {
            beast.copy()
        } catch (e: CloneNotSupportedException) {
            null
        }
    }
}