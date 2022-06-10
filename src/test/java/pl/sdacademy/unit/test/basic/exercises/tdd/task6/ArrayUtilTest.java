package pl.sdacademy.unit.test.basic.exercises.tdd.task6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {

    /*
    Test cases:
    -sprawdzic czy metoda usuwa duplikaty.
    -sprawdzic czy metoda zwroci te sama tablice gdy nie ma duplikatow.
    -sprawdzic czy metoda zwroci tablice bez duplikatow nawet jesli elementy powtarzaja sie 3 lub 4 razy.
     */

    @Test
    void shouldReturnArrayWithFourElements() {
        // given
        String[] array = {"Przemek", "Ania", "Nosek", "Nosek", "Eskimosek"};
        String[] expectedArray = {"Przemek", "Ania", "Nosek", "Eskimosek"};
        // when
        String[] newArray = ArrayUtil.removeDuplicates(array);
        // then
        assertThat(newArray).isEqualTo(expectedArray);
    }

    @Test
    void AdditionalTestWithDuplicateAnia() {
        // given
        String[] array = {"Przemek", "Ania", "Ania", "Nosek", "Eskimosek"};
        String[] expectedArray = {"Przemek", "Ania", "Nosek", "Eskimosek"};
        // when
        String[] newArray = ArrayUtil.removeDuplicates(array);
        // then
        assertThat(newArray).isEqualTo(expectedArray);
    }

}