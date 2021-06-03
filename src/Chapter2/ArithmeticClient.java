package Chapter2;

import java.util.Scanner;

public class ArithmeticClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Arithmetic arithmetic = new Arithmetic();
        System.out.printf("Enter first number: ");
        int firstNUmberFromUser = input.nextInt();
        System.out.printf("Enter second number: ");
        int secondNumberFromUser = input.nextInt();
        System.out.println("The sum of the numbers are: " + arithmetic.SumTwoNumbers(firstNUmberFromUser, secondNumberFromUser));
        System.out.println("The product of the numbers are: " + arithmetic.productOfTwoNumbers(firstNUmberFromUser, secondNumberFromUser));
        System.out.println("The difference of the numbers are: " + arithmetic.differenceOfTwoNumbers(firstNUmberFromUser, secondNumberFromUser));
        System.out.println("The quotient of the numbers are: " + arithmetic.quotientOfTwoNumbers(firstNUmberFromUser, secondNumberFromUser));

    }
}
