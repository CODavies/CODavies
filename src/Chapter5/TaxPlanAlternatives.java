package Chapter5;

import java.util.Scanner;

public class TaxPlanAlternatives {
    public static void main(String[] args) {
        double housing, food, clothing, transportation, education,
                healthCare, vacations;
        final double FAIR_TAX = 0.23;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your housing expense: ");
        housing = input.nextDouble();
        System.out.print("Enter your feeding expense: ");
        food = input.nextDouble();
        System.out.print("Enter you clothing expense: ");
        clothing = input.nextDouble();
        System.out.print("Enter your transportation expense: ");
        transportation = input.nextDouble();
        System.out.print("Enter your education expense: ");
        education = input.nextDouble();
        System.out.print("Enter your health care expense: ");
        healthCare = input.nextDouble();
        System.out.print("Enter your vacations expense:");
        vacations = input.nextDouble();

        double sumOfAllExpense = housing + food + clothing + transportation + education + healthCare + vacations;
        double taxCharged = sumOfAllExpense * FAIR_TAX;
        double expensesPlusTax = sumOfAllExpense + taxCharged;


        System.out.println("The total expenses is: " + sumOfAllExpense );
        System.out.println("Total tax is: " + taxCharged);
        System.out.println("Total expenses plus tax is: " + expensesPlusTax);
    }

}