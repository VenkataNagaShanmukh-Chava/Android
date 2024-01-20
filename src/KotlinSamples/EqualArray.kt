package KotlinSamples

class EqualArray {
    fun isEqual(array1: Array<Int> , array2: Array<Int>): Boolean{
        return array1.contentEquals(array2)
    }
}

fun main() {
    val obj = EqualArray()
    val a1: Array<Int> = arrayOf(1,2,3,4)
    val a2: Array<Int> = arrayOf(1,2,3,4)
    println(obj.isEqual(a1,a2))
}