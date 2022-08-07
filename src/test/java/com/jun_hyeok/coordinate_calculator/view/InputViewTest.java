package com.jun_hyeok.coordinate_calculator.view;

import com.jun_hyeok.coordinate_calculator.domain.Figure;
import com.jun_hyeok.coordinate_calculator.domain.Line;
import com.jun_hyeok.coordinate_calculator.domain.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    @Test
    @DisplayName("선 객체 생성")
    void create_Line() {
        Figure figure = InputView.getFigure("(10,10)-(14,15)");
        List<Point> points = new ArrayList<>();
        points.add(new Point(10, 10));
        points.add(new Point(14, 15));
        assertThat(figure).isEqualTo(FigureFactory.create(points));
    }
}