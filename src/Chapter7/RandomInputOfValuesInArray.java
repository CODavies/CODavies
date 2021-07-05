package Chapter7;

import java.util.Arrays;

public class RandomInputOfValuesInArray {
    public static int[] randomInput() {
      int[] myList = new int[12];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random()* myList.length);
        }

        return myList;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(randomInput()));
    }
}
