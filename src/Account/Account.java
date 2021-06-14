package Account;

public class Account {
    private double amount;
    private String firstName, lastName;

    public double depositMoney(double deposit) {
        if (deposit > 0) {
           return this.amount += deposit;
        }
        else {
            System.out.println("Insufficient funds");
            return this.amount = 0;
        }
        }

    public double withdrawMoney(double withdrawAmount) {

        if(withdrawAmount < amount && withdrawAmount > 0){
            return this.amount - withdrawAmount;
        }

        else
            System.out.println("Insufficient funds");
            return  0;
    }

    public double payForUtilityBills(double amountToBuy) {
        if (amountToBuy < amount && amountToBuy > 0) {
            return (this.amount - amountToBuy);
        } else {
            System.out.println("Insufficient funds");

            return this.amount;
        }
    }

    public double transferAmount(double transferAmount) {
        if(transferAmount < amount && transferAmount > 0){
           final double transferAmountCharge = 65;
            return  ((this.amount )  - (transferAmount + transferAmountCharge));
        }
        else
            return  this.amount ;

    }
    public double getBalance(){
        return this.amount;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String clientsFirstAndLastName() {
        return firstName + " " +lastName;
    }
}


