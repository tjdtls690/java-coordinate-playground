package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Point {
    private final Axis xAxis;
    private final Axis yAxis;
    
    public Point(int xAxis, int yAxis) throws IllegalArgumentException {
        this.xAxis = new Axis(xAxis);
        this.yAxis = new Axis(yAxis);
    }
    
    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.xAxis.distance(point.xAxis), 2) + Math.pow(this.yAxis.distance(point.yAxis), 2));
    }
    
    public boolean hasPoint(int xAxis, int yAxis) {
        return this.equals(new Point(xAxis, yAxis));
    }
    
    public int getXAxis() {
        return xAxis.getAxis();
    }
    
    public int getYAxis() {
        return yAxis.getAxis();
    }
    
    public double getSlope(Point point) {
        if (this.xAxis.equals(point.xAxis)) {
            return Double.MAX_VALUE;
        }
        return this.yAxis.distance(point.yAxis) / this.xAxis.distance(point.xAxis);
    }
}
