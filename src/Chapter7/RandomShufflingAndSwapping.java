package Chapter7;

import java.util.Arrays;

public class RandomShufflingAndSwapping {
    public static void main(String[] args) {
        int[] myList = new int[5];
        for (int i = 0; i < myList.length; i++) {
            int index = (int) (Math.random() * myList.length);
            System.out.println(index);

            double temp = myList[i];
            myList[i] = index;
            myList[index] = (int) temp;

        }
            System.out.println("After the swap " + Arrays.toString(myList));


        }
    }




