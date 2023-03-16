package at.bsu.OO.camera;

public class Pics {
    private String name;
    private double date;
    private int size;

    
    //Constructor
    public Pics(String name, double date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }


    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
