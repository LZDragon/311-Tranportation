public class Bike extends LandTransportation{
    private String frameMaterial;
    private String bikeType;
    private String pickupLocation;

    /**
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     */
    public Bike(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType,
                String motorType, int numberOfWheels) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
        this.frameMaterial = "";
        this.bikeType = "";
        this.pickupLocation = "";
    }

    /**
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     * @param frameMaterial  - Material of the bike frame
     * @param bikeType       - Type of Bike (city bike, mountain bike, racing bike,
     * @param pickupLocation - Where the bike rental is to be picked up
     */
    public Bike(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType, String motorType,
                int numberOfWheels, String frameMaterial, String bikeType, String pickupLocation) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
        this.frameMaterial = frameMaterial;
        this.bikeType = bikeType;
        this.pickupLocation = pickupLocation;
    }

    /**
     * Getter for frame material of a bike object
     * @return String value representing frame material of a bike object
     */
    public String getFrameMaterial() {
        return frameMaterial;
    }

    /**
     * Setter for frame material of a bike object
     * @param frameMaterial - String value representing frame material of a bike object
     */
    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    /**
     * Getter for the bike type of a bike object
     * @return String value representing type of bike of a bike object
     */
    public String getBikeType() {
        return this.bikeType;
    }

    /**
     * Setter for the bike type of a bike object
     * @param bikeType - String value representing type of bike of a bike object
     */
    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    /**
     * Setter for rental pickup location of a bike object
     * @return String value representing bike pickup location
     */
    public String getPickupLocation() {
        return this.pickupLocation;
    }

    /**
     * Getter for rental pickup location of a bike object
     * @param pickupLocation String value representing pick up location a bike object
     */
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    /**
     * Overridden toSting method which displays a Bike object in a Table Format
     * @return String formatted representation of the Bike object
     */
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20s%n%-15s%-20s%n",
                super.toString(),
                "Frame Material: ",getFrameMaterial(),
                "Bike Type: ", getBikeType(),
                "Pick Up Location", getPickupLocation());

    }


}
