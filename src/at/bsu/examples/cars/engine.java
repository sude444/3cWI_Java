package at.bsu.examples.cars;

public class engine {

    public enum TYPE{
        DIESEL,
        PETROL
    }
    private TYPE fuelType;
    private int performance;
    private double fuelConsumption;
    private int drivenKm;


    //Constructor
    public engine(TYPE fuelType, int performance, double fuelConsumption, int drivenKm){
        this.fuelType = fuelType;
        this.performance = performance;
        this.fuelConsumption = fuelConsumption;
        this.drivenKm = drivenKm;
    }



    //Getter and Setter
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

    public int getdrivenKm() {
        return drivenKm;
    }

    public void setdrivenKm(int drivenKm) {
        drivenKm = drivenKm;
    }
}
