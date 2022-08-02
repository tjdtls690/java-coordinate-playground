package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class Square implements Figurative{
    private final List<Line> lines;
    
    public Square(String coordinateNames) throws IllegalArgumentException {
        lines = createAndGetLines(coordinateNames);
        isCorrectRightAngleSquare();
    }
    
    // 테스트용 생성자
    public Square(List<Line> lines) {
        this.lines = lines;
    }
    
    private void isCorrectRightAngleSquare() throws IllegalArgumentException {
        for (int lineOrderNum = 0; lineOrderNum < lines.size(); lineOrderNum++) {
            isRightAngleLine(lineOrderNum);
        }
    }
    
    private void isRightAngleLine(int lineOrderNum) throws IllegalArgumentException {
        if (!lines.get(lineOrderNum).isRightAngle(lineOrderNum)) {
            throw new IllegalArgumentException("사각형은 뒤틀어진 사다리꼴이나 마름모 꼴이 아닌 직사각형만 가능합니다.");
        }
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
    
    @Override
    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        
        for (Line line : lines) {
            checkPoint(points, line);
        }
        
        return points;
    }
    
    private static void checkPoint(List<Point> points, Line line) {
        for (Point point : line.getPoints()) {
            addPoints(points, point);
        }
    }
    
    private static void addPoints(List<Point> points, Point point) {
        if (!points.contains(point)) {
            points.add(point);
        }
    }
    
    @Override
    public int getExtent() {
        return (int) (lines.get(0).length() * lines.get(1).length());
    }
}
