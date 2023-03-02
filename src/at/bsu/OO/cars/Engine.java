package at.bsu.OO.cars;

public class Engine {

    public enum FUELTYPE{
        DIESEL,
        PETROL
    }
    private FUELTYPE fuelType;
    private int performance;
    private double fuelConsumption;
    private int drivenKm;


    //Constructor
    public Engine(FUELTYPE fuelType, int performance, double fuelConsumption, int drivenKm){
        this.fuelType = fuelType;
        this.performance = performance;
        this.fuelConsumption = fuelConsumption;
        this.drivenKm = drivenKm;
    }



    //Getter und Setter
    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public FUELTYPE getFuelType() {
        return fuelType;
    }

    public void setFuelType(FUELTYPE fuelType) {
        this.fuelType = fuelType;
    }

    public int getDrivenKm() {
        return drivenKm;
    }

    public void setDrivenKm(int drivenKm) {
        this.drivenKm = drivenKm;
    }
}
