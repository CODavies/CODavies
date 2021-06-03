package Chapter2;

import java.util.Scanner;

public class EvenOrOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberEnteredByUser = input.nextInt();
        if (numberEnteredByUser > 1 && numberEnteredByUser %2==0){

            boolean isEven = true;
            System.out.println(numberEnteredByUser + " is even");
        }
        else {
            System.out.println(numberEnteredByUser + " is not even, " + numberEnteredByUser + " is odd");
        }
    }
}
