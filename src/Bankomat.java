import java.util.Scanner;

public class Bankomat
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int selection;
        float deposit;
        float withdraw;
        float balance = 0;
        boolean stop = false;

        do
        {
            System.out.println("-------------------------------\nWas moechten sie tun: \n1. Einzahlen \n2. Abheben \n3. Kontostand \n4. Beenden");
            selection = scanner.nextInt();

            switch (selection) {
                case 1: //Einzahlen
                    System.out.println("Wie viel Geld wollen Sie einzahlen?");
                    deposit = scanner.nextFloat();
                    balance += deposit;
                    break;

                case 2: //Abheben
                    System.out.println("Wie viel Geld wollen Sie abheben?");
                    withdraw = scanner.nextFloat();
                    balance -= withdraw;
                    break;

                case 3: //Kontostand
                    System.out.println("-------------------------------\nDies ist Ihr Kontosand:" + balance + "€");
                    break;

                case 4: //Beenden
                    stop = true;
                    break;

                default:
                    System.out.println("Sie muessen eine Zahl von 1 bis 4 eingeben!!!");
            }
        }while(stop == false);


        //Ende
        scanner.close();
    }
}