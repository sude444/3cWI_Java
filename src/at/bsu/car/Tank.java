package at.bsu.car;

public class Tank {
    private float maxFuel;
    private float fuel;
    public Tank(float maxFuel, float fuel){
        this.maxFuel = maxFuel;
        this.fuel = fuel;
    }

    public float getMaxFuel(){
        return maxFuel;
    }

    public float getFuel() {
        return fuel;
    }

    public void setMaxFuel(float maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
}
