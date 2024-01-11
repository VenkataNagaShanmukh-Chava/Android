package collectionslocal;

import java.util.HashMap;
import java.util.Scanner;

public class Assign {
    HashMap<Character, Integer> countLetters(String str) {
        HashMap<Character, Integer> letterCountMap = new HashMap<>();
        if (str.isEmpty()) {
            System.out.println("Input string is empty");
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                letterCountMap.put(ch, letterCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        return letterCountMap;
    }
    public static void main(String[] args) {
        Assign assign = new Assign();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        HashMap<Character,Integer> output= assign.countLetters(str);
        System.out.println(output);
    }
}
