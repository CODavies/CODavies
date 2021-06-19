package Chapter5;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int numberUserHasEntered;
        System.out.print("Enter 1 to begin or zero to exit: ");
        numberUserHasEntered = input.nextInt();
        System.out.println("Enter the number of time you want to purchase the product: ");
        int numberOfTimesUserWantsToBuyTheProduct = input.nextInt();
        while (numberUserHasEntered != 0) {
            switch (numberOfTimesUserWantsToBuyTheProduct) {
                case 1 -> sum += 2.98 * numberUserHasEntered;
                case 2 -> sum += 4.50 * numberUserHasEntered;
                case 3 -> sum += 9.98 * numberUserHasEntered;
                case 4 -> sum += 4.49 * numberOfTimesUserWantsToBuyTheProduct;
                case 5 -> sum += 6.87 * numberOfTimesUserWantsToBuyTheProduct;
                default -> System.out.println("Invalid input");
            }
            System.out.print("Enter a number between 1 - 5 to select the product you want to buy(enter zero to stop): ");
            numberUserHasEntered = input.nextInt();
            System.out.println("The total cost is " + sum);
        }
    }
}