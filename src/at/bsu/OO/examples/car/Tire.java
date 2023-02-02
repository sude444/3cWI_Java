package at.bsu.OO.examples.car;

public class Tire {
    private float size;
    private String color;

    public Tire(float size, String color){
        this.size = size;
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
