package com.jun_hyeok.coordinate_calculator.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Square {
    private final List<Line> lines;
    
    public Square(String coordinateNames) {
        lines = createAndGetLines(coordinateNames);
    }
    
    public Square(List<Line> lines) {
        this.lines = lines;
    }
    
    private List<Line> createAndGetLines(String coordinateNames) {
        final List<Line> lines = new ArrayList<>();
        
        String[] split = coordinateNames.split("-");
        for (int i = 0; i < 4; i++) {
            String lineCoordinate = StringUtils.join(split[i], "-", split[(i + 1) % 4]);
            lines.add(new Line(lineCoordinate));
        }
        return lines;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(lines, square.lines);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(lines);
    }
}
