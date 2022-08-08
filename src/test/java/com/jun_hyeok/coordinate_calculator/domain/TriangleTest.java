package com.jun_hyeok.coordinate_calculator.domain;

import com.jun_hyeok.coordinate_calculator.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("삼각형 형태의 모양인지 검증")
    void is_triangle_shape() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(2, 2));
        points.add(new Point(3, 3));
        assertThatThrownBy(() -> new Triangle(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(Triangle.NOT_TRIANGLE_SHAPE);
    }
}