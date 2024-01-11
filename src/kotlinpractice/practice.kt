package kotlinpractice

class practice : veg {
   override fun ex() {

   }
}

fun main() {
    val itemList : List<items> = listOf(items("biryani","rice with chicken","image",15.5f,90f));
    for (item in itemList){
        println(item)
    }
}