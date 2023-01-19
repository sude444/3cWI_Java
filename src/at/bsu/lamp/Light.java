package at.bsu.lamp;

public class Light {
    private String name;
    private int powerConsumption;
    private String color;
    private boolean turnedOn;



public Light(String name, int powerConsumption, String color, boolean turnedOn){
    this.name = name;
    this.powerConsumption = powerConsumption;
    this.color = color;
    this.turnedOn = turnedOn;
}




    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
}





