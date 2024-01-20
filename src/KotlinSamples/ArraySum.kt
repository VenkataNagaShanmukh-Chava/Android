package KotlinSamples


fun main() {
    val arr = listOf(10,20,30,50)
    val s : Int = arr.fold(0) {acc, i -> acc + i  }
    val a : List<Int> = arr.scan(0,) { acc, i -> acc + i  }
    println(s)
    println(a)
}