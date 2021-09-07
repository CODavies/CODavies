package Chapter9;

public class HourlyEmployee extends Commission_Employees {
    private double hoursWorked;
    private double wagePerHour;


    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked <= 0.0)
            throw new IllegalArgumentException("Hours must be greater than 0.0");
        this.hoursWorked = hoursWorked;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        if (wagePerHour <= 0.0 || wagePerHour >= 168)
            throw new IllegalArgumentException("Wage must be greater than 0.0 or greater than 168");
              this.wagePerHour = wagePerHour;
    }

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double hoursWorked, double wagePerHour) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (hoursWorked <= 0.0)
            throw new IllegalArgumentException("Hours must be greater than 0.0");
        if (wagePerHour <= 0.0)
            throw new IllegalArgumentException("Wage must be greater than 0.0 ");
        this.hoursWorked = hoursWorked;
        this.wagePerHour = wagePerHour;
    }

    public double earnings(){
        return hoursWorked * wagePerHour;
    }
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,"gross sales", grossSales, "commission rate", commissionRate,"earnings", earnings());

    }
}
