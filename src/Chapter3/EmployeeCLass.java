package Chapter3;

public class EmployeeCLass {
    String firstName, lastName;
    double monthlySalary;
    double yearlySalary;
    final static double yearlyGoalForEmployees = 2000000;

    public EmployeeCLass(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = (monthlySalary <= 0.0) ? 0.0 : this.monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = (monthlySalary <= 0.0) ? 0.0 : this.monthlySalary;
    }

    public double yearlySalary(double monthlySalary) {
        yearlySalary = monthlySalary * 12;
            if (yearlySalary >= yearlyGoalForEmployees)
                return yearlySalary + (yearlySalary * 0.10);
            else return yearlySalary;
    }
}


