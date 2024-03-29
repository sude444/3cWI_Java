package at.bsu.OO.rechner;

import java.util.Scanner;


public class Rechner{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int selection;
        double a;
        double b;
        double result;
        boolean stop = false;
        Wurzelrechner wurzelrechner = new Wurzelrechner();
        WissenschaftlicherRechner wissenschaftlicherRechner = new WissenschaftlicherRechner();

        do{
            System.out.println("Was möchten sie tun? \n--------------------\n1: Addieren\n2: subtrahieren\n3: Dividieren\n4: Multiplizieren\n5: Wurzelziehen\n6: sinus\n7: cosinus\n8: stop");
            selection = scanner.nextInt();


            switch (selection){
                case 1: //Addieren
                    System.out.println("Geben sie zwei Zahlen ein.");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a + b;
                    System.out.println("Die Summe der Zahlen "+ a + " und "+ b+ " ergbit " + result+"\n--------------------");
                    break;

                case 2: //Subtrahieren
                    System.out.println("Geben sie zwei Zahlen ein.");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a - b;
                    System.out.println("Die Differenz der Zahlen "+ a + " und "+ b+ " ergbit " + result+"\n--------------------");
                    break;

                case 3: //Division
                    System.out.println("Geben sie zwei Zahlen ein.");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a / b;
                    System.out.println("Der Quotienten der Zahlen "+ a + " und "+ b+ " ergbit " + result+"\n--------------------");
                    break;

                case 4: //Multiplikation
                    System.out.println("Geben sie zwei Zahlen ein.");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a * b;
                    System.out.println("Das Produkt der Zahlen "+ a + " und "+ b+ " ergbit " + result +"\n--------------------");
                    break;

                case 5: //Wurzelrechner
                    System.out.println("Geben sie Ihre Zahlen ein.");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    wurzelrechner.Wurzelziehen(a, b);
                    break;

                case 6: //Wurzelrechner
                    System.out.println("Geben sie Ihre Zahl ein.");
                    a = scanner.nextDouble();
                    wissenschaftlicherRechner.sinus(a);
                    break;

                case 7: //Wurzelrechner
                    System.out.println("Geben sie Ihre Zahl ein.");
                    a = scanner.nextDouble();
                    wissenschaftlicherRechner.cosinus(a);
                    break;

                case 8: //Beenden
                    stop = true;
                    break;

                default:
                System.out.println("Sie muessen eine Zahl von 1 bis 5 eingeben!!!");


            }

        }
        while(stop == false);

        scanner.close();
    }
}
//



