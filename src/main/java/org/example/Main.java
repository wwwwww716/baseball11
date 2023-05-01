package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ComputerNumber computerNumber = new ComputerNumber();
        Scanner scanner = new Scanner(System.in);
        boolean gameRestart = true;
        
        while (gameRestart) {
            List<Integer> computerNumberList = computerNumber.createComputerNumber();
            System.out.println(computerNumberList);
            userInputRepeat(computerNumberList);
            gameRestart = new View().gameEndView();
        }
    }

    private static void userInputRepeat(List<Integer> computerNumberList) {
        while (true) {
            List<Integer> userNumberList = new UserNumber().userInputNumber();

            int correct = new Count().correctCount(userNumberList, computerNumberList);
            int strike = new Count().strikeCount(userNumberList, computerNumberList);
            int ball = correct - strike;

            if (Referee(correct, strike, ball)) break;
        }
    }

    private static boolean Referee(int correct, int strike, int ball) {
        if (isStrikeThree(strike)) return true;
        onlyStrike(correct, strike);
        onlyBall(correct, ball);
        nothing(correct);
        ballAndStrike(strike, ball);
        return false;
    }

    private static void ballAndStrike(int strike, int ball) {
        if (ball != 0 && strike != 0) {
            System.out.println(ball + "볼" + strike + "스트라이크");
        }
    }

    private static void nothing(int correct) {
        if (correct == 0) {
            System.out.println("낫싱");
        }
    }

    private static void onlyBall(int correct, int ball) {
        if (ball == correct && correct != 0) {
            System.out.println(ball + "볼");
        }
    }

    private static void onlyStrike(int correct, int strike) {
        if (strike == correct && correct != 0) {
            System.out.println(strike + "스트라이크");
        }
    }

    private static boolean isStrikeThree(int strike) {
        if (strike == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}