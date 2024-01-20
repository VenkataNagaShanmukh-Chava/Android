package KotlinSamples

class CountCHar {
    fun count(s:String, c:Char): Int{
        val s = s.lowercase()
        var a =0
        for (i in s.indices){
            if (s[i] == c){
                a++
            }
        }
    return a
    }
}

fun main() {
    val obj = CountCHar()
    println(obj.count("hello", 'l'))
}