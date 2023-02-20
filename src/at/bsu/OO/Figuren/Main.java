package at.bsu.OO.Figuren;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Kreis kreis = new Kreis();
        Viereck viereck = new Viereck();
        Quadrat quadrat = new Quadrat();
        Würfel würfel = new Würfel();
        int selection;
        boolean stop = false;

        do{
            System.out.println("Welchen Flaecheninhalt moechten Sie?\n1: Kreis\n2: Viereck\n3: Quadrat\n4: Würfel\n5:stoppen\n------------------------------------");
            selection = scanner.nextInt();

            switch (selection){
                case 1: //Kreis
                    break;

                case 2: //Viereck
                    break;

                case 3: //Quadrat
                    break;

                case 4: //Würfel
                    break;

                case 5: //Beenden
                    stop = true;
                    break;

                default:
                    System.out.println("Sie muessen eine Zahl von 1 bis 5 eingeben!!!");

            }


        } while(stop == false);
        scanner.close();
    }
}
