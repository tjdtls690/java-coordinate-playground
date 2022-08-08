package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class Triangle extends AbstractFigure {
    public Triangle(List<Point> points) {
        super(points);
    }
    
    @Override
    public double getExtent() {
        return 0;
    }
    
    @Override
    public String getResultExtentString() {
        return null;
    }
}
