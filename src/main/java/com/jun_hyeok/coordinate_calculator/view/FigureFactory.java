package com.jun_hyeok.coordinate_calculator.view;

import com.jun_hyeok.coordinate_calculator.domain.Figure;
import com.jun_hyeok.coordinate_calculator.domain.Line;
import com.jun_hyeok.coordinate_calculator.domain.Point;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FigureFactory {
    private static final HashMap<Integer, Function<List<Point>, Figure>> figureFactoryMap = new HashMap<>();
    
    static {
        figureFactoryMap.put(2, Line::new);
    }
    
    public static Figure create(List<Point> points) {
        return figureFactoryMap.get(points.size()).apply(points);
    }
}
