fun main(args: Array<String>) {

    // Kotlin
    val myString: String = null // compile error

    val nullableStr: String? = null

    val lengthStr1 = nullableStr.length // compile error

    val lengthStr2 = nullableStr?.length

    val lengthStr3 = nullableStr!!.length // return a non-null value

    val lengthStr4 = nullableStr?.length ?: -1



}