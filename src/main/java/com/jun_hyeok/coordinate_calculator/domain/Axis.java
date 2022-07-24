package com.jun_hyeok.coordinate_calculator.domain;

public class Axis {
    public static final String COORDINATE_MAX_NUM_ERROR_MEESAGE = "좌표 값의 범위는 0 ~ 24 입니다. 다시 입력해주세요.";
    private final int coordinateNum;
    
    public Axis(int coordinateNum) throws IllegalArgumentException {
        if (coordinateNum > 24 || coordinateNum < 0) {
            throw new IllegalArgumentException(COORDINATE_MAX_NUM_ERROR_MEESAGE);
        }
        
        this.coordinateNum = coordinateNum;
    }
}
