package Chapter10;

public class SalaryEmployee extends Employee{
    private double weeklyEarning;

    public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklyEarning) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklyEarning < 0.0) throw new IllegalArgumentException("Weekly salary must be greater than 0.0");
        this.weeklyEarning = weeklyEarning;
    }

    public double getWeeklyEarning() {
        return weeklyEarning;
    }

    public void setWeeklyEarning(double weeklyEarning) {
        if(weeklyEarning < 0.0) throw new IllegalArgumentException("Weekly salary must be greater than 0.0");
        this.weeklyEarning = weeklyEarning;
    }

    @Override
    public double earning() {
        return getWeeklyEarning();
    }
    @Override
    public String toString(){
        return String.format("Salary Employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklyEarning());
    }

}
