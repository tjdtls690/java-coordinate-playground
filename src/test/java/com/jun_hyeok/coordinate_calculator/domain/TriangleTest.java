package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    
    @Test
    @DisplayName("좌표 저장 여부 확인")
    void save_axis() {
        Triangle triangle1 = new Triangle("(10,10)-(14,15)-(20,8)");
        Triangle triangle2 = new Triangle(Arrays.asList(new Line("(10,10)-(14,15)"), new Line("(14,15)-(20,8)"), new Line("(20,8)-(10,10)")));
        assertThat(triangle1).isEqualTo(triangle2);
    }
}
