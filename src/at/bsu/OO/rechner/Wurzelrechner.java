package at.bsu.OO.rechner;

public class Wurzelrechner extends Rechner {
    public void Wurzelziehen(double number,double wurzel)
        {
            wurzel = 1/wurzel;
            System.out.println("Die Wurzel ihrer Zahlen ergibt: " + Math. pow(number,wurzel)+"\n--------------------");
        }


}
