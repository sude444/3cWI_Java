package at.bsu.OO.Rechner;

import java.util.Scanner;


public class Rechner{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int selection;
        double a;
        double b;
        double result;
        boolean stop = false;

        do{
            System.out.println("Was möchten sie tun? \n--------------------\n1: Addieren\n2: subtrahieren\n3: dividieren\n4: multiplizieren");
            selection = scanner.nextInt();

            switch (selection){
                case 1: //Addieren
                    System.out.println("Geben sie zwei Zahlen ein.");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a + b;
                    System.out.println("Die Summe der Zahlen "+ a + " und "+ b+ " ergbit " + result);
                    break;

                case 2: //    

            }

        }
        while(stop = false);
    }
}



