class Car extends Vehicle{
    private String brand;
    private int warrantyYears;
    //private int purchaseQUantity;

    Car(){}

    public Car(int vehicleId, String vehicleType, double price, int availableUnits, String brand, int warrantyYears){
        super(vehicleId, vehicleType, price, availableUnits);
        this.brand = brand;
        this.warrantyYears = warrantyYears;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setWarranty(int years){
        this.warrantyYears = years;
    }

    public String getBrand(){
        return brand;
    }

    public int getWarrantyYears(){
        return warrantyYears;
    }

    public void totalPrice(int purchaseQUantity){
        double total = getPrice() * purchaseQUantity;
        System.out.println("Total price for " + purchaseQUantity + " Units = $" + total);
    }

    public void totalPriceWithDiscount(int purchaseQUantity){
        double total = getPrice() * purchaseQUantity;

        if(purchaseQUantity >= 3){
            total *= 0.8;
        }
        System.out.println("Total Price With Discount is: $"+total);
    }

    public void diplayCar(){
        diplayVehicle();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Years: " + warrantyYears);
    }
    
}