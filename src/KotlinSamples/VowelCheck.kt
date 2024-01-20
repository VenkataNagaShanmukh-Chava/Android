package KotlinSamples

class VowelCheck {
    fun check(s:String): Int {
        val v:List<Char> = listOf('a','e','i','o','u')
        val a = s.lowercase()
        var c =0
        for (i in a){
            if (i in v) c++
        }
        return c
    }
}

fun main() {
    val obj = VowelCheck();
    println(obj.check("Hello"))
}