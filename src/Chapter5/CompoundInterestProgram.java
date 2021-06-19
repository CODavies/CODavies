package Chapter5;

public class CompoundInterestProgram {
    public static void main(String[] args) {
        double pennies = 1000.0;
        double rate = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            int amount = (int) (pennies * Math.pow(1.0 + rate, year) * 100);
            int dollars = ((amount / 100) / 100);
            int cents = ((amount / 100) % 100);
            System.out.printf("%2d%10d.%02d%n", year, dollars, cents);
        }
    }
}

