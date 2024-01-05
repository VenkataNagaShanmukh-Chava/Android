package Stings;

import java.util.Arrays;

public class Main {
    public static String reverse(String s){
        String rWord = "";
        char ch;
        for (int i=s.length()-1; i>=0;i--){
            ch = s.charAt(i);
            rWord = rWord+ch;
        }
        return rWord;
    }
    public static StringBuilder reverse(StringBuilder s){
        s.reverse();
        return s;
    }
    public static boolean palindrome(String s){
        String rWord = reverse(s);
        return s.equals(rWord);
    }
    public static String[] countWords(String s){
        String[] count = s.split(" ");
        return count;
    }
    public static StringBuilder reverseSentence(String s) {
        String[] r = s.split("\\s");
        StringBuilder output = new StringBuilder();
        for (int i=r.length-1;i>=0;i--){
            output.append(r[i]);
            if (i>0){
                output.append(" ");
            }
        }
        return output;
    }

//    public static String uniqueLetters(String s){
//        String[] letters;
//        for (int i =0; i<s.length();i++){
//            if s.charAt(i)
//        }
//    }
    public static void main(String[] args) {
        System.out.println(reverse(new StringBuilder("shanmukh")));
        System.out.println(reverse("shanu"));
        System.out.println(palindrome("pip"));
        System.out.println(countWords("How are you")[0]);
        System.out.println(reverseSentence("How, are you"));
    }

}
