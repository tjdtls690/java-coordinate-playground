package com.jun_hyeok.coordinate_calculator.view;

import com.jun_hyeok.coordinate_calculator.domain.Figure;
import com.jun_hyeok.coordinate_calculator.domain.Line;
import com.jun_hyeok.coordinate_calculator.domain.Point;
import com.jun_hyeok.coordinate_calculator.domain.Square;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FigureFactory {
    private static final HashMap<Integer, Function<List<Point>, Figure>> figureFactoryMap = new HashMap<>();
    
    public static final int LINE_POINTS_NUM = 2;
    
    public static final int SQUARE_POINTS_NUM = 4;
    
    static {
        figureFactoryMap.put(LINE_POINTS_NUM, Line::new);
        figureFactoryMap.put(SQUARE_POINTS_NUM, Square::new);
    }
    
    public static Figure create(List<Point> points) {
        return figureFactoryMap.get(points.size()).apply(points);
    }
}
