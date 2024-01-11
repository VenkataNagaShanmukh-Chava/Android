package codingChallenges;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the first number: ");
            double number1 = input.nextDouble();

            System.out.println("Enter operation + , - , * , / ");
            String operation = input.next();

            System.out.println("Enter the Second Number");
            double number2 = input.nextDouble();

            double res = 0;
            switch (operation){
                case "+" :
                    res = number1 + number2;
                    break;
                case "-" :
                    res = number1 - number2;
                    break;
                case "*" :
                    res = number1*number2;
                    break;
                case "/" :
                    try {
                        res = number1/number2;
                    } catch (ArithmeticException e) {
                        throw new RuntimeException("Cannot divide by 0");
                    }

            }
            System.out.println(res);
            System.out.println("Do you want to continue?(yes/no)");
            String continueOption = input.next().toLowerCase();
            if (!continueOption.equals("yes")) {
                break;
            }

        }

    }

}
