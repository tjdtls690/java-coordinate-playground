package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    private static Line line;
    
    @BeforeEach
    void setUp() {
        line = new Line(Arrays.asList(new Point(1, 2), new Point(3, 4)));
    }
    
    @Test
    @DisplayName("선 객체 생성")
    void create_line() {
        assertThat(line).isInstanceOf(Line.class);
    }
    
    @Test
    @DisplayName("좌표 저장 확인")
    void save_coordinate() {
        assertThat(line.hasPoint(3, 4)).isTrue();
        assertThat(line.hasPoint(1, 2)).isTrue();
    }
    
    @AfterEach
    void tearDown() {
        line = null;
    }
}
