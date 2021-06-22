package Chapter6;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two doubles separated by spaces: ");
        double userDouble1 = input.nextDouble();
        double userDouble2 = input.nextDouble();
        System.out.print("Enter two floats separated by spaces: ");
        float userInt1 = input.nextFloat();
        float userInt2 = input.nextFloat();
        System.out.printf("Square of double is %f%n", hypotenuse(userDouble1, userDouble2));
        System.out.printf("Square of float value is %.2f%n", hypotenuse(userInt1, userInt2));

}
public static double hypotenuse(double firstInput,double secondInput){
    return firstInput * secondInput;
    }
    public static float hypotenuse(float firstInput,float secondInput){
        return firstInput * secondInput;
    }
}
