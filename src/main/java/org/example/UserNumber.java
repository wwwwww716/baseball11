package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    public List<Integer> userInputNumber() {
        return addToList(stringToInt(new View().inputView().split("")));
    }

    public int[] stringToInt(String[] inputs) {
        int[] stringToInt = new int[inputs.length];
        for (int i = 0; i < 3; i++) {
            stringToInt[i] = Integer.parseInt(inputs[i]);
        }
        return stringToInt;
    }

    public List<Integer> addToList(int[] numbers) {
        List<Integer> userNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            userNumberList.add(numbers[i]);
        }
        return userNumberList;
    }
}
