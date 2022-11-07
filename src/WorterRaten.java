import java.util.Scanner;
import java.util.Random;

public class WorterRaten
{

    public static void main(String[] args)
    {
        String[] word = { "katze", "java", "programmieren" };
        int attempts = 10;
        String letter;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Word to guess: ");
        for (char i = 0; i < word.length; i++)
        {
            if ( )
            {

            }
        }

        while (attempts <= 10 && attempts > 0)
        {
            System.out.println("\nAttempts left: " + attempts);
            System.out.print("Enter letter: ");
            letter = scanner.nextLine();

            attempts--;
        }

        System.out.println("\n---------------------------");
        System.out.println("Sorry you didn't find the word!");
        System.out.println("It was \"" + word + "\"");
    }

    public static String longestString(String[] str)
    {
        String longest = "";
        System.out.print("Word to guess: ");
        for (int i = 0; i < str.length; i++)
        {
            System.out.print("_");
            if (str[i].length() > longest.length())
            {
                longest = str[i];

            }
        }
        return longest;
    }


}



