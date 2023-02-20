package at.bsu.OO.Rechner;

public class WissenschaftlicherRechner extends Rechner{
    public void sinus(double degrees)
    {
        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double sinValue = Math.sin(radians);

        // prints the sine value
        System.out.println("Der Sinus Ihrer Zahl beträgt: sin(" + degrees + ") = " + sinValue+"\n--------------------");
    }
    public void cosinus(double degrees)
    {
        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin() method to get the sine value
        double cosValue = Math.cos(radians);

        // prints the sine value
        System.out.println("Der Cosinus Ihrer Zahl beträgt: cos(" + degrees + ") = " + cosValue+"\n--------------------");
    }
}
