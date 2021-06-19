package Chapter5;

import java.util.Scanner;

public class Factorials {
        public static void main(String[] args) {
            long sum = 1;
            for (long counter =20 ; counter >= 1; counter--) {
                sum = counter * sum;
            }
//            System.out.print(counter);
            System.out.println(sum);
        }
    }

