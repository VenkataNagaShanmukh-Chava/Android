package Stings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assign {
    int countChar(char c,String s){
        int count=0;
        if (s.isEmpty() || c == ' ') {
            System.out.println("Message or character is not passed");
        } else {
            String l = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count += 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character to be searched");
        char inputChar = input.nextLine().toCharArray()[0];
        System.out.println("Enter message");
        String message = input.nextLine();

        Assign assign = new Assign();
        int c = assign.countChar(inputChar,message);
        System.out.println(c);
        input.close();
    }
}
