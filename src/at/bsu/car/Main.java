package at.bsu.car;

public class Main
{
    public static void main(String[] args)
    {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(100, 50);
        Car c1 = new Car(e1,"Mercedes", "white");
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);
        c1.addMirror(r1);
        c1.addMirror(r2);

        Tire ti1 = new Tire(40, "pink");
        Tire ti2 = new Tire(40, "pink");
        Tire ti3 = new Tire(40, "black");
        Tire ti4 = new Tire(40, "black");

        System.out.println(c1.getMirrors().get(0).getPosition());


        Truck tr1 = new Truck(e1, "Mercedes", "white", "Trailer1");
        System.out.println(tr1.getColor() + tr1.getTrailer());


        /*

        int a = 7;

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A123");
        c1.setFuelVolume(50);
        c1.setTank(40);
        c1.setColor("green");
        c1.setHorsePower(200);

        Car c2 = new Car();
        c2.setBrand("Mercedes");
        c2.setFuelConsumption(4);
        c2.setSerialNumber("M123");
        c2.setFuelVolume(60);
        c2.setTank(20);
        c2.setColor("white");
        c2.setHorsePower(100);

        System.out.println(c1.getBrand());
        System.out.println(c2.getColor());

         */




    }
}
