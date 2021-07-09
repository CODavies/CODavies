package Chapter6;

import java.util.Scanner;

public class ParkingCharges {
    final static double MINIMUM_FEE = 2.00;
    final static double ADDITIONAL_FEE = 0.50;
    final static double MAXIMUM_CHARGE = 10.00;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your hours you want to park: ");
        int numberOfHoursUserWantsToParked = input.nextInt();
        System.out.printf("your parking charge is %.1f%n", calculateCharges(numberOfHoursUserWantsToParked));

    }

    private static double calculateCharges(int numberOfHoursUserWantsToPark) {
        int hoursParkedByUser = numberOfHoursUserWantsToPark - 3;
        if (hoursParkedByUser < 0) {
            return numberOfHoursUserWantsToPark;
        } else if (hoursParkedByUser == 0) {
            return numberOfHoursUserWantsToPark * MINIMUM_FEE;
        } else if (hoursParkedByUser < 21) {
            return (numberOfHoursUserWantsToPark * MINIMUM_FEE) + (hoursParkedByUser * ADDITIONAL_FEE);
        }else
        return (numberOfHoursUserWantsToPark * MAXIMUM_CHARGE)  ;
    }
}





