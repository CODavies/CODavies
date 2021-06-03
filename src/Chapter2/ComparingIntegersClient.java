package Chapter2;

import java.util.Scanner;

public class ComparingIntegersClient {
    public static void main(String[] args) {
    ComparingIntegers comparingIntegers = new ComparingIntegers();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println( comparingIntegers.getLargerNumber(firstNumber, secondNumber) );
        System.out.println(comparingIntegers.numbersAreEqual(firstNumber, secondNumber) );

    }

}