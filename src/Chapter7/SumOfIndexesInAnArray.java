package Chapter7;

public class SumOfIndexesInAnArray {
    public static void main(String[] args) {
        int[] arrayA = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int sum = 0;
        for (int counter = 0; counter < arrayA.length; counter++)
            sum += arrayA[counter];
        System.out.printf("Total of array elements is: %d%n", sum);
    }
}
