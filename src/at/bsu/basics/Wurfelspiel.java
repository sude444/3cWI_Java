package at.bsu.basics;

import java.util.Random;
import java.util.Scanner;


public class Wurfelspiel
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dice = 0;
        int diceTotal1 = 0;
        int diceTotal2 = 0;

        //User
        System.out.println();
        System.out.print("You:\n--------------------");
        for(int i = 0; i < 6; i++)
        {
            scanner.nextLine();
            dice = random.nextInt(1, 7);
            System.out.print(dice);
            diceTotal1 = diceTotal1 + dice;
        }


        //Computer
        scanner.nextLine();
        System.out.println("\nComputer:\n--------------------");
        for(int i = 0; i < 6; i++)
        {
            dice = random.nextInt(1, 7);
            System.out.print(dice + ", ");
            diceTotal2 = diceTotal2 + dice;
        }

        //result
        scanner.nextLine();
        System.out.println("\nUser dice total: \n--------------------\n" + diceTotal1);
        System.out.println("\nComputer dice total: \n--------------------\n" + diceTotal2);

        if(diceTotal1 < diceTotal2)
        {
            System.out.println("\nWinner:\n--------------------\nComputer won!!");
        }
        else
        {
            System.out.println("\nWinner:\n--------------------\nUser won!!");
        }
    }
}
