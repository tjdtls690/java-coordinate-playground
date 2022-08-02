package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class CoordinateCalculator {
    private Line line;
    private Figurative figure;
    
    public CoordinateCalculator(String coordinate) throws IllegalArgumentException {
        long delimCount = getDelimCount(coordinate);
        if (delimCount == 3) {
            this.figure = new Square(coordinate);
            return;
        }
        
        if (delimCount == 2) {
            this.figure = new Triangle(coordinate);
            return;
        }
        
        this.line = new Line(coordinate);
    }
    
    public CoordinateCalculator(Line line) {
        this.line = line;
    }
    
    public CoordinateCalculator(Square square) {
        this.figure = square;
    }
    
    public CoordinateCalculator(Triangle triangle) {
        this.figure = triangle;
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
        return figure.getPoints();
    }
    
    public int getExtent() {
        return figure.getExtent();
    }
    
    public boolean isSquare() {
        return figure instanceof Square;
    }
}
