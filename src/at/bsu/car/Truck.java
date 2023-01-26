package at.bsu.car;

public class Truck extends Car{
    private String trailer;

    public Truck(Engine engine, String brand, String color, String trailer) {
        super(engine, brand, color);
        this.trailer = trailer;
    }



    //getter setter


    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}