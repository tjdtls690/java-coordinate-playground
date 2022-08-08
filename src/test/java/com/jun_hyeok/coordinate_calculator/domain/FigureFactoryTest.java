package com.jun_hyeok.coordinate_calculator.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class FigureFactoryTest {
    private List<Point> points;
    
    @BeforeEach
    void setUp() {
        points = new ArrayList<>();
    }
    
    @Test
    @DisplayName("좌표를 하나도 입력하지 않았을 때 예외던지기")
    void input_null() {
        assertThatThrownBy(() -> FigureFactory.create(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(FigureFactory.OUT_OF_POINTS_NUM_RANGE);
    }
    
    @Test
    @DisplayName("좌표 입력 갯수가 1개 이하인 경우 예외던지기")
    void input_one_coordinate() {
        points.add(new Point(10, 10));
        assertThatThrownBy(() -> FigureFactory.create(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(FigureFactory.OUT_OF_POINTS_NUM_RANGE);
    }
    
    @Test
    @DisplayName("좌표 입력 갯수가 5개 이상인 경우 예외던지기")
    void input_five_coordinate() {
        points.add(new Point(10, 10));
        points.add(new Point(15, 11));
        points.add(new Point(20, 12));
        points.add(new Point(13, 13));
        points.add(new Point(10, 14));
        assertThatThrownBy(() -> FigureFactory.create(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(FigureFactory.OUT_OF_POINTS_NUM_RANGE);
    }
    
    @Test
    @DisplayName("좌표 3개 입력 시, 삼각형 객체 생성")
    void create_triangle() {
        points.add(new Point(10, 10));
        points.add(new Point(15, 12));
        points.add(new Point(20, 12));
        Figure figure = FigureFactory.create(points);
        assertThat(figure).isEqualTo(new Triangle(points));
    }
    
    @Test
    @DisplayName("좌표 3개 입력 시, 삼각형 객체 생성")
    void create_square() {
        points.add(new Point(10, 10));
        points.add(new Point(10, 18));
        points.add(new Point(22, 18));
        points.add(new Point(22, 10));
        Figure figure = FigureFactory.create(points);
        assertThat(figure).isEqualTo(new Square(points));
    }
    
    @Test
    @DisplayName("좌표 3개 입력 시, 삼각형 객체 생성")
    void create_line() {
        points.add(new Point(10, 10));
        points.add(new Point(15, 12));
        Figure figure = FigureFactory.create(points);
        assertThat(figure).isEqualTo(new Line(points));
    }
    
    @AfterEach
    void tearDown() {
        points = null;
    }
}