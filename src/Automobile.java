public class Automobile extends LandTransportation{
    private String transmissionType;
    private int numberOfDoors;
    private String bodyStyle;

    /**
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     */
    public Automobile(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType, String motorType,
                      int numberOfWheels) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
    }


    /**
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     * @param transmissionType - Type of transmission type for automobile (manual or automatic)
     * @param numberOfDoors - Number of doors for the automobile
     * @param bodyStyle - Style of body for the automobile
     */
    public Automobile(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType, String motorType,
                      int numberOfWheels, String transmissionType, int numberOfDoors, String bodyStyle) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
        this.transmissionType = transmissionType;
        this.numberOfDoors = numberOfDoors;
        this.bodyStyle = bodyStyle;
    }

    /**
     * Getter for transmission type of Automobile objects
     * @return String value representing the transmission type for Automobile objects
     */
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * Setter for transmission type of Automobile objects
     * @param transmissionType - String value representing the transmission type for Automobile objects
     */
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
    /**
     * Getter for number of doors of calling Automobile object
     * @return Int value representing the number of doors for a calling Automobile object
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Setter for  number of doors of calling Automobile object
     * @param numberOfDoors- Int value representing the number of doors for a calling Automobile object
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    /**
     * Getter for body style of calling Automobile object
     * @return String value representing the body style for a calling Automobile object
     */
    public String getBodyStyle() {
        return bodyStyle;
    }

    /**
     * Setter for body style of calling Automobile object
     * @param bodyStyle- String value representing the body style for a calling Automobile object
     */
    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20d%n%-15s%-20s%n",
                super.toString(),
                "Transmission Type: ", getTransmissionType(),
                "Number Of Doors: ", getNumberOfDoors(),
                "Body Style: ", getBodyStyle());
    }
}
