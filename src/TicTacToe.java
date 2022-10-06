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
        int count = 0;

        while (true)
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
                System.out.println("That isn't possible!!");
            } else if (board[row][column] != '-')
            {
                System.out.println("!!!This field is already full!!!");

            }
            else
            {

            }

            board[row][column] = symbol;
            drawBoard(board);

            if(hasWon(board) == 'x')
            {
                System.out.println(Player1 + " has won!!!");
            }
            else if(hasWon(board) == 'o')
            {
                System.out.println(Player2 + " has won!!!");
            }
            else
            {
                //nobody won
            }

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

    public static void drawBoard(char[][] board)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static char hasWon (char[][] board)
    {
       //Row
      for (int i = 0; i < 3; i++)
      {
            if(board[i][0] == board[1][1] && board[i][1] == board[i][2] && board[i][0] != '-')
            {
                return board[i][0];
            }
      }

      //col
      for(int j = 0; j < 3; j++)
      {
        if(board[j][0] == board[1][1] && board[j][1] == board[j][2] && board[j][0] != '-')
        {
            return board[0][j];
        }
      }

      //diag
      if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-')
      {
          return board[0][0];
      }
      if(board[2][0] == board[1][1] && board[1][1] == board[2][2] && board[2][0] !='-')
      {
          return board[2][0];
      }

      return '-';


    }



}