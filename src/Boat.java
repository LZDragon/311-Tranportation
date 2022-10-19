public class Boat extends WaterTransportation{
    private String boatType;
    private boolean fishing;
    Boat(String BoatType,boolean fishing, String vessalName, String bodyOfWater,String Port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vessalName,bodyOfWater, Port, cost,purchaseType,avgSpeed,capacity);
        this.boatType = BoatType;
        this.fishing = fishing;
    }
    Boat(String vessalName, String bodyOfWater,String Port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vessalName,bodyOfWater, Port, cost,purchaseType,avgSpeed,capacity);
        this.boatType = "";
        this.fishing = false;
    }
}
