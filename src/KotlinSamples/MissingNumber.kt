package KotlinSamples

fun main() {
    val arr: Array<Int> = arrayOf(1,2,3,4,5,6,8,9,10)
    var a:Int = 1
    for (i in arr){
        if (a != i){
           println(a)
            break
        }
        a++
    }
}