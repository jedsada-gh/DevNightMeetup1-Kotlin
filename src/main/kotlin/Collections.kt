//fun main(args: Array<String>) {
//
//    // Kotlin
//    val listFruits: List<String> = listOf("apple", "coconut",
//            "mango", "avocado")
//    listFruits.add("cherry") // compile error
//
//    val mutableFruits: MutableList<String> = mutableListOf("apple",
//            "coconut", "mango", "avocado")
//    mutableFruits.add("cherry")
//
//    for (value in mutableFruits) {
//        println(value)
//    }
//
//    for ((index, value) in mutableFruits.withIndex()) {
//        println("$value at $index")
//    }
//
//    // Functional Programming (FP)
//    mutableFruits.forEach { println(it) }
//    mutableFruits.forEachIndexed { index, value -> println("$value at $index") }
//    val filter = mutableFruits.filter { it.startsWith("a") }
//    println(filter) // output -> [apple, avocado]
//
//
//}