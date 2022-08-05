package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Axis {
    public static final int MAX_COORDINATE_NUM = 24;
    public static final int MIN_COORDINATE_NUM = 1;
    public static final String COORDINATE_RANGE_EXCEEDED = "좌표의 범위를 벗어났습니다. 다시 입력해주세요.";
    private final int axis;
    
    public Axis(int axis) throws IllegalArgumentException{
        if (axis > MAX_COORDINATE_NUM || axis < MIN_COORDINATE_NUM) {
            throw new IllegalArgumentException(COORDINATE_RANGE_EXCEEDED);
        }
        
        this.axis = axis;
    }
    
    public double distance(Axis axis) {
        return this.axis - axis.axis;
    }
}
