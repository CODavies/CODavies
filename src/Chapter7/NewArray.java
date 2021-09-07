package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        int[] arr = {12, 23, -42, 43, -54, 65, 76, 75, 23, 12};
        int index = Arrays.binarySearch(arr, 43);
        Arrays.sort(arr);
//        double[] myList = new double[10];
//        Scanner input = new java.util.Scanner(System.in);
//        System.out.print("Enter " + myList.length + " values: ");
//        for (int i = 0; i < myList.length; i++)
//            myList[i] = input.nextDouble();
        System.out.println( Arrays.toString(arr));
    }

}
