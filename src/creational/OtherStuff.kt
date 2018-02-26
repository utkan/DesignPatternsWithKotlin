package creational

fun sumFactors(): (Int) -> Int = { num ->
    println("num is ${num}")
    num * 2
}

fun doOtherStuff(it: Int) {
    println("other stuff done: ${it}")
}

fun main(args: Array<String>) {
    val deferredComputation = sumFactors()
    deferredComputation.also { doOtherStuff(-1) }.invoke(3).also { doOtherStuff(it) }
}