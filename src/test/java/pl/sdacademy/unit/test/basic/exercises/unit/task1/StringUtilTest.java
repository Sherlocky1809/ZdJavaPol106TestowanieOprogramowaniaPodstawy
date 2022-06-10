package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    // null
    // " "
    // "   "
    //""

    //false
    //"null"
    //" a"
    // " a "

    @Test
    void shouldReturnTrueIfStringIsNull() {
        // given
        String input = null;
        // when
        boolean result = StringUtil.isBlank(input);
        // then
        assertTrue(result); // junit - passed
        assertThat(result).isTrue(); // AssertJ -
    }

    @Test
    void shouldReturnTrueIfStringIsBlank() {
        // given
        String input = " ";
        // when
        boolean result = StringUtil.isBlank(input);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfStringIsNullAsWord() {
        // given
        String input = "null";
        // when
        boolean result = StringUtil.isBlank(input);
        // then
        assertFalse(result);
        assertThat(result).isFalse();

    }

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        // given
        String input = "";
        // when
        boolean result = StringUtil.isBlank(input);
        // then
        assertTrue(result);
        assertThat(result).isTrue();
    }
}