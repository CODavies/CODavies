package Chapter10;

public class CommissionEmployee extends Employee{
    private double grossSales, commissionRates;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double salesAmount, double commissionRates) {
        super(firstName, lastName, socialSecurityNumber);
        if(salesAmount < 0.0) throw new IllegalArgumentException("Sales amount must be greater than 0.0");
        this.grossSales = salesAmount;
        if(commissionRates < 0.0 || commissionRates > 1.0) throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRates = commissionRates;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0) throw new IllegalArgumentException("Sales amount must be greater than 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRates() {
        return commissionRates;
    }

    public void setCommissionRates(double commissionRates) {
        if(commissionRates < 0.0 || commissionRates > 1.0) throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRates = commissionRates;
    }

    @Override
    public double earning() {
        return getCommissionRates() * getGrossSales();
    }
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(),"gross sales", getGrossSales(),"commission rate", getCommissionRates());

    }
}
