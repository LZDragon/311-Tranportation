public class AirTransportation extends Transportation {
    //variables
    private String flightMethod;
    private int maxHeight;
    private int maxDistance;

    //constructor
    AirTransportation(String flightMethod, int maxHeight, int maxDistance, double cost, String purchaseType,
                      int avgSpeed, int capacity) {
        super(cost, purchaseType, avgSpeed, capacity);
        this.flightMethod = flightMethod;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    AirTransportation(double cost, String purchaseType, int avgSpeed, int capacity) {
        super(cost, purchaseType, avgSpeed, capacity);
    }
    //getters

    public String getFlightMethod() {
        return this.flightMethod;
    }
    public int getMaxHeight() { return this.maxHeight; }
    public int getMaxDistance() { return this.maxDistance; }

    //setters

    public void setFlightMethod(String flightMethod) {
        this.flightMethod = flightMethod;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    //Override String method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20d%n%-15s%-20d%n", super.toString(), "Method of Flight: ",
                this.flightMethod, "Max Height: ", this.maxHeight, "Max Distance: ", this.maxDistance);
    }
}
