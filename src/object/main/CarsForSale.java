package object.main;
import object.model.Car;

public class CarsForSale {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Mercedes Benz");
        car.setModel("S 550");
        car.setColor("Black");
        car.setFuelType("Gasoline");
        car.setEngine(4.7);
        car.setHorsePower(449);
        car.setTransmission("Automatic");
        car.setMileage("30,000 km");
        car.setYearOfProduction(2017);
        car.setPrice("55,000 $");
        car.printInfo();
        System.out.println("Next car" + "\n");
        Car car1 = new Car("BMW", "730", "Black", "Diesel", 4.4, 249,
                "Automatic", "4000 km", 2021, "90,000 $");
        car1.printInfo();
    }
}
