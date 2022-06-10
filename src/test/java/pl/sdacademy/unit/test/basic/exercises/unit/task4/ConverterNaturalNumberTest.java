package pl.sdacademy.unit.test.basic.exercises.unit.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ConverterNaturalNumberTest {

    private ConverterNaturalNumber numberInString;
    private static final int FIRST_NATURAL_NUMBER = 0;

    @BeforeEach
    void setUpObject() {
        numberInString = new ConverterNaturalNumber();
    }

    @Test
    void shouldReturnTrueIfNumberIsPositive() {
        //given
        int number = FIRST_NATURAL_NUMBER + 5;
        String expectedNumber = "5";
        //when
        String result = numberInString.toStringFromNaturalNumber(number);
        //then
        assertEquals(expectedNumber, result);
        assertThat(result).isEqualTo(expectedNumber);
    }

    @Test
    void shouldReturnTrueIfNumberIsZero() {
        //given
        int number = FIRST_NATURAL_NUMBER;
        String expectedNumber = "0";
        //when
        String result = numberInString.toStringFromNaturalNumber(number);
        //then
        assertEquals(expectedNumber, result);
        assertThat(result).isEqualTo(expectedNumber);
    }

    @Test
    void shouldReturnExceptionIfNumberIsNegative() {
        //given
        int number = FIRST_NATURAL_NUMBER - 2;
        //then
        // junit5
         assertThrows(IllegalArgumentException.class,
                 () -> numberInString.toStringFromNaturalNumber(number), "Given number is less that 0!");
        assertThatThrownBy(() -> numberInString.toStringFromNaturalNumber(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Given number is less that 0!");
    }
}