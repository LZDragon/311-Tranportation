public class HotAirBalloon extends AirTransportation{
    //variables
    private String balloonType;

    //constructor
    HotAirBalloon(String balloonType, String flightMethod, double cost, String purchaseType, int avgSpeed, int capacity) {
        super(flightMethod, cost, purchaseType, avgSpeed, capacity);
        this.balloonType = balloonType;
    }

    //getters
    public String getBalloonType() {
        return this.balloonType;
    }

    //setters
    public void setBalloonType(String balloonType) {
        this.balloonType = balloonType;
    }
    //Override String method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n", super.toString(), "Balloon Type: ", this.balloonType);
    }
}
