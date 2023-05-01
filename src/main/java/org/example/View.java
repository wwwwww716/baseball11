package org.example;

import java.util.Scanner;

public class View {
    public static final String gameEndMSG = "게임을 다시 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final String inputMSG = "숫자를 입력해 주세요 : ";
    Scanner scanner = new Scanner(System.in);
    ValidatorUtils validatorUtils = new ValidatorUtils();
    public String inputView() {
        printMSG(inputMSG);
        String input = getString();
        stringValidator(input);
        return input;
    }

    private void stringValidator(String input) {
        if (!(validatorUtils.isValidString(input))) {
            throw new IllegalArgumentException("1-9 사이의 서로 다른 세자리 숫자를 입력해주세요.");
        }
    }

    private String getString() {
        String input = scanner.nextLine();
        return input;
    }

    private static void printMSG(String input) {
        System.out.print(input);
    }
    
    public boolean gameEndView() {
        System.out.println("게임을 다시 시작하려면 1, 종료하려면 2를 입력하세요.");
        int inputNumber =  Integer.parseInt(scanner.nextLine());
        if (!(new ValidatorUtils().isValidEndNumber(inputNumber))) {
            throw new IllegalArgumentException("1 또는 2만 입력할 수 있습니다.");
        }
        if (inputNumber == 2) {
            return false;
        }
        return true;
    }

    private int getInputNumber() {
        int inputNumber = Integer.parseInt(scanner.nextLine());
        return inputNumber;
    }

}
