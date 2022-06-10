package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {



    @Test
    void shouldReturnCorrectFormatDate() {
        //given
        LocalDate input = LocalDate.of(1900,01,02);
        String expectedResult = "1900-02-01";
        DateFormatter dateFormatter = new DateFormatter();
        //when
        String result = dateFormatter.formatDate(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnFalseIfDateIsIncorrect() {
        //given
        LocalDate input = LocalDate.of(1905,01,05);
        String unexpectedResult = "1900-02-01";
        DateFormatter dateFormatter = new DateFormatter();
        //when
        String result = dateFormatter.formatDate(input);
        // then
        assertNotEquals(unexpectedResult, result);
        assertThat(result).isNotEqualTo(unexpectedResult);
    }
}