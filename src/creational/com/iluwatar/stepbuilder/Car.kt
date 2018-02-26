package creational.com.iluwatar.stepbuilder

data class Car(private val model: String?, private val year: Int, private val required: String) {

    private constructor(builder: Builder) : this(builder.model, builder.year, builder.required)

    companion object {
        inline fun build(required: String, block: Builder.() -> Unit) = Builder(required).apply(block).build()
    }

    class Builder(val required: String) {
        var model: String? = null
        var year: Int = 0

        fun build() = Car(this)
    }
}