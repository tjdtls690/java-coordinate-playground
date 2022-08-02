package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateCalculatorTest {
    @Test
    @DisplayName("입력된 좌표 값 확인")
    void input_split_data() {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator("(10,10)-(14,15)");
        assertThat(coordinateCalculator)
                .isEqualTo(new CoordinateCalculator(new Line(new Point(new Axis(10), new Axis(10))
                        , (new Point(new Axis(14), new Axis(15))))));
    }
    
    @Test
    @DisplayName("좌표를 4개 입력한 경우 사각형으로 가정")
    void is_square() {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator("(10,10)-(22,10)-(22,18)-(10,18)");
        assertThat(coordinateCalculator)
                .isEqualTo(new CoordinateCalculator(new Square("(10,10)-(22,10)-(22,18)-(10,18)")));
    }
    
    @Test
    @DisplayName("좌표를 3개 입력한 경우 삼각형으로 가정")
    void is_triangle() {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator("(10,10)-(14,15)-(20,8)");
        assertThat(coordinateCalculator)
                .isEqualTo(new CoordinateCalculator(new Triangle("(10,10)-(14,15)-(20,8)")));
    }
    
    @Test
    @DisplayName("사각형 넓이 반환")
    void extent_square() {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator("(10,10)-(22,10)-(22,18)-(10,18)");
        int extent = coordinateCalculator.getExtent();
        assertThat(extent).isEqualTo(96);
    }
    
    @Test
    @DisplayName("삼각형 넓이 반환")
    void extent_triangle() {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator("(10,10)-(14,15)-(20,8)");
        int extent = coordinateCalculator.getExtent();
        assertThat(extent).isEqualTo(29);
    }
}
