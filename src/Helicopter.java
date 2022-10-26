public class Helicopter extends AirTransportation {
    //variables
    private String helicopterType;
    private int rotors;

    //constructor
    Helicopter(String helicopterType, int rotors, String flightMethod, int maxHeight, int maxDistance, double cost,
               String purchaseType, int avgSpeed, int capacity) {
        super(flightMethod, maxHeight, maxDistance, cost, purchaseType, avgSpeed, capacity);
        this.helicopterType = helicopterType;
        this.rotors = rotors;
    }

    Helicopter(String flightMethod, int maxHeight, int maxDistance, double cost, String purchaseType, int avgSpeed,
               int capacity) {
        super(flightMethod, maxHeight, maxDistance, cost, purchaseType, avgSpeed, capacity);
    }

    //getters
    public String getHelicopterType() {
        return this.helicopterType;
    }

    public int getRotors() {
        return this.rotors;
    }

    //setters
    public void setHelicopterType(String helicopterType) {
        this.helicopterType = helicopterType;
    }

    public void setRotors(int rotors) {
        this.rotors = rotors;
    }

    //Override String method
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-15d%n", super.toString(), "Helicopter Type : ",
                this.helicopterType, "Rotors: ", this.rotors);
    }
}
