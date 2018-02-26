package creational.com.iluwatar.prototype

interface HeroFactory {

    fun createMage(): Mage?

    fun createWarlord(): Warlord?

    fun createBeast(): Beast?
}