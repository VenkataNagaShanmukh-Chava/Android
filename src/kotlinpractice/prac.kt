package kotlinpractice

class prac {

    fun sum(a:Int,b:Int): Unit? {
        return null
    }

}


fun main () {
//    print("Enter text: ")
//    val stringInput : String = readln()
//    when(stringInput){
//        "abc" -> (println("abc is input"))
//        "b" -> (println("b is entered"))
//        in listOf("a","c","d") -> (println("a,c,d is entered"))
//        else -> {
//            println("ivalid input")
//        }
//    }

    loop1@ for (i in 1..10){
        loop2@ for (j in 1..10){
            if (i*j > 5){
                break@loop2
            }
            println(j)
//            break@loop1
        }

        println("@@@@@@@@@@@@@@@@@@@@@@@@@")
        println(i)
        println("-------------------------")
        continue@loop1
    }

    val a: Int = 8
    val b: Int? = null
    val k :Int ? =null
    val ob = prac()
    val c = ob.sum(5, 6) ?: println("null")
    val l = b ?: -1
    val arr = listOf("ab","a","d")
    val asize = arr.size ?: -1
    val g = k?.toString()?.length ?: -1

    println(asize)
    println(l)
}

