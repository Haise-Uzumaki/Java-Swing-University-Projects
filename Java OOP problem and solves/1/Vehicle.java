class Vehicle {
    private int vehicleId;
    private String vehicleType;
    public double price;
    private int availableUnits;

    Vehicle(){}

    public Vehicle(int vehicleId, String vehicleType, double price, int availableUnits) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.price = price;
        this.availableUnits = availableUnits;
    }

    public void setVehicleId(int id){
        this.vehicleId = id;
    }

    public void setVehicleType(String type){
        this.vehicleType = type;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setAvailableUnits(int units){
        this.availableUnits = units;
    }

    public int getVehicleId(){
        return vehicleId;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public double getPrice(){
        return price;
    }

    public int getAvailableUnits(){
        return availableUnits;
    }

    public void diplayVehicle(){
        System.out.println("Vehicle Id: " + vehicleId);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Price: " + price + "$");
        System.out.println("Available Units: " + availableUnits);
    }
}