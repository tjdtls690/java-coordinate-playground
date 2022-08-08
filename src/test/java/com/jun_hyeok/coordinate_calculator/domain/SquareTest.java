package com.jun_hyeok.coordinate_calculator.domain;

import com.jun_hyeok.coordinate_calculator.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SquareTest {
    @Test
    @DisplayName("사각형 모양인지 검증")
    void is_square_shape() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(10, 10));
        points.add(new Point(22, 10));
        points.add(new Point(22, 18));
        points.add(new Point(10, 19));
        assertThatThrownBy(() -> new Square(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(Square.NOT_SQUARE_SHAPE);
    }
    
    @Test
    @DisplayName("사각형 넓이 구하기")
    void square_extent() {
        Figure figure = InputView.getFigure("(10,10)-(22,10)-(22,18)-(10,18)");
        double extent = figure.getExtent();
        assertThat(extent).isEqualTo(96);
    }
}