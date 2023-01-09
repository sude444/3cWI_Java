package at.bsu.examples.cars;

import at.bsu.car.Engine;

public class car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private Manufacturer manufacturer;
    private Engine engine;


    //Constructor
    public car(String color, int maxSpeed, int basePrice,
               Manufacturer manufacturer, Engine engine)
    {
        this.color = color;
        MaxSpeed = maxSpeed;
        BasePrice = basePrice;
        this.Manufacturer = manufacturer;
        this.Engine = engine;

    }


    public void driveCar(int km)
    {
        this.engine.setdrivenKm(this.engine.getdrivenKm()+km);
        if(this.engine.drivenKm() >= 50000) {
            System.out.println("Der Benzinverbrauch entspricht dem Basisverbrauch.");
        }
        else{
            this.engine.setdrivenKm(this.engine.getdrivenKm() + this.engine.getdrivenKm()*9.8);
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
