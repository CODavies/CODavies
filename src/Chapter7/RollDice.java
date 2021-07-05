package Chapter7;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        int[] frequency = new int[7 ];
        SecureRandom random = new SecureRandom();
        System.out.printf("%s%10s%n", "Face", "Frequency");
        for (int counter = 1; counter <= 6000000; counter++)
           ++frequency[1 + random.nextInt(6)];
        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%2d%10d%n ",  face , frequency[face]);
    }
}
