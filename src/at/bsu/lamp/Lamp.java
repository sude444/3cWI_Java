package at.bsu.lamp;
import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Light> lights;
    private int powerUsed;

    public Lamp() {
        this.lights = new ArrayList<>();
    }

    public void addLight(Light light) {
        this.lights.add(light);
    }

    public void turnOn(){
        if(light.isTurnedOn() == true){
            System.out.println("Mein Name ist " + light.getName() +". Ich bin bereits eingeschaltet.");
        }

    }



    //Getter und Setter
    public List<Light> getLights() {
        return lights;
    }

    public void setLights(List<Light> lights) {
        this.lights = lights;
    }

    public int getPowerUsed() {
        return powerUsed;
    }

    public void setPowerUsed(int powerUsed) {
        this.powerUsed = powerUsed;
    }
}
