package com.jun_hyeok.fuel_car.domain;

public class K5 extends Car {
    
    public static final String CAR_NAME = "K5";
    
    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }
    
    @Override
    double getDistancePerLiter() {
        return 13;
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
