public class Transportation {
    //////////////////////////
    //      Variables       //
    //////////////////////////
    private double cost;
    private String purchaseType;
    private int avgSpeed;
    private String speedUnits;
    private int capacity;
    private String location;
    //////////////////////////
    //      Constructors    //
    //////////////////////////
    Transportation(){
        this.cost = -1.0;
        this.purchaseType = "";
        this.avgSpeed = -1;
        this.capacity = -1;
    }
    Transportation(double cost, String purchaseType, int avgSpeed, int capacity){
        this.cost = cost;
        this.purchaseType = purchaseType;
        this.avgSpeed = avgSpeed;
        this.capacity =capacity;
    }
    ///////////////////////////
    //        Getters        //
    ///////////////////////////
    public double getCost() {return this.cost;}
    public String getPurchaseType(){return this.purchaseType;}
    public int getAvgSpeed() {return this.avgSpeed;}
    public String getSpeedUnits() {return speedUnits;}
    public int getCapacity() {return this.capacity;}
    public String getLocation() {return location;}

    ////////////////////////////
    //         Setters        //
    ////////////////////////////
    public void setCost(double cost) {this.cost = cost;}
    public void setPurchaseType(String purchaseType) {this.purchaseType = purchaseType;}
    public void setAvgSpeed(int avgSpeed) {this.avgSpeed = avgSpeed;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public void setLocation(String location) {this.location = location;}

    @Override
    public String toString() {
        return String.format("%n%-15s%-20.2f%n%-15s%-20s%n%-15s%-20d%n%-15s%-20d%n",
                "Cost",this.cost,
                "Transaction type",this.purchaseType,
                "Average Speed",this.avgSpeed,
                "Capacity",this.capacity);
    }
}
