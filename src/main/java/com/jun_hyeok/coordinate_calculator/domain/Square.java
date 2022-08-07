package com.jun_hyeok.coordinate_calculator.domain;

import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@EqualsAndHashCode
public class Square extends AbstractFigure {
    public Square(List<Point> points) throws IllegalArgumentException {
        super(points);
        checkCorrectSquare(points);
    }
    
    private void checkCorrectSquare(List<Point> points) throws IllegalArgumentException {
        Set<Integer> xNums = convertToUniqueXAxis(points);
        Set<Integer> yNums = convertToUniqueYAxis(points);
        
        if (isNotTwoPoints(xNums) || isNotTwoPoints(yNums)) {
            throw new IllegalArgumentException("직사각형 형태가 아닙니다. 다시 입력해주세요.");
        }
    }
    
    private boolean isNotTwoPoints(Set<Integer> nums) {
        return nums.size() != 2;
    }
    
    private Set<Integer> convertToUniqueYAxis(List<Point> points) {
        return convertToUniqueAxis(points, Point::getYAxis);
    }
    
    private Set<Integer> convertToUniqueXAxis(List<Point> points) {
        return convertToUniqueAxis(points, Point::getXAxis);
    }
    
    private Set<Integer> convertToUniqueAxis(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(Collectors.toSet());
    }
    
    @Override
    public double getExtent() {
        return 0;
    }
    
    @Override
    public String getResultExtentString() {
        return null;
    }
}
