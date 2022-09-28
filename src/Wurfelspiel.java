import java.util.Random;
import java.util.Scanner;


public class Wurfelspiel
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wurfel = 0;

        wurfel = scanner.nextInt();
        for(int i = 0; i < 100; i++)
        {
            wurfel = random.nextInt(1, 6);
        }

    }
}
