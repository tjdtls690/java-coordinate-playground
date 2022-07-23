public interface Car {
    String NEWLINE = System.getProperty("line.separator");
    
    double getDistancePerLiter();
    
    int getTripDistance();
    
    String getName();
    
    default double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
