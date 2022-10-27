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

    //////////////////////////////
    //          Getters         //
    //////////////////////////////
    public String getBoatType() {return boatType;}
    public boolean isFishing() {return fishing;}
    //////////////////////////////
    //          Setters         //
    //////////////////////////////
    public void setBoatType(String boatType) {this.boatType = boatType;}
    public void setFishing(boolean fishing) {this.fishing = fishing;}

    @Override
    public String toString() {
        return String.format("-15s%-15s%-20s%n%-15s%-20b",super.toString(),"Boat Type: ", this.boatType, "Fishing: ", this.isFishing());
    }
}
