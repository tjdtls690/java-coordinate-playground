package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class CoordinateCalculator {
    private final Line line;
    
    public CoordinateCalculator(String coordinate) {
        this(new Line(coordinate));
    }
    
    public CoordinateCalculator(Line line) {
        this.line = line;
    }
}
