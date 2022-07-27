package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
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
        addLines(coordinateNames, lines);
        return lines;
    }
    
    private static void addLines(String coordinateNames, List<Line> lines) {
        String[] split = coordinateNames.split("-");
        for (int i = 0; i < 4; i++) {
            String lineCoordinate = StringUtils.join(split[i], "-", split[(i + 1) % 4]);
            lines.add(new Line(lineCoordinate));
        }
    }
}
