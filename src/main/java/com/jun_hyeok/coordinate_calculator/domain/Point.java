package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Point {
    private final Axis xAxis;
    private final Axis yAxis;
    
    public Point(String coordinatePoints) {
        int[] axisNums = getAxisNums(coordinatePoints);
        this.xAxis = new Axis(axisNums[0]);
        this.yAxis = new Axis(axisNums[1]);
    }
    
    public Point(Axis xAxis, Axis yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    
    private int[] getAxisNums(String coordinatePoints) {
        return getAxisInt(getAxisStr(coordinatePoints));
    }
    
    private int[] getAxisInt(String[] axisStr) {
        int[] axisNums = new int[2];
        for (int i = 0; i < axisStr.length; i++) {
            axisNums[i] = Integer.parseInt(axisStr[i]);
        }
        return axisNums;
    }
    
    private String[] getAxisStr(String coordinatePoints) {
        coordinatePoints = coordinatePoints.substring(1, coordinatePoints.length() - 1);
        return coordinatePoints.split(",");
    }
}
