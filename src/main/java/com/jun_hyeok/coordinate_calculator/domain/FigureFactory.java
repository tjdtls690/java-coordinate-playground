package com.jun_hyeok.coordinate_calculator.domain;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FigureFactory {
    public static final String OUT_OF_POINTS_NUM_RANGE = "좌표 입력 개수의 범위를 벗어났습니다. 다시 입력해주세요.";
    private static final HashMap<Integer, Function<List<Point>, Figure>> figureFactoryMap = new HashMap<>();
    
    public static final int LINE_POINTS_NUM = 2;
    public static final int TRIANGLE_POINTS_NUM = 3;
    public static final int SQUARE_POINTS_NUM = 4;
    public static final int MIN_POINTS_NUM = 2;
    public static final int MAX_POINTS_NUM = 4;
    
    
    static {
        figureFactoryMap.put(LINE_POINTS_NUM, Line::new);
        figureFactoryMap.put(TRIANGLE_POINTS_NUM, Triangle::new);
        figureFactoryMap.put(SQUARE_POINTS_NUM, Square::new);
    }
    
    public static Figure create(List<Point> points) throws IllegalArgumentException {
        if (isCorrectPointsNum(points)) {
            throw new IllegalArgumentException(OUT_OF_POINTS_NUM_RANGE);
        }
        
        return figureFactoryMap.get(points.size()).apply(points);
    }
    
    private static boolean isCorrectPointsNum(List<Point> points) {
        return points == null || points.size() < MIN_POINTS_NUM || points.size() > MAX_POINTS_NUM;
    }
}
