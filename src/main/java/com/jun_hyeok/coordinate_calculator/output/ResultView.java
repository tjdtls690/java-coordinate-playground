package com.jun_hyeok.coordinate_calculator.output;

import com.jun_hyeok.coordinate_calculator.domain.Axis;
import com.jun_hyeok.coordinate_calculator.domain.CoordinateCalculator;
import com.jun_hyeok.coordinate_calculator.domain.Point;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    
    public static final int MIN_AXIS_NUM = 1;
    public static final int MAX_AXIS_NUM = 24;
    
    public static void printLineLength(CoordinateCalculator coordinateCalculator) {
        double lineLength = coordinateCalculator.getLineLength();
        
        if (lineLength == (long) lineLength) {
            System.out.printf("두 점 사이 거리는 %s\n", (long) lineLength);
            return;
        }
        
        System.out.printf("두 점 사이 거리는 %f\n", lineLength);
    }
    
    public static void graphUIPrint(CoordinateCalculator coordinateCalculator) {
        List<Point> pointList = getPoints(coordinateCalculator);
        
        yAxisPrint(pointList);
        xAxisPrint();
        System.out.println();
    }
    
    private static List<Point> getPoints(CoordinateCalculator coordinateCalculator) {
        if (coordinateCalculator.isLine()) {
            return coordinateCalculator.getPoints();
        }
        
        return coordinateCalculator.getAllPoints();
    }
    
    private static void yAxisPrint(List<Point> pointList) {
        for (int i = MAX_AXIS_NUM; i >= MIN_AXIS_NUM; i--) {
            isEvenNumPrint(i);
            System.out.print("|");
            isAllAxisMarkPrint(pointList, i);
        }
    }
    
    private static void isAllAxisMarkPrint(List<Point> pointList, int yAxisNum) {
        List<Point> yAxisNumEqualPointList = getYAxisNumEqualPointList(pointList, yAxisNum);
        
        if (yAxisNumEqualPointList.size() > 0) {
            checkEqualToXAxis(yAxisNumEqualPointList);
        }
        
        System.out.println();
    }
    
    private static void checkEqualToXAxis(List<Point> yAxisNumEqualPointList) {
        for (int xAxisNum = MIN_AXIS_NUM; xAxisNum <= MAX_AXIS_NUM; xAxisNum++) {
            Point xAxisEqualPoint = getXAxisNumEqualPointList(yAxisNumEqualPointList, xAxisNum);
            isAxisMarkPrint(xAxisEqualPoint);
        }
    }
    
    private static void isAxisMarkPrint(Point xAxisEqualPoint) {
        if (xAxisEqualPoint != null) {
            System.out.print(" *");
            return;
        }
        
        System.out.print("  ");
    }
    
    private static Point getXAxisNumEqualPointList(List<Point> yAxisNumEqualPointList, int xAxisNum) {
        return yAxisNumEqualPointList.stream()
                .filter(point -> point.isEqualXAxis(new Axis(xAxisNum)))
                .findFirst()
                .orElse(null);
    }
    
    private static List<Point> getYAxisNumEqualPointList(List<Point> pointList, int yAxisNum) {
        return pointList.stream()
                .filter(point -> point.isEqualYAxis(new Axis(yAxisNum)))
                .collect(Collectors.toList());
    }
    
    private static void xAxisPrint() {
        xAxisUIPrint();
        xAxisNumPrint();
    }
    
    private static void xAxisNumPrint() {
        System.out.print(" 0 ");
        for (int i = MIN_AXIS_NUM; i <= MAX_AXIS_NUM; i++) {
            isEvenNumPrint(i);
        }
        
        System.out.println();
    }
    
    private static void xAxisUIPrint() {
        System.out.print("  +");
        for (int i = MIN_AXIS_NUM; i <= MAX_AXIS_NUM; i++) {
            System.out.print("--");
        }
        
        System.out.println();
    }
    
    private static void isEvenNumPrint(int axis) {
        if (axis % 2 == 0) {
            System.out.printf("%2d", axis);
            return;
        }
        
        System.out.print("  ");
    }
    
    public static void printExtent(CoordinateCalculator coordinateCalculator) {
        System.out.println("사각형 넓이 : " + coordinateCalculator.getExtent());
    }
}
