package codingChallenges;

import java.util.Scanner;

public class isVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String s = input.nextLine();
        int counter = 0;
        for (char ch: s.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

                counter+=1;
            }
        }
        if (counter ==0){
            System.out.println("No vowel present");
        } else {
            System.out.println("Vowel is present");
            System.out.println("number of vowels " + counter);
        }

    }
}
