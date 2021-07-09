package Chapter6;

import java.util.Scanner;

public class MethodOverload {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();
        System.out.print("Enter a double: ");
        double userDouble = input.nextDouble();
        System.out.printf("Square of integer is %d%n", square(userInt));
        System.out.printf("Square of double is %f%n", square(userDouble));
    }

    private static int square(int number) {
        return number * number;
    }

    private static double square(double number) {
        return number * number;
    }
}

