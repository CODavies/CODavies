package Chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum value is "+ result);
        double resullt = minimum(number1, number2, number3);
        System.out.println("Minimum value is " + resullt);
    }

    private static double maximum(double x, double y, double z) {
            double maximumValue = x;
            if (y > maximumValue)
                maximumValue = y;
            if (x > maximumValue)
                maximumValue = x;
            if (z > maximumValue)
                maximumValue = z;
            return maximumValue;
    }
    private static  double minimum(double x, double y, double z){
        double minimumValue = x;
        if (y > minimumValue )
            minimumValue  = y;
        if (x > minimumValue )
            minimumValue  = x;
        if (z > minimumValue )
            minimumValue  = z;
        return minimumValue ;
    }
}
