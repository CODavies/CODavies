package Chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberFromUser = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numberFromUser = input.nextInt();

            for (int j = 0; j < numberFromUser; j++) {

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

