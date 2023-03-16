package at.bsu.OO.camera;

public class Pics {
    private String name;
    private double date;
    public enum SIZE{zweiGB, vierGB, sechsGB}

    //Constructor


    public Pics(String name, double date) {
        this.name = name;
        this.date = date;
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
}
