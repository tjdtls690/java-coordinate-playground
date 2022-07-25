package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Line {
    
    private final Point fPoint;
    private final Point sPoint;
    
    public Line(String coordinate) throws IllegalArgumentException {
        String[] split = coordinate.split("-");
        this.fPoint = new Point(split[0]);
        this.sPoint = new Point(split[1]);
    }
    
    public Line(Point fPoint, Point sPoint) {
        this.fPoint = fPoint;
        this.sPoint = sPoint;
    }
    
    public double length() {
        return Math.sqrt(Math.pow(fPoint.getXAxis() - sPoint.getXAxis(), 2) + Math.pow(fPoint.getYAxis() - sPoint.getYAxis(), 2));
    }
}
