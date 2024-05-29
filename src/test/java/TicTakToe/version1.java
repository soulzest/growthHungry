package TicTakToe;

import java.util.Scanner;

//2 players
public class version1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to tic tak toe game");
        gameStructure(9);
        System.out.println("Player 1 do your move by number:");
        int move1 = scanner.nextInt();
        gameStructure(2);

    }

    public static void gameStructure(int num) {
        System.out.println("|---|---|---|");
        //if(num == )
        System.out.println("| " + (num - 8) + " | " + (num - 7) + " | " + (num - 6) + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + (num - 5) + " | " + (num - 4) + " | " + (num - 3) + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + (num - 2) + " | " + (num - 1) + " | " + num + " |");
        System.out.println("|---|---|---|");
    }
}
