package com.jun_hyeok.coordinate_calculator.controller;

import com.jun_hyeok.coordinate_calculator.domain.Line;
import com.jun_hyeok.coordinate_calculator.view.InputView;

public class CoordinateCalculator {
    public void run() {
        Line line = InputView.getLine();
        System.out.println(line.getExtent());
    }
}
