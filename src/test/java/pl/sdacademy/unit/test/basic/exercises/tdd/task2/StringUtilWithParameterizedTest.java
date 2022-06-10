package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.sdacademy.unit.test.basic.exercises.tdd.task1.Fibonacci;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilWithParameterizedTest {

    // input: "a" -> false;
    // input: "  a" -> false;
    // input: "  a  " -> false;
    // input: "a " -> false;
    // input: "null" -> false;
    // input: "" -> true;
    // input: "  " -> true;
    // input: null -> true;


        @Test
    void shouldReturnFalseIfInputIsA() {
            // given
            StringUtilWithParameterized stringUtilWithParameterized = new StringUtilWithParameterized();
            String input = "a";
            // when
            boolean result = stringUtilWithParameterized.isBlank(input);
            // then
            assertThat(result).isFalse();
        }

    @Test
    void shouldReturnFalseIfInputIsAWithTab() {
        // given
        StringUtilWithParameterized stringUtilWithParameterized = new StringUtilWithParameterized();
        String input = "  a";
        // when
        boolean result = stringUtilWithParameterized.isBlank(input);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfInputIsAWithTab2() {
        // given
        StringUtilWithParameterized stringUtilWithParameterized = new StringUtilWithParameterized();
        String input = "  a  ";
        // when
        boolean result = stringUtilWithParameterized.isBlank(input);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfInputIsNullString() {
        // given
        StringUtilWithParameterized stringUtilWithParameterized = new StringUtilWithParameterized();
        String input = "  a  ";
        // when
        boolean result = stringUtilWithParameterized.isBlank(input);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueIfInputIsNull() {
        // given
        StringUtilWithParameterized stringUtilWithParameterized = new StringUtilWithParameterized();
        String input = null;
        // when
        boolean result = stringUtilWithParameterized.isBlank(input);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTrueIfInputIsBlank() {
        // given
        StringUtilWithParameterized stringUtilWithParameterized = new StringUtilWithParameterized();
        String input = "";
        // when
        boolean result = stringUtilWithParameterized.isBlank(input);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTrueIfInputIsWithWhiteChars() {
        // given
        StringUtilWithParameterized stringUtilWithParameterized = new StringUtilWithParameterized();
        String input = "  ";
        // when
        boolean result = stringUtilWithParameterized.isBlank(input);
        // then
        assertThat(result).isTrue();
    }

}