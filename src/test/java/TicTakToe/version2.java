package TicTakToe;

import java.util.Scanner;

public class version2 {
    static String[] board;
    static String turn;

    static void printBoard() {
        System.out.println("|---|---|---|");
        //if(num == )
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");

    }

//    static String checkWinner() {
//
//
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe");
        printBoard();

        System.out.println("X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

        }
    }
}
