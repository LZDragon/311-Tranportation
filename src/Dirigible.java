public class Dirigible extends AirTransportation {
    //variables
    private String dirigibleType;
    private String gasType;

    //constructor
    Dirigible(String dirigibleType, String gasType, String flightMethod, int maxHeight, int maxDistance, double cost,
              String purchaseType, int avgSpeed, int capacity) {
        super(flightMethod, maxHeight, maxDistance, cost, purchaseType, avgSpeed, capacity);
        this.dirigibleType = dirigibleType;
        this.gasType = gasType;
    }

    Dirigible(String flightMethod, int maxHeight, int maxDistance, double cost, String purchaseType, int avgSpeed, int capacity) {
        super(flightMethod, maxHeight, maxDistance, cost, purchaseType, avgSpeed, capacity);
    }

    //getters
    public String getDirigibleType() {
        return this.dirigibleType;
    }

    public String getGasType() {
        return this.gasType;
    }

    //setters
    public void setDirigibleType(String dirigibleType) {
        this.dirigibleType = dirigibleType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    //Override String method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20s%n", super.toString(), "Dirigible Type: ",
                this.dirigibleType, "Gas Type: ", this.gasType);
    }
}
