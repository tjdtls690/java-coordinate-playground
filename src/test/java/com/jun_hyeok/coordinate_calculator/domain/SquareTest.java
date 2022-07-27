package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {
    
    
    @Test
    @DisplayName("좌표값 저장")
    void data_save() {
        Square square = new Square("(10,10)-(22,10)-(22,18)-(10,18)");
        List<Line> lines = Arrays.asList(new Line("(10,10)-(22,10)"), new Line("(22,10)-(22,18)"), new Line("(22,18)-(10,18)"), new Line("(10,18)-(10,10)"));
        Square square1 = new Square(lines);
        assertThat(square).isEqualTo(square1);
    }
}
