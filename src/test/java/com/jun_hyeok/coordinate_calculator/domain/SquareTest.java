package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SquareTest {
    @Test
    @DisplayName("좌표값 저장")
    void data_save() {
        Square square = new Square("(10,10)-(22,10)-(22,18)-(10,18)");
        List<Line> lines = Arrays.asList(new Line("(10,10)-(22,10)"), new Line("(22,10)-(22,18)"), new Line("(22,18)-(10,18)"), new Line("(10,18)-(10,10)"));
        Square square1 = new Square(lines);
        assertThat(square).isEqualTo(square1);
    }
    
    @Test
    @DisplayName("뒤틀어진 사다리꼴과 마름모 거르기")
    void is_correct_square() {
        assertThatThrownBy(() -> new Square("(10,10)-(22,11)-(22,18)-(10,18)"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사각형은 뒤틀어진 사다리꼴이나 마름모 꼴일 수 없습니다.");
    }
}
