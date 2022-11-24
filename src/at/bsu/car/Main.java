package at.bsu.car;

public class Main
{
    public static void main(String[] args)
    {
        int a = 7;

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A123");
        c1.setFuelVolume(50);
        c1.setTank(40);
        c1.setColor("green");

        Car c2 = new Car();
        c2.setBrand("Mercedes");
        c2.setFuelConsumption(4);
        c2.setSerialNumber("M123");
        c2.setFuelVolume(60);
        c2.setTank(20);
        c2.setColor("white");

        System.out.println(c1.getBrand());
        System.out.println(c2.getColor());














    }
}
