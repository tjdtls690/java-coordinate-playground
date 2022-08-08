package com.jun_hyeok.coordinate_calculator.domain;

import com.jun_hyeok.coordinate_calculator.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    @Test
    @DisplayName("사각형 넓이 구하기")
    void square_extent() {
        Figure figure = InputView.getFigure("(10,10)-(22,10)-(22,18)-(10,18)");
        double extent = figure.getExtent();
        assertThat(extent).isEqualTo(96);
    }
}