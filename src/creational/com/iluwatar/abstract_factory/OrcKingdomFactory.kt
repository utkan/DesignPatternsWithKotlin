package creational.com.iluwatar.abstract_factory

class OrcKingdomFactory : KingdomFactory {
    override fun createCastle() = OrcCastle()

    override fun createKing() = OrcKing()

    override fun createArmy() = OrcArmy()

}