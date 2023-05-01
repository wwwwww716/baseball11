package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerNumber {

    private final int MAX_NO = 9;
    private final int MIN_NO = 1;
    private final int SIZE_NO = 3;

    public List<Integer> createComputerNumber() {
        List<Integer> computerNumberList = new ArrayList<>();
        while (computerNumberList.size() < SIZE_NO) {
            int randomNumber = new Random().nextInt(MAX_NO) + MIN_NO;
            isContainsAddNumber(computerNumberList, randomNumber);
        }
        return computerNumberList;
    }
    private void isContainsAddNumber(List<Integer> computerNumberList, int randomNumber) {
        if (!computerNumberList.contains(randomNumber)) {
            computerNumberList.add(randomNumber);
        }
    }

}
