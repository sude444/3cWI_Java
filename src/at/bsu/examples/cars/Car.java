package at.bsu.examples.cars;

public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private Manufacturer manufacturer;
    private Engine engine;


    //Constructor
    public Car(String color, int maxSpeed, int basePrice, Manufacturer manufacturer, Engine engine)
    {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.manufacturer = manufacturer;
        this.engine = engine;

    }


    public void driveCar(int km)
    {
        this.engine.setDrivenKm(this.engine.getDrivenKm()+km);
        if(this.engine.getDrivenKm() >= 50000) {
            System.out.println("Der Benzinverbrauch entspricht dem Basisverbrauch.");
            this.engine.setFuelConsumption(this.engine.getFuelConsumption() + this.engine.getFuelConsumption() * 0.098);
        }
    }



    //Getter und Setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
