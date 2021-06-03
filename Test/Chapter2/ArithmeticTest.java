package Chapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
Arithmetic arithmetic;
    @BeforeEach
    void setUp() {
        arithmetic = new Arithmetic();
    }

    @AfterEach
    void tearDown() {
        arithmetic = null;
    }
    @Test
    void applicationCanSumTwoIntegers(){
        assertEquals(20, arithmetic.SumTwoNumbers(15,5));
    }
    @Test
    void applicationCanGetProductOfTwoIntegers(){
        assertEquals(10,arithmetic.productOfTwoNumbers(2,5));
    }
    @Test
    void applicationCanGetTheDifferenceOfTwoIntegers(){
        assertEquals(10,arithmetic.differenceOfTwoNumbers(15,5));
    }
    @Test
    void applicationCanGetQuotientOfTwoIntegers(){
        assertEquals(5, arithmetic.quotientOfTwoNumbers(10,2));
    }
}