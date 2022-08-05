package com.jun_hyeok.coordinate_calculator.domain;

public class Point {
    public static final int MAX_COORDINATE_NUM = 24;
    public static final int MIN_COORDINATE_NUM = 1;
    private final int xAxis;
    private final int yAxis;
    
    public Point(int xAxis, int yAxis) throws IllegalArgumentException {
        if (xAxis > MAX_COORDINATE_NUM || xAxis < MIN_COORDINATE_NUM || yAxis > MAX_COORDINATE_NUM || yAxis < MIN_COORDINATE_NUM) {
            throw new IllegalArgumentException("좌표의 범위를 벗어났습니다. 다시 입력해주세요.");
        }
        
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    
    public boolean isSame(int xAxis, int yAxis) {
        return this.xAxis == xAxis && this.yAxis == yAxis;
    }
}
