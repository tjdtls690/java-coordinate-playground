package com.jun_hyeok.fuel_car.domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    public static final String NEWLINE = System.lineSeparator();
    
    private final List<Car> carList;
    
    public RentCompany() {
        carList = new ArrayList<>();
    }
    
    public static RentCompany create() {
        return new RentCompany();
    }
    
    public void addCar(Car car) {
        carList.add(car);
    }
    
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        for (Car car : carList) {
            report.append(car.getName())
                    .append(" : ")
                    .append((int) car.getChargeQuantity())
                    .append("리터")
                    .append(NEWLINE);
            
        }
        return report.toString();
    }
}
