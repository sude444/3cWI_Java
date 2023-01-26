package at.bsu.car;
import java.util.ArrayList;
import java.util.List;

public class Car {

    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private float fuelConsumption;
    private String Brand;
    private String serialNumber;
    private String color;
    private int fuelVolume;
    //private float tank;
    private int honkCounter;
    private int horsePower;
    private Tank tank;


    public Car(Engine engine, String brand, String color){
        this.engine = engine;
        this.Brand = brand;
        this.color = color;
        this.honkCounter = 0;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror){
       this.mirrors.add(rearMirror);
    }

    public void stop(){
        System.out.println("I am stopping!");
    }

    public void addTires(Tire tires) {
        this.tires.add(tires);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void honk(){
        System.out.println("Ich bin ein " + this.Brand + " und habe " + this.horsePower + "ps");
    }

    public void drive(int speed)
    {
        this.tank.setFuel(this.tank.getFuel() - (this.engine.getFuelConsumption()/100)*speed);
        System.out.println("Driving" + this.tank.getFuel());
    }

    public void Break()
    {
        System.out.println("Ich Bremse");
    }

    public void honk(int amountOfRepetitions)
    {
        for(int i = 0; i < amountOfRepetitions; i++)
        {
            System.out.println("Tuut ");
        }
    }
    /*
    public void getRemainingRange(float remainingRange) {

        System.out.println((tank / fuelConsumption)*100 + "km left.");
    }

     */

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
    /*

    public void setTank(float tank) {
        this.tank = tank;
    }

     */

    public void setHonkCounter(int honkCounter){
        this.honkCounter = honkCounter;
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }
    /*

    public float getTank() {
        return tank;
    }

     */

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

    public float getHonkCounter(){
        return honkCounter;
    }

    public Engine getEngine(){
        return engine;
    }
    public float getHorsePower(){
        return horsePower;
    }

}
