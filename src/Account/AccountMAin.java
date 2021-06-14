package Account;

import java.util.Scanner;

public class AccountMAin {
    public static void main(String[] args) {
        int sentinelValue = 1;
        Account account = new Account();
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your first name: ");
        String userFirstName = input.next();
        System.out.print("Please input your last name: ");
        String userLastName = input.next();
        account.setFirstName(userFirstName);
        account.setLastName(userLastName);
        System.out.println("Welcome to UBA " + account.clientsFirstAndLastName());
        while (sentinelValue != -1) {
            System.out.println(
                    """
                    Press 1 for Deposit
                    Press 2 for Withdraw
                    Press 3 to pay for bills
                    Press 4 to transfer money
                    Press 5 for account balance
                    Press 6 to exit                    
                    """);
            int userInput = input.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.print("PLease input deposit amount: ");
                    double depositAmountFromUSer = input.nextDouble();
                    System.out.print("Your account balance is: " + account.depositMoney(depositAmountFromUSer) + "\n");
                }
                case 2 -> {
                    System.out.print("PLease input amount you want to withdraw: ");
                    double amountToWithdraw = input.nextDouble();
                    System.out.println(amountToWithdraw + " :has been debited from your account, " + account.withdrawMoney(amountToWithdraw) + "you account new account balance is: " + "\n" );
                }
                case 3 -> {
                    System.out.print("PLease input amount to pay bill: ");
                    double billInputtedByUser = input.nextDouble();
                    System.out.print("You have paid: " + billInputtedByUser+ "your new account balance is: " + account.payForUtilityBills(billInputtedByUser ) + "\n");
                }

                case 4-> {
                    System.out.print("Please enter amount you want to transfer: ");
                    double transferAmount = input.nextDouble();
                    System.out.println("You have transferred: " + transferAmount +" your account balance is: " + account.transferAmount(transferAmount) + "\n");
                }
                case 5 -> System.out.println("Your account balance is: " + account.getBalance());
                case 6-> { System.out.println("Thank you for banking with us" + account.clientsFirstAndLastName() + " Stay safe");
                    sentinelValue = -1;
                }
                default -> System.out.println("Invalid input, please input a number between 1 - 8" + "\n");
            }
        }
    }
}
