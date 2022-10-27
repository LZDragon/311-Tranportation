public class Bus extends LandTransportation{
    private String busType;
    private String  busUse;
    /**
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     */
    public Bus(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType, String motorType,
               int numberOfWheels) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
        this.busType = "";
        this.busUse = "";

    }

    /**
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     * @param busType        - Type of Bus (Single-Decker, Double-Decker, Coach, or Bendy-Bus)
     * @param busUse         - Usage of Bus(Public, Tourism, Student, or Private Charter)
     */
    public Bus(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType, String motorType,
               int numberOfWheels, String busType, String busUse) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
        this.busType = busType;
        this.busUse = busUse;
    }


    /**
     * Getter for bus type of Bus objects
     * @return String value representing the type of Bus for a Bus object
     */
    public String getBusType() {
        return this.busType;
    }

    /**
     * Setter for Bus type of Bus objects
     * @param busType - String value representing the type of Bus for a Bus object
     */
    public void setBusType(String busType) {
        this.busType = busType;
    }

    /**
     * Getter for bus use of a Bus object
     * @return String value representing the usage of Bus for a bus object
     */
    public String getBusUse() {
        return this.busUse;
    }

    /**
     * Setter for bus Use of Bus objects
     * @param busUse - String value representing the usage of Bus for a bus object
     */
    public void setBusUse(String busUse) {
        this.busUse = busUse;
    }

    /**
     * Overridden toSting method which displays a Bus object in a Table Format
     * @return String formatted representation of the Bus object
     */
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20s%n",
                super.toString(),
                "Bus Type: ", getBusType(),
                "Bus Use: ", getBusUse());

    }

}
