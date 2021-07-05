package Chapter7;

import java.util.Arrays;

public class Airline {
    private boolean[] seats = new boolean[10];
    private int counter;


    public boolean assignSeatsToFirstClass() {
        for (int i = 0; i < seats.length / 2; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return seats[i];
            }
        }

        return false;
    }

    public boolean assignSeatsToEconomy() {
        for (int i = 5; i < seats.length; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return seats[i];
            }
        }return false;
    }

}


