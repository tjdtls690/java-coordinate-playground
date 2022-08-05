package com.jun_hyeok.coordinate_calculator.domain;

import java.util.List;

public class Points {
    private final List<Point> points;
    
    public Points(List<Point> points) {
        this.points = points;
    }
    
    public boolean hasPoint(int xAxis, int yAxis) {
        return points.stream()
                .anyMatch(point -> point.isSame(xAxis, yAxis));
    }
    
    public double getDistance() {
        return points.get(0).distance(points.get(1));
    }
}
