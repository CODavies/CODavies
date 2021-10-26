package Chapter10;

public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double numberOfHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double numberOfHoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        if(hourlyWage < 0.0) throw new IllegalArgumentException("Hourly Wage must be greater than 0.0");
        this.hourlyWage = hourlyWage;
        if(numberOfHoursWorked < 0.0 || numberOfHoursWorked >168) throw new IllegalArgumentException("Hours worked must be between 0 and 169");
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if(hourlyWage < 0.0) throw new IllegalArgumentException("Hourly Wage must be greater than 0.0");
        this.hourlyWage = hourlyWage;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double earning() {
        if (getNumberOfHoursWorked() < 40){
            return getHourlyWage() * getNumberOfHoursWorked();
        }else
        return 40 * getHourlyWage() + ((getNumberOfHoursWorked() - 40) * getHourlyWage()) * 1.5;
    }

    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getHourlyWage(), "hours worked", getNumberOfHoursWorked());
    }
}
