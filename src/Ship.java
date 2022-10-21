public class Ship extends WaterTransportation{
    //////////////////////////
    //      Variables       //
    //////////////////////////
    private String propulsion;
    private int numAnchors;
    private int numWinches;
    //////////////////////////
    //      Constructors    //
    //////////////////////////
    Ship(String vesselName, String bodyOfWater, String port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vesselName, bodyOfWater, port, cost,purchaseType,avgSpeed,capacity);
    }

    ///////////////////////////
    //        Getters        //
    ///////////////////////////
    public String getPropulsion() {return propulsion;}
    public int getNumAnchors() {return numAnchors;}
    public int getNumWinches() {return numWinches;}


    ////////////////////////////
    //         Setters        //
    ////////////////////////////
    public void setPropulsion(String propulsion) {this.propulsion = propulsion;}
    public void setNumAnchors(int numAnchors) {this.numAnchors = numAnchors;}
    public void setNumWinches(int numWinches) {this.numWinches = numWinches;}

    /////////////////////////////
    //         Override        //
    /////////////////////////////

    @Override
    public String toString() {
        return String.format("-15s%-15s%-20s%n%-15s%-20d%n%-15s%-20d%n",
                super.toString(),
                "Propulsion: ", this.propulsion,
                "Number of Anchors: ", this.numAnchors,
                "Number of Winches", this.numWinches);
    }
}
