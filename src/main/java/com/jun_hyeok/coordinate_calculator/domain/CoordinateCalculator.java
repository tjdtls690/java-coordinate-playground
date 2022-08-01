package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@EqualsAndHashCode
public class CoordinateCalculator {
    private Line line;
    private Square square;
    
    public CoordinateCalculator(String coordinate) throws IllegalArgumentException {
        long delimCount = getDelimCount(coordinate);
        if (delimCount == 3) {
            this.square = new Square(coordinate);
            return;
        }
        
        this.line = new Line(coordinate);
    }
    
    public CoordinateCalculator(Line line) {
        this.line = line;
    }
    
    public CoordinateCalculator(Square square) {
        this.square = square;
    }
    
    private long getDelimCount(String coordinate) {
        return coordinate.chars()
                .filter(value -> value == '-')
                .count();
    }
    
    public double getLineLength() {
        return line.length();
    }
    
    public List<Point> getPoints() {
        return line.getPoints();
    }
    
    public boolean isLine() {
        return line != null;
    }
    
    public List<Point> getAllPoints() {
        return square.getPoints();
    }
    
    public int getExtent() {
        return square.getExtent();
    }
}
