public class Avante implements Car {
    public static final String CAR_NAME = "Avante";
    private final int tripDistance;
    
    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }
    
    @Override
    public double getDistancePerLiter() {
        return 15;
    }
    
    @Override
    public int getTripDistance() {
        return this.tripDistance;
    }
    
    @Override
    public String getName() {
        return CAR_NAME;
    }
}
