package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.List;

public class Triangle extends AbstractFigure {
    
    public static final String NOT_TRIANGLE_SHAPE = "삼각형 모양이 아닙니다. 다시 입력해주세요.";
    
    public Triangle(List<Point> points) throws IllegalArgumentException {
        super(points);
        if (isCorrectTriangle(points)) {
            throw new IllegalArgumentException(NOT_TRIANGLE_SHAPE);
        }
        ;
    }
    
    private boolean isCorrectTriangle(List<Point> points) {
        return points.get(0).getSlope(points.get(1)) == points.get(1).getSlope(points.get(2));
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
