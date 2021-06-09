package Chapter4;
import java.util.Scanner;
public class SalesCommissionCalculator {
        public static void main(String[] args) {
        final int WEEKLY_BONUS = 200;
        final double WEEKLY_PERCENTAGE_BONUSES = 0.09;
        double firstItem = 239.99;
        double secondItem = 129.75;
        double thirdItem = 99.95;
        double forthItem = 350.89;
        double totalItemsPurchased = 0;
        int commission = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item you want to purchase (firstItem =1, secondItem =2, thirdItem =3, forthItem=4) enter 5 to exit: ");
        int itemNumber = input.nextInt();
        while (itemNumber>= 5){
            System.out.println("The cost of the item is 239.99, enter the number of item you want to purchase: ");
            int numberOfItem = input.nextInt();
            if (itemNumber == 1) {
                totalItemsPurchased += (numberOfItem * firstItem);
            } else if (itemNumber == 2) {
                totalItemsPurchased += (numberOfItem * secondItem);
            } else if (itemNumber == 3) {
                totalItemsPurchased += (numberOfItem * thirdItem);
            } else if (itemNumber == 4) {
                totalItemsPurchased += (numberOfItem * forthItem);
            }
            System.out.println("Enter the item you want to purchase (firstItem =1, secondItem =2, thirdItem =3, forthItem=4) enter 5 to exit: ");
            itemNumber = input.nextInt();
        }
        if (totalItemsPurchased >= 5000) {
            commission = (int) ((WEEKLY_BONUS) + (WEEKLY_PERCENTAGE_BONUSES * totalItemsPurchased));
        }
        System.out.println("Sales person commission is: " + commission);
        System.out.println("The total items bought is: " + totalItemsPurchased);
    }
}




