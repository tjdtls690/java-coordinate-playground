package com.jun_hyeok.coordinate_calculator.domain;

public class Point {
    private final int xAxis;
    private final int yAxis;
    
    public Point(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    
    public boolean isSame(int xAxis, int yAxis) {
        return this.xAxis == xAxis && this.yAxis == yAxis;
    }
}
