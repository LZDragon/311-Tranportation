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
    WaterTransportation(String vesselName, String BodyOfWater, String Port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(cost,purchaseType,avgSpeed,capacity);
        this.vesselName = vesselName;
        this.bodyOfWater = BodyOfWater;
        this.Port = Port;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
