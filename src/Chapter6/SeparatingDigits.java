package Chapter6;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ënter integer you want to separate: ");
        int integerInputUserHasEntered = input.nextInt();
        System.out.println("Your number is: " + separatedInteger(integerInputUserHasEntered));

    }

    private static int separatedInteger(int integerInputUserHasEntered) {
        while (integerInputUserHasEntered > 0){
            int number = integerInputUserHasEntered / 10;
            number++;
           return number % 10;
        }
        return integerInputUserHasEntered;
    }
}
