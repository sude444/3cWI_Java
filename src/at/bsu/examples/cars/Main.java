package at.bsu.examples.cars;

public class Main {
    private float price;
    Manufacturer Mercedes = new Manufacturer("Mercedes","Germany", 6);
    Engine V8 = new Engine(Engine.FUELTYPE.DIESEL, 200, 4, 444000);
    Car c1 = new Car("pink", 192,270000, Mercedes, V8);

    //price = c1.getBasePrice() - c1.getBasePrice()/ Mercedes.getDiscount();

    //System.out.println("Der neue Preis mit Rabatt beträgt: " + price);



}
