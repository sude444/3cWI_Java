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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        drawBoard(board);

        boolean isPlayer1 = true;

        char symbol = ' ';
        if (isPlayer1) {
            symbol = 'x';
        } else {
            symbol = 'o';
        }

        while (true) {
            System.out.println("Enter a row ( 1, 2, 3 ) ");
            int row = scanner.nextInt();
            System.out.println("Enter a column ( 1, 2, 3 ) ");
            int column = scanner.nextInt();

            if (row < 0 || column < 0 || row > 3 || column > 3) {
                System.out.println("That ain't possible!!");
            } else if (board[row][column] != '-') {
                System.out.println("This field is already full!!");
            } else {

            }

        }
    }

    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }


    }

}