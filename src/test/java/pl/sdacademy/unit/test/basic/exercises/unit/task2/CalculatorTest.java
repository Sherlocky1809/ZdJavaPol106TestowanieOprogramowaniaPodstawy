package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
   static void init() {
    calculator = new Calculator();
   }

    @Test
    void shouldAddTwoValues() {
        // given
        int firstDigit = 2;
        int secondDigit = 5;
        int expectedResult = 7;
        // when
        int result = calculator.add(firstDigit, secondDigit);
        // then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);

    }

    @Test
    void shouldSubtractTwoValues() {
        // given
        int firstDigit = 5;
        int secondDigit = 2;
        int expectedResult = 3;
        // when
        int result = calculator.subtract(firstDigit, secondDigit);
        // then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);

    }

    @Test
    void shouldMultiplyTwoValues() {
        // given
        int firstDigit = 3;
        int secondDigit = 5;
        int expectedResult = 15;
        // when
        int result = calculator.multiply(firstDigit, secondDigit);
        // then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldMultiplyValueWithZero() {
        // given
        int firstDigit = 0;
        int secondDigit = 5;
        int expectedResult = 0;
        // when
        int result = calculator.multiply(firstDigit, secondDigit);
        // then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

}