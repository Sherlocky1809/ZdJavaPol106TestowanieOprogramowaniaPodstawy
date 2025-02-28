package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static boolean validate(String emailStr) {

       if (emailStr == null || emailStr.trim().isBlank()) {
           return false;
       }
        String regex = "[a-zA-Z0-9_.-]+[@][a-z]+[.][a-z]{2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailStr);

        return matcher.matches();
    }
}