package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

public class StringUtilWithParameterized {

    public static boolean isBlank(String input) {
        if (input == null || input.isBlank()) {
            return true;
        }
        return false;
    }
}