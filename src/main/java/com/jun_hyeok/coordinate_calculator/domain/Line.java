package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.Arrays;
import java.util.List;

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
    
    public List<Point> getPoints() {
        return Arrays.asList(fPoint, sPoint);
    }
    
    public boolean isRightAngle(int lineOrderNum) {
        if (lineOrderNum % 2 == 0) {
            return fPoint.isEqualYAxis(sPoint);
        }
        
        return fPoint.isEqualXAxis(sPoint);
    }
}
