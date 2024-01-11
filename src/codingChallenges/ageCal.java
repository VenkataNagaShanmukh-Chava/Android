package codingChallenges;

import java.util.Scanner;

public class ageCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date of birth or year");
        String s = input.nextLine();
        String[] spls = s.split("/");
//        System.out.println(spls[spls.length-1]);
        int a = Integer.parseInt(spls[spls.length-1]);
        int compu = 2023 - a;
        System.out.println("age " + compu);
    }
}
