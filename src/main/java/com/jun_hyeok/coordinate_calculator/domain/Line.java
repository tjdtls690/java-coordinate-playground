package com.jun_hyeok.coordinate_calculator.domain;

import java.util.List;

public class Line {
    private final Points points;
    
    public Line(List<Point> points) throws IllegalArgumentException {
        this.points = new Points(points);
    }
    
    public boolean hasPoint(int xAxis, int yAxis) {
        return points.hasPoint(xAxis, yAxis);
    }
    
    public double getExtent() {
        return points.getDistance();
    }
    
    public List<Point> getPoints() {
        return points.getPoints();
    }
}
