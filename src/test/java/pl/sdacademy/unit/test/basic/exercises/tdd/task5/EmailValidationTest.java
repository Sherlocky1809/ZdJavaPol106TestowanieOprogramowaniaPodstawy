package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidationTest {

    /*
    Test cases:
    - sprawdzic gdy email będzie np. bez malpy.
    - sprawdzic gdy email bedzie bez kropki.
    -sprawdzic gdy email bedzie z cyfra po kropce.
    - sprawdzic gdy email bedzie z malpa i kropka
     */



    @Test
    void shouldReturnFalseIfEmailIsWithoutMonkey() {
        // given
        String emailStr = "sda.gmail.com";
        // when
        boolean result = EmailValidation.validate(emailStr);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfEmailIsWithoutDot() {
        // given
        String emailStr = "sda@gmailcom";
        // when
        boolean result = EmailValidation.validate(emailStr);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfEmailIsWithDigitAfterDot() {
        // given
        String emailStr = "sda@gmail.2com";
        // when
        boolean result = EmailValidation.validate(emailStr);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueIfEmailIsWithMonkeyAndDot() {
        // given
        String emailStr = "sda@gmail.com";
        // when
        boolean result = EmailValidation.validate(emailStr);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfEmailIsNull() {
        // given
        String emailStr = null;
        // when
        boolean result = EmailValidation.validate(emailStr);
        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueIfEmailIsWithTwoDots() {
        // given
        String emailStr = "prze.momad55@gmail.com";
        // when
        boolean result = EmailValidation.validate(emailStr);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfEmailIsBlankBeforeMonkey() {
        // given
        String emailStr = "@gmail.com";
        // when
        boolean result = EmailValidation.validate(emailStr);
        // then
        assertThat(result).isFalse();
    }


}