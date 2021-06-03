package Chapter2;

import java.util.Scanner;

public class CarPoolSavingsCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles per day covered: ");
        int milesPerDayEnteredByUser = input.nextInt();
        System.out.print("Enter cost per gallons: ");
        int costPerGallonsOfGasoline = input.nextInt();
        System.out.print("Enter average miles per gallon: ");
        int averageMilesPerGallon = input.nextInt();
        System.out.print("Enter parking fees per day: ");
        int parkingFeesPerDay = input.nextInt();
        System.out.print("Enter tolls per day: ");
        int tollsPerDay = input.nextInt();
        int drivingCost = (milesPerDayEnteredByUser / averageMilesPerGallon) * costPerGallonsOfGasoline + parkingFeesPerDay + tollsPerDay;
        System.out.println("Your daily driving cost is: " + drivingCost);
    }
}
