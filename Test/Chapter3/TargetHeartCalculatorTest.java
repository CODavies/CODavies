package Chapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartCalculatorTest {
TargetHeartCalculator targetHeartCalculator;
    @BeforeEach
    void setUp() {
        targetHeartCalculator = new TargetHeartCalculator("Davies","Chijioke");
    }

    @AfterEach
    void tearDown() {
        targetHeartCalculator = null;
    }
    @Test
    void calculatorCanGetCurrentAge(){
        targetHeartCalculator.setYear(1995);
        assertEquals(26,targetHeartCalculator.getAge());
    }
    @Test
    void calculatorCanGetMaximumHeartRate(){
        targetHeartCalculator.setYear(1995);
        assertEquals(194, targetHeartCalculator.getMaximumHeartRate());
    }

    }
