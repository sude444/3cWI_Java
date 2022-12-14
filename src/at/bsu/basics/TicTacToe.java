package at.bsu.basics;

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
        int count = 0;
        boolean gameFinished = false;
        boolean playerSwitch = false;

        while (gameFinished == false) {

            if (isPlayer1) {
                symbol = 'x';
            } else {
                symbol = 'o';
            }

            if (isPlayer1) {
                System.out.println("*********************************\nit's " + Player1 + "'s turn. (x)");
            } else {
                System.out.println("*********************************\nIt's " + Player2 + "'s turn. (o)");
            }

            int row = 0;
            int column = 0;

            System.out.println("*********************************\nEnter a row ( 0, 1, 2 ) ");
            row = scanner.nextInt();
            System.out.println("Enter a column ( 0, 1, 2 ) ");
            column = scanner.nextInt();

            if (row < 0 || column < 0 || row > 3 || column > 3) {
                System.out.println("*********************************\nThat isn't possible!!\n*********************************");
                playerSwitch = true;
            } else if (board[row][column] != '-') {
                System.out.println("*********************************\n!!! This field is already full !!!");
                playerSwitch = true;
            } else {
                playerSwitch = false;
                board[row][column] = symbol;
                drawBoard(board);
                if (isPlayer1) {
                    isPlayer1 = false;
                } else {
                    isPlayer1 = true;
                }
            }



            if (hasWon(board) == 'x') {
                System.out.println("*********************************\n" + Player1 + " won!!!");
                gameFinished = true;
            } else if (hasWon(board) == 'o') {
                System.out.println("*********************************\n" + Player2 + " won!!!");
                gameFinished = true;
            } else {
                //nobody won
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

    public static char hasWon(char[][] board) {
        //Row
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != '-') {
                return board[row][0];
            }
        }

        //col
        for (int column = 0; column < 3; column++) {
            if (board[0][column] == board[1][column] && board[1][column] == board[2][column] && board[column][0] != '-') {
                return board[0][column];
            }
        }

        //diag
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[2][2] && board[2][0] != '-') {
            return board[2][0];
        }

        return '-';


    }


}