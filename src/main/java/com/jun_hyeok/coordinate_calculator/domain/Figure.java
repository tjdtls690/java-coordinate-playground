package com.jun_hyeok.coordinate_calculator.domain;

public interface Figure {
    boolean hasPoint(int xAxis, int yAxis);
    
    double getExtent();
    
    Points getPoints();
    
    String getResultExtentString();
}
