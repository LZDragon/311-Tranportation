public class Plane extends AirTransportation {
    //variables
    private int wings;
    private int engines;
    private int classes;
    String planeType;
    String airline;

    //constructor
    Plane(int wings, int engines, int classes, String planeType, String airline, double airSpeed, String flightMethod,
          double cost, String purchaseType, int avgSpeed, int capacity) {
        super(airSpeed, flightMethod, cost, purchaseType, avgSpeed, capacity);
        this.wings = wings;
        this.engines = engines;
        this.classes = classes;
        this.planeType = planeType;
        this.airline = airline;
    }

    //getters
    public int getWings() {
        return this.wings;
    }

    public int getEngines() {
        return this.engines;
    }

    public int getClasses() {
        return this.classes;
    }

    public String getPlaneType() {
        return this.planeType;
    }

    public String getAirline() {
        return this.airline;
    }

    //setters
    public void setWings(int wings) {
        this.wings = wings;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    //Override string method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20d%n%-15s%-20d%n%-15s%-20d%n%-15s%-20s%n%-15s%-20s%n",super.toString(),
                "Wings: ", this.wings, "Engines: ", this.engines, "Classes: ", this.classes, "Plane Type: ", this.planeType,
                "Airline: ", this.airline);
    }
}
