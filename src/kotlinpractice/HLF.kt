package kotlinpractice

class HLF {
    fun l(hl:(String) -> Int){
        println(hl("hello"))
    }
}

fun main() {
    val a:(Int,Int) -> Int = {a:Int,b:Int -> a+b}

    val s:(String) -> Int = {s:String -> s.length}

    val ob = HLF()

    println(ob.l(s))
}