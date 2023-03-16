package at.bsu.OO.camera;

public class CamManufacturer {

    private String name;
    private String country;


    //Constructor
    public CamManufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }


    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
