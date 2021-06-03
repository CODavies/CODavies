package Chapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingIntegersTest {
ComparingIntegers comparingIntegers;
    @BeforeEach
    void setUp() {
        comparingIntegers  = new ComparingIntegers();
    }

    @AfterEach
    void tearDown() {
        comparingIntegers = null;
    }
    @Test
    void largerNumberIsPrintedOut(){
        assertEquals(100, comparingIntegers.getLargerNumber(12,100));
    }
    @Test
    void numbersAreEqual(){
        assertTrue(comparingIntegers.numbersAreEqual(12,13));
    }
    }