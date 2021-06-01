package Account;

public class Account {
    private double amount;

    public double depositMoney(double deposit) {
        if (deposit < 0) {
           return this.amount = 0;
        }
        else
                return this.amount += deposit;

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
        } else
            return this.amount;



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



}


