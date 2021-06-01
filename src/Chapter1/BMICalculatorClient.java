package Chapter1;


import java.util.Scanner;

public class BMICalculatorClient {
    public static void main(String[] args) {


        BMICalculator bmiCalculator = new BMICalculator();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you number to check: ");
        double numberEnteredByUser = input.nextDouble();
        System.out.println(bmiCalculator.checkForNormalWeight(numberEnteredByUser) );
        System.out.println(bmiCalculator.checkForObesity(numberEnteredByUser));
        System.out.println(bmiCalculator.checkForOverweight(numberEnteredByUser));
        System.out.println(bmiCalculator.checkForUnderWeight(numberEnteredByUser));
    }
}
