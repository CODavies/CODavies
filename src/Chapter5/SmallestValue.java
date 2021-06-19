package Chapter5;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int smallest = 0;
        int secondNumber = 0;
        System.out.print("Enter a number: ");
        int firstNumberFromUser = input.nextInt();
        smallest = firstNumberFromUser;
        for (counter = 1; counter <= 4; counter++) {
            System.out.print("Enter a number: ");
            secondNumber = input.nextInt();

            if (smallest > secondNumber) {
                smallest = secondNumber;
            } else
                smallest = firstNumberFromUser;

        }
        System.out.println("The smallest number is: " + smallest);
    }
}
