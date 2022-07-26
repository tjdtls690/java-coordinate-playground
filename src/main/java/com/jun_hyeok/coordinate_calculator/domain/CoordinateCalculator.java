package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class CoordinateCalculator {
    private final Line line;
    
    public CoordinateCalculator(String coordinate) throws IllegalArgumentException {
        this(new Line(coordinate));
    }
    
    public CoordinateCalculator(Line line) {
        this.line = line;
    }
    
    public double getLineLength() {
        return line.length();
    }
    
    public List<Point> getPoints() {
        return line.getPoints();
    }
}
