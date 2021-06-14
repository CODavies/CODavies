package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
SalaryCalculator salaryCalculator;
    @BeforeEach
    void setUp() {
        salaryCalculator = new SalaryCalculator();
    }

    @AfterEach
    void tearDown() {
        salaryCalculator = null;

    }
 @Test
    void hourCanBeSet(){
        salaryCalculator.setHour(23);
        assertEquals(23, salaryCalculator.getHour());
 }
 @Test
    void ifHOurISEqualToFortyFullPay(){
        salaryCalculator.setHour(30);
        assertEquals(15000, salaryCalculator.getHourlyPay());
 }
 @Test
    void ifHoursWorkedIsGreaterThanForty(){
        salaryCalculator.setHour(40);
        salaryCalculator.setOverTime(5);
        assertEquals(21250,salaryCalculator.getOverTime());
 }
}