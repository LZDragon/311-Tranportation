public class Ship extends WaterTransportation{
    //////////////////////////
    //      Variables       //
    //////////////////////////

    //////////////////////////
    //      Constructors    //
    //////////////////////////
    Ship(String vesselName, String bodyOfWater, String port, double cost, String purchaseType, int avgSpeed, int capacity){
        super(vesselName, bodyOfWater, port, cost,purchaseType,avgSpeed,capacity);
    }

    ///////////////////////////
    //        Getters        //
    ///////////////////////////

    ////////////////////////////
    //         Setters        //
    ////////////////////////////

    /////////////////////////////
    //         Override        //
    /////////////////////////////

    @Override
    public String toString() {
        return super.toString();
    }
}