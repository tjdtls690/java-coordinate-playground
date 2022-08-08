package com.jun_hyeok.coordinate_calculator.view;

import com.jun_hyeok.coordinate_calculator.domain.Figure;
import com.jun_hyeok.coordinate_calculator.domain.FigureFactory;
import com.jun_hyeok.coordinate_calculator.domain.Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    public static final String NOT_VALID_INPUT = "올바른 입력값이 아닙니다. 다시 입력해주세요.";
    public static final String INPUT_GUIDE_MESSAGE = "좌표를 입력하세요.";
    public static final String COORDINATE_DELIMER = "-";
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static Figure getFigure() {
        System.out.println(INPUT_GUIDE_MESSAGE);
        try {
            return getFigure(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static Figure getFigure(String input) {
        try {
            input = input.replace(" ", "");
            isCorrectInput(input);
            return createLine(createPoints(input));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getFigure();
        }
    }
    
    private static Figure createLine(List<Point> points) throws IllegalArgumentException {
        return FigureFactory.create(points);
    }
    
    private static List<Point> createPoints(String input) throws IllegalArgumentException {
        String[] coordinates = input.split(COORDINATE_DELIMER);
        List<Point> points = new ArrayList<>();
        for (String coordinate : coordinates) {
            points.add(createPoint(coordinate));
        }
        
        return points;
    }
    
    private static Point createPoint(String coordinate) throws IllegalArgumentException {
        Matcher matcher = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)").matcher(coordinate);
        if (matcher.matches()) {
            int xAxis = Integer.parseInt(matcher.group(1));
            int yAxis = Integer.parseInt(matcher.group(2));
            
            return new Point(xAxis, yAxis);
        }
        throw new IllegalArgumentException(NOT_VALID_INPUT);
    }
    
    private static void isCorrectInput(String input) throws IllegalArgumentException {
        Matcher matcher = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\)))*").matcher(input);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(NOT_VALID_INPUT);
        }
    }
}
