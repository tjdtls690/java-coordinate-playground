package com.jun_hyeok.coordinate_calculator.view;

import com.jun_hyeok.coordinate_calculator.domain.Figure;
import com.jun_hyeok.coordinate_calculator.domain.Line;
import com.jun_hyeok.coordinate_calculator.domain.Point;
import com.jun_hyeok.coordinate_calculator.domain.Points;

import java.util.List;

public class ResultView {
    
    public static final String FOUR_SPACE = "    ";
    public static final int MAX_AXIS_NUM = 24;
    public static final int MIN_AXIS_NUM = 1;
    public static final String START_POINT = "+";
    public static final String FOUR_BAR = "----";
    
    public static void printCoordinateGraph(Figure figure) {
        Points points = figure.getPoints();
        for (int yAxis = MAX_AXIS_NUM; yAxis >= MIN_AXIS_NUM; yAxis--){
            evenNumPrint(yAxis);
            System.out.print("|");
            coordinatePrint(yAxis, points);
        }
        printXAxis();
    }
    
    private static void printXAxis() {
        printXAxisBar();
        System.out.println();
        printXAxisNum();
    }
    
    private static void printXAxisNum() {
        System.out.printf("%4d ", 0);
        for (int i = MIN_AXIS_NUM; i <= MAX_AXIS_NUM; i++) {
            evenNumPrint(i);
        }
        System.out.println();
    }
    
    private static void printXAxisBar() {
        System.out.print(FOUR_SPACE + START_POINT);
        for (int i = MIN_AXIS_NUM; i <= MAX_AXIS_NUM; i++) {
            System.out.print(FOUR_BAR);
        }
    }
    
    private static void coordinatePrint(int yAxis, Points points) {
        for (int xAxis = MIN_AXIS_NUM; xAxis <= MAX_AXIS_NUM; xAxis++) {
            if (isPoint(points, xAxis, yAxis)) {
                System.out.printf("%4s", "*");
                continue;
            }
            System.out.print(FOUR_SPACE);
        }
        System.out.println();
    }
    
    private static boolean isPoint(Points points, int xAxis, int yAxis) {
        return points.getPoints().stream()
                .anyMatch(point -> point.hasPoint(xAxis, yAxis));
    }
    
    private static void evenNumPrint(int coordinateNum) {
        if (coordinateNum % 2 == 0) {
            System.out.printf("%4d", coordinateNum);
            return;
        }
        System.out.print(FOUR_SPACE);
    }
    
    public static void printExtentResult(Figure figure) {
        System.out.println("\n" + figure.getResultExtentString());
    }
}
