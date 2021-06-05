package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeCLassTest {
EmployeeCLass employee1;
EmployeeCLass employee2;
    @BeforeEach
    void setUp() {
        employee1 = new EmployeeCLass("Davies", "Chijioke", 400);
        employee2 = new EmployeeCLass("Davies", "Blessed",344);
    }

    @AfterEach
    void tearDown() {
        employee1 = null;
        employee2 = null;
    }
    @Test
    void monthlySalaryCannotTakeLessThanZeroValues(){
        employee1.setMonthlySalary(-98.0);
        employee2.setMonthlySalary(-67);
        assertEquals(0, employee1.monthlySalary);
        assertEquals(0,employee2.monthlySalary);
    } @Test
    void yearlyGoalForSalaryIsMet(){
        assertEquals(1800000.0, employee1.yearlySalary(150000));
        assertEquals(2640000.0,employee2.yearlySalary(200000));
    }
    @Test
    void yearlyGoalForTheYearIsNotMet(){
        assertEquals(1200000,employee1.yearlySalary(100000));
        assertEquals(1320000, employee2.yearlySalary(110000));
    }


}