package Chapter7;

import java.util.Scanner;

public class AirlineMain {
    public static void main(String[] args) {
        Airline airline = new Airline();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your preferred seat type, enter 1 for FirstClass and 2 for SecondClass: ");
        int userAnswer = input.nextInt();
        while (userAnswer != 0) {
            if (userAnswer == 1) {
                System.out.println("You have been assigned to first class: " + airline.assignSeatsToFirstClass());
            } else if (userAnswer == 2) {
                System.out.println("You have been assigned to economy: " + airline.assignSeatsToEconomy());
            }
            System.out.print("if ");
            userAnswer = input.nextInt();
        }
            if (!airline.assignSeatsToFirstClass()) {
                System.out.print("Do you want to book economy? ");
                String reply = "";

                if (reply.equalsIgnoreCase("yes")) {
                    System.out.println("You have been assigned to economy: " + airline.assignSeatsToEconomy());
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        }
    }

