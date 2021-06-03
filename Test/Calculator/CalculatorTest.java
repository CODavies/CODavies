package Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    @AfterEach
    void afterEach() {
        calculator = null;
    }

    @Test
    void testThatNewCalculatorHasBeenCreated() {
        assertNotNull(calculator);

    }

    @Test
    void calculatorCanAddTwoNumbers() {
        assertEquals(4, Calculator.addition(2, 2));
    }

    @Test
    void calculatorCanAddThreeNumbers() {
        assertEquals(6, Calculator.addition(2, 2, 2));
        assertEquals(11, Calculator.addition(5, 5, 1));
    }

    @Test
    void calculatorCanSubtractTwoNumbers() {
        assertEquals(6, Calculator.subtraction(12, 6));
    }

    @Test
    void calculatorCanSubtractThreeNumbers() {
        assertEquals(5, Calculator.subtraction(12, 6, 1));
    }

    @Test
    void calculatorCanDivideTwoNumbers() {
        assertEquals(2, Calculator.division(4, 2));
    }

    @Test
    void calculatorCanDivideThreeNumbers() {
        assertEquals(2, Calculator.division(40, 10, 2));
    }

    @Test
    void calculatorCanMultiplyTwoNumbers() {
        assertEquals(6, Calculator.multiplication(2, 3));
    }

    @Test
    void calculatorCanMultipleThreeNumbers() {
        assertEquals(8, Calculator.multiplication(2, 2, 2));
    }

    @Test
    void calculatorCanConvertFromNumbersToSin() {
        assertEquals(0.49999999999999994, calculator.convertToSin(30));
    }
    @Test
    void calculatorCanConvertFromNumbersToCos(){
        assertEquals(0.8660254037844387,calculator.convertToCos(30));
    }
    @Test
    void calculatorCanConvertFromNumbersToTan(){
        assertEquals(0.5773502691896257, calculator.convertToTan(30));
    }

}
