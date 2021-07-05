package Chapter7;

public class ArrayIndexing {
    public static int minimumOrMaximum(int[] indexOfArray){
        int min = indexOfArray[0];

        for (int count = 0; count < indexOfArray.length; count++) {
            if (indexOfArray[count] < min){
                min = indexOfArray[count];
            }
        }return min;
    }

    public static void main(String[] args) {

        int[] indexOfArray = {23, 43, 12, 45, 1, 23, 75, 54, 67, 34};
        for (int counter = 0; counter < indexOfArray.length; counter ++) {
            System.out.println(counter + "   " + indexOfArray[counter]);
        }
        System.out.println(minimumOrMaximum(indexOfArray));
        System.out.println(maximumNumber(indexOfArray));

    }

    private static int maximumNumber(int[] indexOfArray) {
        int max= indexOfArray[0];
        for (int count = 0; count < indexOfArray.length; count++){
            if (indexOfArray[count] > max ){
                max = indexOfArray[count];
            }
        }return max;
    }
}
