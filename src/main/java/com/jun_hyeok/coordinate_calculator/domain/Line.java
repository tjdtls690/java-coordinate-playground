package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Line {
    
    private final Point fPoint;
    private final Point sPoint;
    
    public Line(String coordinate) {
        String[] split = coordinate.split("-");
        this.fPoint = new Point(split[0]);
        this.sPoint = new Point(split[1]);
    }
    
    public Line(Point fPoint, Point sPoint) {
        this.fPoint = fPoint;
        this.sPoint = sPoint;
    }
}
