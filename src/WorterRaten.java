import java.util.Scanner;
import java.util.Random;

public class WorterRaten {

    public static void main(String[] args) {
        String[] word = {"katze", "java", "programmieren"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playing = true;
        while (playing) {
            System.out.println("Lets Start Playing Hangman ver 0.1");
            int randomNumber = random.nextInt(word.length);
            char WordToGuess[] = word[randomNumber].toCharArray();
            int ammountOfGuesses = WordToGuess.length;
            char playerGuess[] = new char[ammountOfGuesses];

            for (int i = 0; i < playerGuess.length; i++) {
                playerGuess[i] = '_';
            }

            boolean wordIsGuessed = false;
            int tries = 0;

            while (!wordIsGuessed && tries != ammountOfGuesses) {
                System.out.println("Current Guesses: ");
                System.out.println(playerGuess);
                System.out.printf("You have %d ammount of tries left.\n", ammountOfGuesses - tries);
                System.out.println("Enter a single character: ");
                char input = scanner.nextLine().charAt(0);
                tries++;

                if (input == '-') {
                    wordIsGuessed = true;
                    playing = false;
                } else {
                    for (int i = 0; i < WordToGuess.length; i++) {
                        if (WordToGuess[i] == input) {
                            playerGuess[i] = input;
                        }
                    }
                    if(wordIsGuessed){
                        wordIsGuessed = true;
                        System.out.println("Congratulations");
                    }
                }
            }
        }
    }
}






