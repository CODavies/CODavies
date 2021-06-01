package Chapter1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
BMICalculator bmiCalculator;
    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator();
    }
    @AfterEach
    void tearDown() {
        bmiCalculator = null;
    }
    @Test
    void newCalculatorHasBeenCreated(){
        assertNotNull(bmiCalculator);
    }
    @Test
    void calculatorCanCheckForObesity(){
     assertTrue( bmiCalculator.checkForObesity(56));
    }
    @Test
    void calculatorCanCheckForOverWeight(){
        assertTrue(bmiCalculator.checkForOverweight(25.9));
    }
    @Test
    void calculatorCanCheckForNormalWeight(){
        assertTrue(bmiCalculator.checkForNormalWeight(19));
    }
    @Test
    void calculatorCanCheckForUnderWeight(){
        assertTrue(bmiCalculator.checkForUnderWeight(12));
    }
}