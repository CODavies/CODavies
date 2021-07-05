

package Chapter7;
public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 10, 2, 3, 3, 2, 14};
        int[] rate = new int[6];
        for (int i = 0; i < responses.length; i++) {
            try {
                ++rate[responses[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf(" responses[%d] = %d%n%n", i, responses[i]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");
            for (int z = 1; z < rate.length; z++) {
                System.out.printf("%4d%4d%n", z, rate[z]);

            }
        }
    }






