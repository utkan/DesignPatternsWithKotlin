package creational.com.iluwatar.abstract_factory

fun main(args: Array<String>) {
    println("Elf Kingdom")
    val elfKingdom = createKingdom(FactoryMaker.makeFactory(KingdomType.ELF))
    println(elfKingdom.army.getDescription())
    println(elfKingdom.castle.getDescription())
    println(elfKingdom.king.getDescription())

    println("Orc Kingdom")
    val orcKingdom = createKingdom(FactoryMaker.makeFactory(KingdomType.ORC))
    println(orcKingdom.army.getDescription())
    println(orcKingdom.castle.getDescription())
    println(orcKingdom.king.getDescription())
}

fun createKingdom(kingdomFactory: KingdomFactory): Kingdom {
    return Kingdom(
            kingdomFactory.createKing(),
            kingdomFactory.createCastle(),
            kingdomFactory.createArmy()
    )
}

data class Kingdom(val king: King, val castle: Castle, val army: Army)