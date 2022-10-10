import java.util.Scanner;
import java.util.Random;

public class WorterRaten {

    public static void main(String[] args)
    {
        String guesses[] = {
                "katze", "java", "hangman", "fortnite" };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playing = true;
        boolean wordGuessed = false;
        int tries = 0;
        int randomNumber = random.nextInt(guesses.length); //random.nextInt(10);
        char randomWordToGuess[] = guesses[randomNumber].toCharArray(); // java -> j,a,v,a
        int ammountOfGuesses = randomWordToGuess.length; //total tries to guess a word.
        char playerGuess[] = new char[ammountOfGuesses]; // "_ _ _ _ _ _ _ _"


        while(playing)
        {
            System.out.println("Welcome to Hangman!");
            randomNumber = random.nextInt(guesses.length); //random.nextInt(10);
            randomWordToGuess = guesses[randomNumber].toCharArray(); // java -> j,a,v,a
            ammountOfGuesses = randomWordToGuess.length; //total tries to guess a word.
            playerGuess = new char[ammountOfGuesses]; // "_ _ _ _ _ _ _ _"

            for(int i = 0; i < randomWordToGuess.length; i++)
            {
                playerGuess[i] = '_';
            }

            while(!wordGuessed && tries != ammountOfGuesses)
            {
                System.out.println("Current guesses: " + playerGuess);

                System.out.println("You have " + ammountOfGuesses +" ammount of guesses left. \n");
            }


        }



    }

}
