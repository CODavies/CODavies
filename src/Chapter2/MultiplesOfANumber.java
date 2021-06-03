package Chapter2;

import java.util.Scanner;

public class MultiplesOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        if (firstNumber % secondNumber ==0){
            boolean isMultiple = true;
            System.out.println(secondNumber  + " is a multiple of " + firstNumber);
        }
        else{
            System.out.println(secondNumber + " is not a multiple of " + firstNumber);
        }
    }
}
