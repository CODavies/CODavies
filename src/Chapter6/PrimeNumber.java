package Chapter6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();
        boolean result = isPrime(userInput);
        System.out.println(result ? "Number is prime" : "Number is not prime");
    }

    private static boolean isPrime(int userInput) {

        for (int i = 2; i <= userInput / 2; i++) {
            if (userInput % i == 0) {
              return false;
            }

        }
        return true;
    }
}
