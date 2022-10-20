public class Boat extends WaterTransportation{
    private String boatType;
    private boolean fishing;
    Boat(String BoatType,boolean fishing, String vesselName, String bodyOfWater,String port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vesselName,bodyOfWater, port, cost,purchaseType,avgSpeed,capacity);
        this.boatType = BoatType;
        this.fishing = fishing;
    }
    Boat(String vesselName, String bodyOfWater,String Port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vesselName,bodyOfWater, Port, cost,purchaseType,avgSpeed,capacity);
        this.boatType = "";
        this.fishing = false;
    }
}
