package codingChallenges;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner();
        while (true) {
            System.out.print("Enter the first number: ");
            double number1 = input.nextDouble();

            System.out.println("Enter operation + , - , * , /  or stop");
            String operation = input.nextLine();
            System.out.println("Enter the Second Number");
        }
    }

}
