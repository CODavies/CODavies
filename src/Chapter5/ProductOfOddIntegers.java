package Chapter5;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int sum = 1;
        for (int counter =0 ; counter <= 15; counter++) {
            sum = counter * sum;
        }
//            System.out.print(counter);
            System.out.println(sum);
        }
    }

