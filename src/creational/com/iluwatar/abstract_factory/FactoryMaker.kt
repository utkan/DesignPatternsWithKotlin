package creational.com.iluwatar.abstract_factory

class FactoryMaker {
    companion object {
        fun makeFactory(kingdomType: KingdomType): KingdomFactory {
            return when (kingdomType) {
                KingdomType.ELF -> ElfKingdomFactory()
                KingdomType.ORC -> OrcKingdomFactory()
            }
        }
    }
}