public class Submarine extends WaterTransportation {
    //////////////////////////
    //      Variables       //
    //////////////////////////
    private int maxDepth;

    //////////////////////////
    //      Constructors    //
    //////////////////////////
    Submarine(int maxDepth, String vesselName, String bodyOfWater, String port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vesselName, bodyOfWater, port, cost,purchaseType,avgSpeed,capacity);
        this.maxDepth = maxDepth;
    }

    ///////////////////////////
    //        Getters        //
    ///////////////////////////
    public int getMaxDepth() {return maxDepth;}


    ////////////////////////////
    //         Setters        //
    ////////////////////////////
    public void setMaxDepth(int maxDepth) {this.maxDepth = maxDepth;}


    /////////////////////////////
    //         Override        //
    /////////////////////////////

    @Override
    public String toString() {

        return String.format("-15s%-15s-20d", super.toString(), "Max Depth: ", this.maxDepth);
    }
}
