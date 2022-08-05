package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {
    @Test
    @DisplayName("좌표 범위 벗어나면 예외 던지기")
    void coordinate_range_exceeded() {
        assertThatThrownBy(() -> new Point(1, 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표의 범위를 벗어났습니다. 다시 입력해주세요.");
    
        assertThatThrownBy(() -> new Point(0, 24))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표의 범위를 벗어났습니다. 다시 입력해주세요.");
    }
}
