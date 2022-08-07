package com.jun_hyeok.coordinate_calculator.domain;

import com.jun_hyeok.coordinate_calculator.view.InputView;

import java.util.List;

public class Line extends AbstractFigure {
    public Line(List<Point> points) throws IllegalArgumentException {
        super(points);
    }
    
    @Override
    public double getExtent() {
        return getPoints().getDistance();
    }
    
    @Override
    public String getResultExtentString() {
        return "두 점 사이 거리는 " + getExtent();
    }
}
