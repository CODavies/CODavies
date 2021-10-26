package Chapter10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    BasePlusCommissionEmployee basePlusCommissionEmployee;
    CommissionEmployee commissionEmployee;
    Employee[] employees;
    HourlyEmployee hourlyEmployee;
    SalaryEmployee salaryEmployee;

    @BeforeEach
    void setUp() {
        salaryEmployee = new SalaryEmployee("John", "Smith", "111-11-1111", 800.00);
        hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        basePlusCommissionEmployee = new BasePlusCommissionEmployee("Davies", "Chijioke", "444-44-4444", 5000, .04, 300);

    }


    @AfterEach
    void tearDown() {
        salaryEmployee = null;
        hourlyEmployee = null;
        commissionEmployee = null;
        basePlusCommissionEmployee = null;
    }

    @Test
    void setBasePlusCommissionBaseSalary() {
        basePlusCommissionEmployee.setBaseSalary(23345);
        basePlusCommissionEmployee.setGrossSales(.01);
        assertNotNull(basePlusCommissionEmployee);
    }

    @Test
    void printOutEmployeesIndividually() {
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earning());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salaryEmployee, "earned", salaryEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earning());
        System.out.printf("%s%n%s: $%,.2f%n%n",basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earning());
    }

    @Test
    void printOutEmployeesFromArray() {
        employees = new Employee[4];
        employees[0] = salaryEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
//        System.out.printf("Employees processed polymorphically:%n%n");
//        for (Employee currentEmployee: employees){
//            System.out.println(currentEmployee);
//            System.out.printf("earned $%,.2f%n%n", currentEmployee.earning());
//        }
        for (int i = 0; i <employees.length ; i++) {
            System.out.printf("Employee %d is a %s%n",i,employees[i]);
        }

    }

}