public class AirTransportation extends Transportation {
    //variables
    private String flightMethod;
    private int maxHeight;
    private int maxDistance;
    private String departure;
    //constructor
    AirTransportation(String flightMethod, int maxHeight, int maxDistance, String departure, double cost, String purchaseType,
                      int avgSpeed, int capacity) {
        super(cost, purchaseType, avgSpeed, capacity);
        this.flightMethod = flightMethod;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
        this.departure = departure;
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

    public String getDeparture() { return this.departure; }

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

    public void setDeparture(String departure) { this.departure = departure; }

    //Override String method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20d%n%-15s%-20d%n%-15%-20s%n", super.toString(), "Method of Flight: ",
                this.flightMethod, "Max Height: ", this.maxHeight, "Max Distance: ", this.maxDistance, "Departure Time: ", this.departure);
    }
}
