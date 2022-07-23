public class K5 implements Car {
    public static final String CAR_NAME = "K5";
    private final int tripDistance;
    
    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }
    
    @Override
    public double getDistancePerLiter() {
        return 13;
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
