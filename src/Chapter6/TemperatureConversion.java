package Chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.printf("Enter fahrenheit: ");
    int fahrenheitInputUserHasEntered = input.nextInt();
        System.out.printf("Celsius is %d%n" , celsius(fahrenheitInputUserHasEntered));
        System.out.printf("Fahrenheit is %2f%n" , Fahrenheit(celsius(fahrenheitInputUserHasEntered)));
}

    private static double Fahrenheit(int celsius) {
       double fahrenheit = 9.0 / 5.0 * celsius + 32;
       return fahrenheit;
    }

    private static int celsius(int fahrenheitInputUserHasEntered) {
        int celsius = (int) (5.0 / 9.0 * (fahrenheitInputUserHasEntered - 32));
        return celsius;
    }
    }
