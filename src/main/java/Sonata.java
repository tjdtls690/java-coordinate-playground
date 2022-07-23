public class Sonata implements Car {
    public static final String CAR_NAME = "Sonata";
    private final int tripDistance;
    
    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }
    
    @Override
    public double getDistancePerLiter() {
        return 10;
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
