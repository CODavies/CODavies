package Chapter7;

import java.util.Arrays;

public class ArraysShiftingMethod {
    public static void main(String[] args) {
        int[] myList = {3,12,23,42,43,54,65,76,75,23};
        System.out.println("Before shifting");
        System.out.println(Arrays.toString(myList));
        System.out.println("After shifting, the elements left, moving: " + myList[0] + " and shiting it out,  " + myList[1]);
        for (int i = 1; i < myList.length; i++) {

        myList[i - 1]  = myList[i];

        }

        System.out.println(Arrays.toString(myList));
    }

}
