package Chapter5;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int spaces = 9;
        int stars = 1;
        for (int i = 0; i < 5; i++) {
            for (int s = spaces; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = stars; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();

            spaces -= 2;
            stars += 2;

        }
    }
}
