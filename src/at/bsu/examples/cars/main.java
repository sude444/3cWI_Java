package at.bsu.examples.cars;

public class main {

    manufacturer Mercedes = new manufacturer("Mercedes","Germany", 6);
    engine V8 = new engine(engine.TYPE.DIESEL, 200, 4, 444000);
    car c1 = new car("pink", 192,270000, Mercedes, V8);
    float price = c1.getBasePrice() - c1.getBasePrice()/ Mercedes.getDiscount();
        System.out.println("Der neue Preis mit Rabatt beträgt: " + price);



}
