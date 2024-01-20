package KotlinSamples

fun main() {
    val array : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val r = array.filter { it > 5 }

    val a : Array<String> = arrayOf("abc","bcde","abc")
    val r1 = a.filter { it == "abc" }
    println(r)
    println(r1.size)

}