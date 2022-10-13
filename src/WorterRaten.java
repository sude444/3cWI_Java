import java.util.Scanner;
import java.util.Random;

public class WorterRaten
{

    public static void main(String[] args)
    {
        String guesses = random.nextLine();
        int attempts = 10;
        int wordLength;
        boolean solved;
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();




        for(int i = 1; i <= 20; i++)
            System.out.print("\n");


        Scanner userLetter = new Scanner(System.in);
        String letter;

        System.out.print("Word to guess: ");
        for (int i = 0; i < guesses.length(); i++)
        {
            System.out.print("_");
        }

        while (attempts <= 10 && attempts > 0)
        {
            System.out.println("\nAttempts left: " + attempts);
            System.out.print("Enter letter: ");

            attempts--;
        }

        System.out.println("\n---------------------------");
        System.out.println("Sorry you didn't find the mystery word!");
        System.out.println("It was \"" + guesses + "\"");

    }

}


