package com.jun_hyeok.coordinate_calculator.view;

import com.jun_hyeok.coordinate_calculator.domain.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    private List<Point> points;
    
    @BeforeEach
    void setUp() {
        points = new ArrayList<>();
    }
    
    @Test
    @DisplayName("선 객체 생성")
    void create_Line() {
        Figure figure = InputView.getFigure("(10,10)-(14,15)");
        points.add(new Point(10, 10));
        points.add(new Point(14, 15));
        assertThat(figure).isEqualTo(new Line(points));
    }
    
    @Test
    @DisplayName("사각형 객체 생성")
    void create_square() {
        Figure figure = InputView.getFigure("(10,10)-(22,10)-(22,18)-(10,18)");
        points.add(new Point(10, 10));
        points.add(new Point(22, 10));
        points.add(new Point(22, 18));
        points.add(new Point(10, 18));
        assertThat(figure).isEqualTo(new Square(points));
    }
    
    @Test
    @DisplayName("삼각형 객체 생성")
    void create_triangle() {
        Figure figure = InputView.getFigure("(10,10)-(14,15)-(20,8)");
        points.add(new Point(10, 10));
        points.add(new Point(14, 15));
        points.add(new Point(20, 8));
        assertThat(figure).isEqualTo(new Triangle(points));
    }
    
    @AfterEach
    void tearDown() {
        points = null;
    }
}