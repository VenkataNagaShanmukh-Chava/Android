package codingChallenges;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        while (true) {
            System.out.println("Enter operation + , - , * , / or stop ");
            String operation = input.next();
            if (operation.equals("stop")){
                System.out.println("total: " + number1 );
                break;
            }
            System.out.println("Enter the Number");
            double number2 = input.nextDouble();


            switch (operation){
                case "+" :
                    number1 += number2;
                    break;
                case "-" :
                    number1 -= number2;
                    break;
                case "*" :
                    number1 *=number2;
                    break;
                case "/" :
                    try {
                        number1 /= number2;
                    } catch (ArithmeticException e) {
                        throw new RuntimeException("Cannot divide by 0");
                    }
            }
            System.out.println("running total: "+ number1);
        }

    }

}
