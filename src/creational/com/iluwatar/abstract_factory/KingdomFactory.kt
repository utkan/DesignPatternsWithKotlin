package creational.com.iluwatar.abstract_factory

interface KingdomFactory {
    fun createCastle(): Castle

    fun createKing(): King

    fun createArmy(): Army
}