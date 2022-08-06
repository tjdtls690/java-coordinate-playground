package com.jun_hyeok.coordinate_calculator.view;

import com.jun_hyeok.coordinate_calculator.domain.Line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    public static final String NOT_VALID_INPUT = "올바른 입력값이 아닙니다. 다시 입력해주세요.";
    public static final String INPUT_GUIDE_MESSAGE = "좌표를 입력하세요.";
    private static BufferedReader br;
    
    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public static Line getLine() {
        System.out.println(INPUT_GUIDE_MESSAGE);
        try {
            String input = br.readLine();
            return getLine(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    private static Line getLine(String input) {
        try {
            input = input.replace(" ", "");
            isCorrectInput(input);
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getLine();
        }
    }
    
    private static void isCorrectInput(String input) throws IllegalArgumentException {
        Matcher matcher = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}").matcher(input);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(NOT_VALID_INPUT);
        }
    }
}
