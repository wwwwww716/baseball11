package org.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ValidatorUtils {

    public boolean isValidString(String input) {
        return isValidLength(input) && isValidRange(input) && isNotDuplicate(input);
    }

    private boolean isNotDuplicate(String input) {
        return Arrays.stream(input.split(""))
                .distinct()
                .count() == 3;
    }

    private boolean isValidRange(String input) {
        Pattern pattern = Pattern.compile("^[" + 1 + "-" + 9 +"]*$");
        return pattern.matcher(input).matches();
    }

    private boolean isValidLength(String input) {
        return input.length() == 3;
    }

    public boolean isValidEndNumber(int number) {
        return number == 1 || number == 2;
    }

}
