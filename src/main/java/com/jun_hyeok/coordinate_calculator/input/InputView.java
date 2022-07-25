package com.jun_hyeok.coordinate_calculator.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    
    public static final String COORDINATE_INPUT_MESSAGE = "좌표를 입력하세요.";
    
    public static String getCoordinate() {
        System.out.println(COORDINATE_INPUT_MESSAGE);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
