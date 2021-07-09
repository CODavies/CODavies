package Chapter5;

import java.util.Scanner;

public class TaxPlanAlternatives {
    static double housing;
    static double food;
    static double clothing;
    static double transportation;
    static double education;
    static double healthCare;
    static double vacations;

    public static void main(String[] args) {
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

        System.out.println(getSumOfAllExpense());
    }

    public static double getSumOfAllExpense() {
        final double FAIR_TAX = 0.23;
        double sumOfAllExpense = housing + food + clothing + transportation + education + healthCare + vacations;
        double taxCharged = sumOfAllExpense * FAIR_TAX;
        double expensesPlusTax = sumOfAllExpense + taxCharged;
        System.out.println("The total expenses is: " + sumOfAllExpense);
        System.out.println("Total tax is: " + taxCharged);
        System.out.println("Total expenses plus tax is: " + expensesPlusTax);
        System.out.println("The total expenses is: " + sumOfAllExpense);
        System.out.println("Total tax is: " + taxCharged);
        System.out.println("Total expenses plus tax is: " + expensesPlusTax);
        return expensesPlusTax;
    }
}
