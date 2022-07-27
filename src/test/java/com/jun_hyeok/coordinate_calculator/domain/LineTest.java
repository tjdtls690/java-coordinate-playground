package com.jun_hyeok.coordinate_calculator.domain;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    @Test
    @DisplayName("두 점 사이의 거리 계산")
    void two_point_distance() {
        Line line = new Line("(10,10)-(14,15)");
        double distance = line.length();
        assertThat(distance).isEqualTo(6.403124, Offset.offset(0.000000999));
    }
}