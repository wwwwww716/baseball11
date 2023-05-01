package org.example;

import java.util.List;

public class Count {

    public int correctCount (List<Integer> user, List<Integer> computer) {
        int correct = 0;
        return correctCounter(user, computer, correct);
    }

    private static int correctCounter(List<Integer> user, List<Integer> computer, int correct) {
        for (int i = 0; i < 3; i++) {
            int number = computer.get(i);
            correct = correctPlus(user, correct, number);
        }
        return correct;
    }

    private static int correctPlus(List<Integer> user, int correct, int number) {
        if (user.contains(number)) {
            correct++;
        }
        return correct;
    }

    public int strikeCount (List<Integer> user, List<Integer> computer) {
        int strike = 0;
        return strikeCounter(user, computer, strike);
    }

    private static int strikeCounter(List<Integer> user, List<Integer> computer, int strike) {
        for (int i = 0; i < 3; i++) {
            strike = strikeCount(user, computer, strike, i);
        }
        return strike;
    }

    private static int strikeCount(List<Integer> user, List<Integer> computer, int strike, int i) {
        if (user.get(i).equals(computer.get(i))) {
            strike = strikePlus(strike);
        }
        return strike;
    }

    private static int strikePlus(int strike) {
        strike++;
        return strike;
    }

}
