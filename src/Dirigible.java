public class Dirigible extends AirTransportation{
    //variables
    private String dirigibleType;

    //constructor
    Dirigible(String dirigibleType, String flightMethod, int maxHeight, double cost, String purchaseType, int avgSpeed, int capacity) {
        super(flightMethod, maxHeight, cost, purchaseType, avgSpeed, capacity);
        this.dirigibleType = dirigibleType;
    }

    //getters
    public String getDirigibleType() {
        return this.dirigibleType;
    }

    //setters
    public void setDirigibleType(String dirigibleType) {
        this.dirigibleType = dirigibleType;
    }

    //Override String method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n", super.toString(), "Dirigible Type: ", this.dirigibleType);
    }
}
