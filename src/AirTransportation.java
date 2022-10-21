public class AirTransportation extends Transportation {
    //variables
    private String flightMethod;

    //constructor
    AirTransportation(double airSpeed, String flightMethod, double cost, String purchaseType, int avgSpeed, int capacity) {
        super(cost, purchaseType, avgSpeed, capacity);
        this.flightMethod = flightMethod;
    }
    //getters

    public String getFlightMethod() {
        return this.flightMethod;
    }

    //setters

    public void setFlightMethod(String flightMethod) {
        this.flightMethod = flightMethod;
    }

    //Override String method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n", super.toString(), "Method of Flight: ", this.flightMethod);
    }
}
