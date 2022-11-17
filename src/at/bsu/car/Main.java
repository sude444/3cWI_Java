package at.bsu.car;

public class Main
{
    public static void main(String[] args)
    {
        int a = 7;

        Car c1 = new Car();
        c1.Brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";

        Car c2 = new Car();
        c2.Brand = "Mercedes";
        c2.fuelConsumption = 4;
        c2.serialNumber = "M1234";

        System.out.println(c1.serialNumber);
        




    }
}
