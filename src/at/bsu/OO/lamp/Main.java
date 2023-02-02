package at.bsu.OO.lamp;

public class Main {
    public static void main(String[] args){
        Light l1 = new Light("Licht 1", 23, "Pink", true);
        Light l2 = new Light("Licht 2", 20, "White", false);
        Light l3 = new Light("Licht 3", 50, "Red", true);
        Light l4 = new Light("Licht 3", 10, "Green", true);
        Lamp lamp1 = new Lamp();
        lamp1.addLight(l1);
        lamp1.addLight(l2);
        lamp1.addLight(l3);

        lamp1.turnOn(l1);
        lamp1.turnOn(l2);
        lamp1.turnAllOn();
        System.out.println(lamp1.getOverallPowerUsage());
        lamp1.printNamesOfLights();

    }
}
