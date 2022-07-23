package com.jun_hyeok.fuel_car.domain;

public class Sonata extends Car {
    
    public static final String CAR_NAME = "Sonata";
    
    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }
    
    @Override
    double getDistancePerLiter() {
        return 10;
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
