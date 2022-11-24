package at.bsu.car;

public class Car {
    private float fuelConsumption;
    private String Brand;
    private String serialNumber;
    private String color;
    private int fuelVolume;
    private float tank;


    public void Break()
    {
        System.out.println("Ich Bremse");
    }
    public void turboBoost()
    {
        if(tank >= fuelVolume/10)
        {
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
    public void honk(int amountOfRepetitions)
    {
        for(int i = 0; i < amountOfRepetitions; i++)
        {
            System.out.println("Tuut ");
        }
    }
    public void getRemainingRange() {

        System.out.println((tank / fuelConsumption)*100 + "km left.");
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelVolume(int fuelVolume) {
        if(fuelVolume>100){
            this.fuelVolume = 100;
        }
        else{
            this.fuelVolume = fuelVolume;
        }
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTank(float tank) {
        this.tank = tank;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getTank() {
        return tank;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public String getBrand() {
        return Brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
