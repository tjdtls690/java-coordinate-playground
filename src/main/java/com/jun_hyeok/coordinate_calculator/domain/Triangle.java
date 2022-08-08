package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
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
        Points points = getPoints();
        List<Point> pointList = points.getPoints();
        double distance1 = pointList.get(0).distance(pointList.get(1));
        double distance2 = pointList.get(1).distance(pointList.get(2));
        double distance3 = pointList.get(0).distance(pointList.get(2));
    
        return getTriangleExtent(distance1, distance2, distance3);
    }
    
    private static double getTriangleExtent(double distance1, double distance2, double distance3) {
        double halfOfSum = (distance1 + distance2 + distance3) / 2;
        return Math.sqrt(halfOfSum * (halfOfSum - distance1) * (halfOfSum - distance2) * (halfOfSum - distance3));
    }
    
    @Override
    public String getResultExtentString() {
        return "삼각형 넓이는 " + getExtent();
    }
}
