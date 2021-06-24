package Chapter6;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and the integer power: ");
        int integerInputByUser= input.nextInt();
        int integerPowerInputByUser = input.nextInt();
        System.out.print("The exponential of: " + integerInputByUser + " raise to power " + integerPowerInputByUser + " is: " + exponent(integerInputByUser,integerPowerInputByUser));
    }

    private static double exponent(int integerInputByUser, int integerPowerInputByUser) {
        return Math.pow(integerInputByUser, integerPowerInputByUser);
    }
}
