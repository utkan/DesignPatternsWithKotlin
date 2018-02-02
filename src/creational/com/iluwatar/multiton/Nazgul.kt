package creational.com.iluwatar.multiton

class Nazgul private constructor(val name: NazgulName) {
    companion object {
        private var nazguls = mapOf(
                NazgulName.KHAMUL to Nazgul(NazgulName.KHAMUL),
                NazgulName.MURAZOR to Nazgul(NazgulName.MURAZOR),
                NazgulName.DWAR to Nazgul(NazgulName.DWAR),
                NazgulName.JI_INDUR to Nazgul(NazgulName.JI_INDUR),
                NazgulName.AKHORAHIL to Nazgul(NazgulName.AKHORAHIL),
                NazgulName.HOARMURATH to Nazgul(NazgulName.HOARMURATH),
                NazgulName.ADUNAPHEL to Nazgul(NazgulName.ADUNAPHEL),
                NazgulName.REN to Nazgul(NazgulName.REN),
                NazgulName.UVATHA to Nazgul(NazgulName.UVATHA)
        )

        fun getInstance(name: NazgulName): Nazgul? {
            return nazguls[name]
        }
    }

    override fun toString(): String {
        return name.name
    }
}