package object.model;

public class Car {

    private String make;
    private String model;
    private String color;
    private String fuelType;
    private double engine;
    private int horsePower;
    private String transmission;
    private String mileage;
    private int yearOfProduction;
    private String price;

    public Car() {
    }

    public Car(String make, String model, String color, String fuelType, double engine, int horsePower,
               String transmission, String mileage, int yearOfProduction, String price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.engine = engine;
        this.horsePower = horsePower;
        this.transmission = transmission;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Make: " + getMake() +"\n"+ "Model: " + getModel() +"\n" + "Color: " + getColor() +"\n" +
                "Fuel Type: " + getFuelType() +"\n" + "Engine Volume: " + getEngine() +"\n" + "Horsepower: "
                + getHorsePower() +"\n" + "Transmission: " + getTransmission() +"\n" + "Mileage: " + getMileage() +"\n"
                + "Year of production: " + getYearOfProduction() +"\n" + "Price: " + getPrice() + "\n");
        System.out.println();
    }
}
