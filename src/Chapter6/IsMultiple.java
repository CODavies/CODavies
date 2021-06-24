package Chapter6;

import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers separated by spaces: ");
        int firstIntegerUserEntered= input.nextInt();
        int secondIntegerUserEntered = input.nextInt();

        System.out.printf("%d is a multiple of %d%n" , secondIntegerUserEntered,firstIntegerUserEntered);
        System.out.println(isMultiple(firstIntegerUserEntered, secondIntegerUserEntered));
    }

    private static boolean isMultiple(int firstIntegerUserEntered, int secondIntegerUserEntered) {
        if(firstIntegerUserEntered % secondIntegerUserEntered == 0){
            return true;
        }
        return false;
    }
}
