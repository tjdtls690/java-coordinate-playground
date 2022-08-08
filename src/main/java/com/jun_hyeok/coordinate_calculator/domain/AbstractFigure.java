package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
abstract public class AbstractFigure implements Figure {
    private final Points points;
    
    protected AbstractFigure(List<Point> points) throws IllegalArgumentException {
        this.points = new Points(points);
    }
    
    @Override
    public boolean hasPoint(int xAxis, int yAxis) {
        return points.hasPoint(xAxis, yAxis);
    }
    
    @Override
    public Points getPoints() {
        return points;
    }
}
