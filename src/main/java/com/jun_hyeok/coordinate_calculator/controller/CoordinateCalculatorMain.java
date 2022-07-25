package com.jun_hyeok.coordinate_calculator.controller;

import com.jun_hyeok.coordinate_calculator.domain.CoordinateCalculator;
import com.jun_hyeok.coordinate_calculator.input.InputView;
import com.jun_hyeok.coordinate_calculator.output.ResultView;

public class CoordinateCalculatorMain {
    public static void main(String[] args) {
        CoordinateCalculator coordinateCalculator = getCoordinateCalculator();
        ResultView.printLineLength(coordinateCalculator);
    }
    
    private static CoordinateCalculator getCoordinateCalculator() {
        String input = InputView.getCoordinate();
        CoordinateCalculator coordinateCalculator;
        try {
            coordinateCalculator = new CoordinateCalculator(input);
            return coordinateCalculator;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getCoordinateCalculator();
        }
    }
}
