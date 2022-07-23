package com.jun_hyeok.fuel_car.domain;

public class Avante extends Car {
    
    public static final String CAR_NAME = "Avante";
    
    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }
    
    @Override
    double getDistancePerLiter() {
        return 15;
    }
    
    @Override
    double getTripDistance() {
        return this.tripDistance;
    }
    
    @Override
    String getName() {
        return CAR_NAME;
    }
}
