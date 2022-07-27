package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AxisTest {
    @ParameterizedTest
    @DisplayName("좌표 값 범위 0 ~ 24")
    @ValueSource(ints = {25, 0})
    void max_coordinate(int coordinateNum) {
        assertThatThrownBy(() -> new Axis(coordinateNum))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표 값의 범위는 1 ~ 24 입니다. 다시 입력해주세요.");
    }
}
