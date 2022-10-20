public class WaterTransportation extends Transportation{
    //////////////////////////
    //      Variables       //
    //////////////////////////
    private String vesselName;
    private String bodyOfWater;
    private String Port;

    //////////////////////////
    //      Constructors    //
    //////////////////////////
    WaterTransportation(String vesselName, String BodyOfWater, String port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(cost,purchaseType,avgSpeed,capacity);
        this.vesselName = vesselName;
        this.bodyOfWater = BodyOfWater;
        this.Port = port;
    }

    ///////////////////////////
    //        Getters        //
    ///////////////////////////
    public String getVesselName() {return vesselName;}
    public String getBodyOfWater() {return bodyOfWater;}
    public String getPort() {return Port;}

    ////////////////////////////
    //         Setters        //
    ////////////////////////////
    public void setBodyOfWater(String bodyOfWater) {this.bodyOfWater = bodyOfWater;}
    public void setVesselName(String vesselName) {this.vesselName = vesselName;}
    public void setPort(String port) {this.Port = port;}

    /////////////////////////////
    //         Override        //
    /////////////////////////////
    @Override
    public String toString() {
        return String.format("%n%-15s%n%-15s%-20s%n%-15s%-20s%n%-15s%-20s%n",
            super.toString(),
            "Vessel Name: ", this.vesselName,
            "Travels by: ", this.bodyOfWater,
            "Located at Port: ", this.Port);
    }
}
