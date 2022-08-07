package com.jun_hyeok.coordinate_calculator.domain;

import java.util.List;

public class Points {
    public static final String COORDINATE_NUMBER_ESCAPE = "좌표의 입력 갯수가 맞지 않습니다. 다시 입력해주세요.";
    private final List<Point> points;
    
    public Points(List<Point> points) throws IllegalArgumentException {
        if (points.size() != 2) {
            throw new IllegalArgumentException(COORDINATE_NUMBER_ESCAPE);
        }
        this.points = points;
    }
    
    public boolean hasPoint(int xAxis, int yAxis) throws IllegalArgumentException {
        return points.stream()
                .anyMatch(point -> point.equals(new Point(xAxis, yAxis)));
    }
    
    public double getDistance() {
        return points.get(0).distance(points.get(1));
    }
}
