public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car(111, "Sports Car", 30000, 5, "Toyota", 5);

        Car car2 = new Car(222, "Sports Car", 30000, 5, "Nissan", 5);

        System.out.println("******Car 1 Details Are Given******");
        car1.diplayCar();
        System.out.println("***********************************");


        System.out.println("******Car 2 Details Are Given******");
        car2.diplayCar();
        System.out.println("***********************************");

        System.out.println("****I am buying 2 units of Car 1****");
        car1.totalPrice(2);
        System.out.println("************************************");

        System.out.println("****I am buying 4 units of Car 2****");
        car2.totalPriceWithDiscount(4);
        System.out.println("************************************");

    }
}
