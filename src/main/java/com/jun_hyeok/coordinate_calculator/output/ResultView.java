package com.jun_hyeok.coordinate_calculator.output;

import com.jun_hyeok.coordinate_calculator.domain.CoordinateCalculator;

public class ResultView {
    public static void printLineLength(CoordinateCalculator coordinateCalculator) {
        System.out.println(coordinateCalculator.getLineLength());
    }
}
