package Chapter7;

import java.util.Scanner;

public class LottoNumbers {
    public static void main(String[] args) {
        boolean [] isCovered = new boolean[99];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
      int number = input.nextInt();
      while (number != 0){
          isCovered[number - 1]= true;
          System.out.print("Enter number: ");
          number = input.nextInt();
      }

    }
}
