package at.bsu.OO.camera;

public class Pics {
    private String name;
    private double date;
    public enum SIZE{zweiGB, vierGB, sechsGB}
    private SIZE size;

    //Constructor
    public Pics(String name, double date, SIZE size) {
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

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }
}
