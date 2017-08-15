fun main(args: Array<String>) {

    // Kotlin
    var xo: Any = 4

    val result = when (xo) {
        is Int -> {
            println(xo.plus(6))
            "xo is Int"
        }
        is String -> {
            println(xo.length)
            "xo is String"
        }
        else -> "xo is unknown"
    }

    println(result) // output
                    // 10
                    // xo is Int





}



