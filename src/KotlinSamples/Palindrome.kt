package KotlinSamples

import java.util.Scanner

class Palindrome {
    fun palindrome(a : String) : Boolean{
        val s = a.lowercase();
        var l = 0
        var r = s.length-1
        while (l<r){
            if (s[l] != s[r]) {
                return false
            }
            l++
            r--
        }
        return true
    }
}

fun main(){
    val input: String =  readln()
    val obj = Palindrome()
    println(obj.palindrome(input))
}