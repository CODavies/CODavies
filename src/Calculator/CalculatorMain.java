package Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        int sentinel = 1;
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        while (sentinel != -1) {
            System.out.println("""
                    What function would you want to perform?
                    Press 1 for addition
                    Press 2 for subtraction
                    Press 3 for division
                    Press 4 for multiplication
                    Press 5 for sin
                    Press 6 for tan
                    Press 7 for cos 
                    Press 8 to exit                       
                    """);

            int userOption = input.nextInt();

            switch (userOption) {
                case 1 -> {
                    int total =0;

                    System.out.println("Enter first number");
                    int firstNumber = input.nextInt();

                    System.out.println("Your answer is: " + Calculator.addition(firstNumber));
                }
                case 2 -> {
                    System.out.println("Enter first number");
                    int firstNumber = input.nextInt();
                    System.out.println("Enter second numbers");
                    int secondNumber = input.nextInt();
                    System.out.println("Your answer is: " + Calculator.subtraction(firstNumber, secondNumber));
                }
                case 3 -> {
                    System.out.println("Enter first number");
                    int firstNumber = input.nextInt();

                    System.out.println("Your answer is: " + Calculator.division(firstNumber));
                }
                case 4 -> {
                    System.out.println("Enter first number");
                    int firstNumber = input.nextInt();
                    System.out.println("Enter second numbers");
                    int secondNumber = input.nextInt();
                    System.out.println("Your answer is: " + Calculator.multiplication(firstNumber, secondNumber));
                }
                case 5 -> {
                    System.out.println("Enter number");
                    int number = input.nextInt();
                    System.out.println("Your answer is: " + calculator.convertToSin(number));
                }
                case 6 -> {
                    System.out.println("Enter number");
                    int number = input.nextInt();
                    System.out.println("Your answer is: " + calculator.convertToTan(number));
                }
                case 7 -> {
                    System.out.println("Enter number");
                    int number = input.nextInt();
                    System.out.println("Your answer is: " + calculator.convertToCos(number));
                }
                case 8 -> {
                    sentinel = -1;
                }
                default -> {
                    System.out.println("Invalid input, please input a number between 1 - 8");
                }

            }
        }

    }
}

