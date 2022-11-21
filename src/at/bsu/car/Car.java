package at.bsu.car;

public class Car {
    float fuelConsumption;
    public String Brand;
    public String serialNumber;
    private String color;
    int fuelVolume;
    float tank;


    public void Break()
    {
        System.out.println("Ich Bremse");
    }
    public void turboBoost()
    {
        if(tank >= fuelVolume/10)
        {
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
    public void honk(int amountOfRepetitions)
    {
        for(int i = 0; i < amountOfRepetitions; i++)
        {
            System.out.println("Tuut ");
        }
    }
    public void getRemainingRange()
    {
        System.out.println(tank / fuelConsumption);
    }
}
