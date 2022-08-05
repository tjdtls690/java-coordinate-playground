package com.jun_hyeok.coordinate_calculator.domain;

import java.util.List;

public class Line {
    private final List<Point> points;
    
    public Line(List<Point> points) {
        this.points = points;
    }
    
    public boolean hasPoint(int xAxis, int yAxis) {
        return points.stream()
                .anyMatch(point -> point.isSame(xAxis, yAxis));
    }
}
