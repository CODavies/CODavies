package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] salesArrayCounter = new int[9];
        final int WEEKLY_BONUS = 200;
        final double PERCENTAGE_BONUS = 0.09;
        System.out.print("Enter weekly gross sales: ");
        double grossSales = input.nextDouble();
        while (grossSales != 0) {
            double wage = WEEKLY_BONUS + (grossSales * PERCENTAGE_BONUS);
            int indexToIncrement = ((int) wage / 100) - 2;
            if (indexToIncrement > 9)
                indexToIncrement = 9;
            salesArrayCounter[indexToIncrement]++;
            System.out.print("Enter weekly gross sales: ");
            grossSales = input.nextInt();
        }
        System.out.println(Arrays.toString(salesArrayCounter));
    }
}
