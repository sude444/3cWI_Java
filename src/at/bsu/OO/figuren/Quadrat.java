package at.bsu.OO.figuren;

public class Quadrat extends Kreis
{

    public Quadrat(String name, double siteA)
    {
        super(name, siteA);
    }

    @Override
    public void getArea()
    {
        System.out.println("Area: " + getSiteA()*getSiteA());
    }
}