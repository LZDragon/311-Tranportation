public class Train extends LandTransportation{

    private int departureTime;
    private String passengerTrainDistanceService;
    private String rapidTransitTrainType;

    /**
     * Default constructor for LandTransportation objects
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     */
    public Train(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType,
                 String motorType, int numberOfWheels) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
        this.departureTime = 0;
        this.passengerTrainDistanceService = "";
        this.rapidTransitTrainType = "";
    }

    /**
     * Parameterized and specialized constructor for Train objects
     * @param cost           - Cost of the LandTransportation
     * @param purchaseType   - Method of Purchase for the LandTransportation
     * @param avgSpeed       - Average speed of the LandTransportation
     * @param capacity       - Maximum number of passengers
     * @param fuelType       - Type of fuel
     * @param motorType      - Type of Motor
     * @param numberOfWheels - Number of Wheels
     * @param departureTime  - Time at which is scheduled to depart
     * @param passengerTrainDistanceService - Distance service offered by passenger train (short or long distance)
     * @param rapidTransitTrainType - Type of rapid transit (trams, monorail, light rail, metro)
     */
    public Train(double cost, String purchaseType, int avgSpeed, int capacity, String fuelType, String motorType,
                 int numberOfWheels, int departureTime, String passengerTrainDistanceService, String rapidTransitTrainType) {
        super(cost, purchaseType, avgSpeed, capacity, fuelType, motorType, numberOfWheels);
        this.departureTime = departureTime;
        this.passengerTrainDistanceService = passengerTrainDistanceService;
        this.rapidTransitTrainType = rapidTransitTrainType;
    }

    /**
     * Getter for departure time of Train objects
     * @return Integer value representing the time of departure for Train objects
     */
    public int getDepartureTime() {
        return this.departureTime;
    }

    /**
     * Setter for the departure time of Train objects
     * @param departureTime - Int variable which represents time of departure for Train objects
     */
    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * Getter for departure distance service of the Passenger Train (short or long distance)
     * @return String value representing the distance service
     */
    public String getPassengerTrainDistanceService() {
        return this.passengerTrainDistanceService;
    }

    /**
     * Setter for departure distance service of the Passenger Train (short or long distance)
     * @param passengerTrainDistanceService - String value representing the distance service
     */
    public void setPassengerTrainDistanceService(String passengerTrainDistanceService) {
        this.passengerTrainDistanceService = passengerTrainDistanceService;
    }

    /**
     * Getter for the rapid Transit train type (Tram, Metro, MonoRail, light rail)
     * @return  String value representing the rapid transit train type
     */
    public String getRapidTransitTrainType() {
        return this.rapidTransitTrainType;
    }

    /**
     * Setter for the rapid Transit train type (Tram, Metro, MonoRail, light rail)
     * @param rapidTransitTrainType - String value representing the rapid transit train type
     */
    public void setRapidTransitTrainType(String rapidTransitTrainType) {
        this.rapidTransitTrainType = rapidTransitTrainType;
    }

    /**
     * Overridden toSting method which displays a Train object in a Table Format
     * @return String formatted representation of the Train object
     */
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20d%n%-15s%-20s%n%-15s%-20s%n",
                super.toString(),
                "Departure Time: ", getDepartureTime(),
                "Distance Service: ", getPassengerTrainDistanceService(),
                "Rapid Transit Type", getRapidTransitTrainType());
    }

}
