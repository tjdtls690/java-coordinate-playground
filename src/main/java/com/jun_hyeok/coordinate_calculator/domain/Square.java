package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class Square {
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
            throw new IllegalArgumentException("사각형은 뒤틀어진 사다리꼴이나 마름모 꼴일 수 없습니다.");
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
}
