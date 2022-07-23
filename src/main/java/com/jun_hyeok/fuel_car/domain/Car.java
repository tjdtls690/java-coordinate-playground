package com.jun_hyeok.fuel_car.domain;

public abstract class Car {
    protected int tripDistance;
    
    abstract double getDistancePerLiter();
    
    abstract double getTripDistance();
    
    abstract String getName();
    
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
