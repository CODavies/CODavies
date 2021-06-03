package Chapter2;

import java.util.Scanner;

public class MaximumAndMinimunOfFiveNumbers {
    public static void main(String[] args) {
        int largestNumber = 0;
        int smallestNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.print("Enter fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.print("Enter fifth number: ");
        int fifthNumber = input.nextInt();
        if(firstNumber> secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber){
            largestNumber = firstNumber;
            if(firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber){
                smallestNumber = firstNumber;
            }else if(secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){
                smallestNumber = secondNumber;
            }
            else if(thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){
                smallestNumber = thirdNumber;
            }else if(fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){
                smallestNumber = fourthNumber;
            } else if (fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber) {
                smallestNumber = fifthNumber;
            }
        }else {
            if (secondNumber <= firstNumber || secondNumber <= thirdNumber || secondNumber <= fourthNumber || secondNumber <= fifthNumber) {
                if(thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber){
                    largestNumber = thirdNumber;
                }else if(fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber){
                    largestNumber = fourthNumber;
                } else if (fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber) {
                    largestNumber = fifthNumber;
                }
            } else {
                largestNumber = secondNumber;
            }
            if(firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber){
                smallestNumber = firstNumber;
            }else if(secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){
                smallestNumber = secondNumber;
            }
            else if(thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){
                smallestNumber = thirdNumber;
            }else if(fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){
                smallestNumber = fourthNumber;
            } else if (fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber) {
                smallestNumber = fifthNumber;
            }
        }
        System.out.println(largestNumber + " is the largest number ");
        System.out.println(smallestNumber + " is the smallest number");
    }

}
