package Chapter6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integerUserHasEnteredToCheckIfNumberISPerfect = input.nextInt();
        boolean result = isPerfect(integerUserHasEnteredToCheckIfNumberISPerfect);
        System.out.println(result ? "Number is perfect": "Number is not perfect");

    }

    public static boolean isPerfect(int integerUserHasEnteredToCheckIfNumberISPerfect) {
        int sum = 0;
        for (int i = 1; i <= integerUserHasEnteredToCheckIfNumberISPerfect / 2; i++) {
            if (integerUserHasEnteredToCheckIfNumberISPerfect % i == 0) {
                sum += i;
            }
        }
        if (sum == integerUserHasEnteredToCheckIfNumberISPerfect) {
            return true;

        }return false;
    }
}