package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {
    private static Line line;
    
    @BeforeEach
    void setUp() {
        line = new Line(Arrays.asList(new Point(10, 10), new Point(14, 15)));
    }
    
    @Test
    @DisplayName("선 객체 생성")
    void create_line() {
        assertThat(line).isInstanceOf(Line.class);
    }
    
    @Test
    @DisplayName("좌표 저장 확인")
    void save_coordinate() {
        assertThat(line.hasPoint(10, 10)).isTrue();
        assertThat(line.hasPoint(14, 15)).isTrue();
    }
    
    @Test
    @DisplayName("선 길이 구하기")
    void find_line_length() {
        double length = line.length();
        assertThat(length).isEqualTo(6.403124, offset(0.0000009999));
    }
    
    @AfterEach
    void tearDown() {
        line = null;
    }
}
