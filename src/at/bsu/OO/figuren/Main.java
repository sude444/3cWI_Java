package at.bsu.OO.figuren;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int selection;
        boolean stop = false;
        Kreis kreis = new Kreis("k1", 12);
        Viereck viereck = new Viereck("v1", 13, 20);
        Quadrat quadrat = new Quadrat("q1", 12);
        Würfel würfel = new Würfel("w1", 12);

        do{
            System.out.println("Welchen Flaecheninhalt moechten Sie?\n1: Kreis\n2: Viereck\n3: Quadrat\n4: Würfel\n5:stoppen\n------------------------------------");
            selection = scanner.nextInt();

            switch (selection){
                case 1: //Kreis
                    System.out.println("Sie haben den Kreis ausgewählt");
                    break;

                case 2: //Viereck
                    System.out.println(viereck.getName());
                    System.out.println(viereck.getSiteA());
                    System.out.println("\n------------------------------------");
                    break;

                case 3: //Quadrat
                    System.out.println(quadrat.getName());
                    System.out.println(quadrat.getSiteA());
                    System.out.println("\n------------------------------------");
                    break;

                case 4: //Würfel
                    System.out.println(würfel.getName());
                    System.out.println(würfel.getSiteA());
                    System.out.println("\n------------------------------------");
                    break;

                case 5: //Beenden
                    stop = true;
                    break;

                default:
                    System.out.println("Sie muessen eine Zahl von 1 bis 5 eingeben!!!\n------------------------------------");

            }


        } while(stop == false);
        scanner.close();
    }
}
