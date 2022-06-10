package pl.sdacademy.unit.test.basic.exercises.tdd.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    // true: index = 0, result = 0;
    // true: index = 1, result = 1;
    // true: index = 2, result = 1;
    // true: index = 3, result = 2;
    // true: index = 4, result = 3;
    // true: index = 8, result = 21;

    private static Fibonacci fibonacci;

    @BeforeAll
    static void init() {
        fibonacci = new Fibonacci();
    }


    @Test
    void shouldReturnZeroIfIndexIsZero() {
        // given
        int index = 0;
        int expectedResult = 0;
        // when
        int result = fibonacci.getValueFromIndex(index);
        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnOneIfIndexIsOne() {
        // given
        int index = 1;
        int expectedResult = 1;
        // when
        int result = fibonacci.getValueFromIndex(index);
        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnOneIfIndexIsTwo() {
        // given
        int index = 2;
        int expectedResult = 1;
        // when
        int result = fibonacci.getValueFromIndex(index);
        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnTwoIfIndexIsThree() {
        // given
        int index = 3;
        int expectedResult = 2;
        // when
        int result = fibonacci.getValueFromIndex(index);
        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnTwentyOneIfIndexIsEight() {
        // given
        int index = 8;
        int expectedResult = 21;
        // when
        int result = fibonacci.getValueFromIndex(index);
        // then
        assertThat(result).isEqualTo(expectedResult);
    }

}