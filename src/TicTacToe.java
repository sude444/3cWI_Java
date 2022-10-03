import java.util.Scanner;


public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TikTacToe\n****************************");

        System.out.println("Player 1, what is your name?");
        String Player1 = scanner.nextLine();
        System.out.println("Player 2, what is your name?");
        String Player2 = scanner.nextLine();

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = '-';
            }
        }

        drawBoard(board);
        boolean isPlayer1 = true;
        char symbol = ' ';
        int tea = 0;

        while (tea < 10)
        {
            if (isPlayer1) {
                symbol = 'x';
            } else {
                symbol = 'o';
            }

            if(isPlayer1)
            {
                System.out.println("****************************\nit's " + Player1 + "'s turn. (x)");
            }
            else
            {
                System.out.println("****************************\nIt's " + Player2 + "'s turn. (o)");
            }


            int row = 0;
            int column = 0;

            System.out.println("Enter a row ( 0, 1, 2 ) ");
            row = scanner.nextInt();
            System.out.println("Enter a column ( 0, 1, 2 ) ");
            column = scanner.nextInt();

            if (row < 0 || column < 0 || row > 3 || column > 3)
            {
                System.out.println("That ain't possible!!");
            } else if (board[row][column] != '-')
            {
                System.out.println("!!!This field is already full!!!");

            } else
            {

            }
            tea++;


            board[row][column] = symbol;
            drawBoard(board);

            if(isPlayer1)
            {
                isPlayer1 = false;
            }
            else
            {
                isPlayer1 = true;
            }

        }
    }

    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }


    }

}