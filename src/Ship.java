public class Ship extends WaterTransportation{
    //////////////////////////
    //      Variables       //
    //////////////////////////
    private int numAnchors;
    private int numWinches;
    //////////////////////////
    //      Constructors    //
    //////////////////////////
    Ship(String vesselName, String bodyOfWater, String port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vesselName, bodyOfWater, port, cost,purchaseType,avgSpeed,capacity);
        this.numWinches=0;
        this.numAnchors=0;
    }
    Ship(int numAnchors, int numWinches,String vesselName, String bodyOfWater, String port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vesselName, bodyOfWater, port, cost,purchaseType,avgSpeed,capacity);
        this.numAnchors=numAnchors;
        this.numWinches=numWinches;
    }

    ///////////////////////////
    //        Getters        //
    ///////////////////////////
    public int getNumAnchors() {return numAnchors;}
    public int getNumWinches() {return numWinches;}


    ////////////////////////////
    //         Setters        //
    ////////////////////////////
    public void setNumAnchors(int numAnchors) {this.numAnchors = numAnchors;}
    public void setNumWinches(int numWinches) {this.numWinches = numWinches;}

    /////////////////////////////
    //         Override        //
    /////////////////////////////

    @Override
    public String toString() {
        return String.format("-15s%-15s%-20d%n%-15s%-20d%n",
                super.toString(),
                "Number of Anchors: ", this.numAnchors,
                "Number of Winches", this.numWinches);
    }
}
