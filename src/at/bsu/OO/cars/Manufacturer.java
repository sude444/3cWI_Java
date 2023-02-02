package at.bsu.OO.cars;

public class Manufacturer {
    private String name;
    private String countryOfOrigin;
    private int discount;



    //Constructor

    public Manufacturer(String name, String countryOfOrigin, int discount) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;

    }


    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
