package com.jun_hyeok.coordinate_calculator.controller;

import com.jun_hyeok.coordinate_calculator.domain.Figure;
import com.jun_hyeok.coordinate_calculator.domain.Line;
import com.jun_hyeok.coordinate_calculator.view.InputView;
import com.jun_hyeok.coordinate_calculator.view.ResultView;

public class CoordinateCalculator {
    public void run() {
        Figure figure = InputView.getFigure();
        ResultView.printCoordinateGraph(figure);
        ResultView.printExtentResult(figure);
    }
}
