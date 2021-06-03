package Chapter2;

import java.util.Scanner;

public class SquaresAndCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int numberEnteredByUser = input.nextInt();
        if (numberEnteredByUser >= 0 && numberEnteredByUser <= 10) {
            System.out.printf("%s%10s%10s%n", "Number", " Square", "Cube");
            System.out.println("__________________________");
            System.out.printf("%d%10d%13d%n", numberEnteredByUser, (numberEnteredByUser * numberEnteredByUser), (numberEnteredByUser * numberEnteredByUser * numberEnteredByUser));
        } else {
            System.out.println("Input a number between 0 and 10");
        }
    }
}
