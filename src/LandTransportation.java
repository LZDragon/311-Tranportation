public class LandTransportation extends Transportation{

    private String fuelType;
    private String motorType;
    private int numberOfWheels;


    /**
     * @param cost - Cost of the LandTransportation
     * @param purchaseType - Method of Purchase for the LandTransportation
     * @param avgSpeed - Average speed of the LandTransportation
     * @param capacity - Maximum number of passengers
     * @param fuelType - Type of fuel
     * @param motorType - Type of Motor
     * @param numberOfWheels - Number of Wheels
     */
    public LandTransportation(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType, String motorType, int numberOfWheels) {
        super(cost, purchaseType, avgSpeed, capacity);
        this.fuelType = fuelType;
        this.motorType = motorType;
        this.numberOfWheels = numberOfWheels;
    }


    /**
     * Getter for fule type of LandTransportation objects
     * @return value String representing the fuel type of the LandTransportation object.
     */
    public String getFuelType() {
        return this.fuelType;
    }

    /**
     * Setter for the type of fuel of LandTransportation objects
     * @param fuelType - String variable which represents the type of fuel of the LandTransportation object
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Getter for motor type of LandTransportation objects
     * @return String value representing the motor type of the LandTransportation object.
     */
    public String getMotorType() {
        return this.motorType;
    }

    /**
     * Setter for the type of motor of LandTransportation objects
     * @param motorType - String variable which represents the type of Motor of the LandTransportation object
     */
    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    /**
     * Getter for number Of wheels of a LandTransportation object
     * @return Integer value representing the fuel type of the LandTransportation object.
     */
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    /**
     * Setter for the number of Wheels of LandTransportation objects
     * @param numberOfWheels - Int variable which represents the number of wheels of a LandTransportation object
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * Overridden toSting method which displays a LandTransportation object in a Table Format
     * @return String formatted representation of the LandTransportation object
     */
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20s%n%-15s%-20d%n",
                super.toString(),
                "Fuel Type: ", getFuelType(),
                "Motor Type: ", getMotorType(),
                "Number of Wheels:", getNumberOfWheels());
    }
}
