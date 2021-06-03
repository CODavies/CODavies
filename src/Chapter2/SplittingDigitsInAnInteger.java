package Chapter2;

import java.util.Scanner;

public class SplittingDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int firstDigit= number / 10000;
        int secondDigit = (number % 10000) / 1000;
        int thirdNumber = ((number % 1000) % 1000) / 100;
        int forthNumber = (((number %1000) % 1000) % 100) / 10;
        int fifthNumber = ((((number % 1000) % 1000) % 100) % 10);
        System.out.println(firstDigit + " " + secondDigit + " " + thirdNumber + " " + forthNumber + " " + fifthNumber );
    }

}
