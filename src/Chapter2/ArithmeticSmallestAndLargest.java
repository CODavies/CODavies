package Chapter2;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        int largestNumber;
        int smallestNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum is: " + sum);
        int product = firstNumber * secondNumber * thirdNumber;
        System.out.println("The product is " + product);
        int average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average is: " + average);
        largestNumber = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        smallestNumber = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        System.out.println(largestNumber + " is the largest number ");
        System.out.println(smallestNumber + " is the smallest number");
    }
}

