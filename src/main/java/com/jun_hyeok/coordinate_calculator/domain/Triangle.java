package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class Triangle implements Figurative{
    private final List<Line> lines;
    
    public Triangle(String coordinateNames) {
        lines = createAndGetLines(coordinateNames);
    }
    
    private List<Line> createAndGetLines(String coordinateNames) {
        final List<Line> lines = new ArrayList<>();
        addLines(coordinateNames, lines);
        return lines;
    }
    
    private void addLines(String coordinateNames, List<Line> lines) {
        String[] split = coordinateNames.split("-");
        for (int i = 0; i < 3; i++) {
            String lineCoordinate = StringUtils.join(split[i], "-", split[(i + 1) % 3]);
            lines.add(new Line(lineCoordinate));
        }
    }
    
    public Triangle(List<Line> lines) {
        this.lines = lines;
    }
    
    @Override
    public List<Point> getPoints() {
        return null;
    }
    
    @Override
    public int getExtent() {
        return 0;
    }
}
