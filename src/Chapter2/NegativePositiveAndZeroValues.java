package Chapter2;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        int positiveValues = 0;
        int negativeValues = 0;
        int zeroValues = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.print("Enter forth number: ");
        int forthNumber = input.nextInt();
        System.out.print("Enter fifth number: ");
        int fifthNumber = input.nextInt();
        if(firstNumber > 0){
            positiveValues++;
        }else if (firstNumber == 0){
            zeroValues++;
        }else {
            negativeValues++;
        }
        if (secondNumber > 0){
            positiveValues++;
        }else if (secondNumber == 0){
            zeroValues++;
        }else {
            negativeValues++;
        }
        if (thirdNumber > 0){
            positiveValues++;
        }else if (thirdNumber == 0){
            zeroValues++;
        }else {
            negativeValues++;
        }
        if (forthNumber > 0){
            positiveValues++;
        }else if (forthNumber == 0){
            zeroValues++;
        }else {
            negativeValues++;
        }
        if (fifthNumber > 0){
            positiveValues++;
        }else if (fifthNumber == 0){
            zeroValues++;
        }else if (fifthNumber < 0){
            negativeValues++;
        }
        System.out.println("The total positive numbers are: " + positiveValues);
        System.out.println("The total negative numbers are: " + negativeValues);
        System.out.println("The total zero numbers are: " + zeroValues);
    }
}
