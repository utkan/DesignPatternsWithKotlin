package creational.com.iluwatar.objectpool

class OliphauntPool : ObjectPool<Oliphaunt>() {

    override fun create(): Oliphaunt {
        return Oliphaunt()
    }
}