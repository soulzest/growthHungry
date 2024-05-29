package JavaProgrammingPractice;

import java.util.Random;
import java.util.Scanner;

//Number Guessing Game: Develop a simple game where the program
// randomly selects a number, and the user has to guess it.
// Provide hints like "too high" or "too low." This will
// teach control structures (if-else statements) and the use of random
// number generation.
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);
        System.out.println("Guess the number between 1 till 100, first try: ");
        int guestedNumber = SCANNER.nextInt();
        compare2numbers(randomNum, guestedNumber);
        if (randomNum != guestedNumber) {
            System.out.println("Guess the number between 1 till 100, second try: ");
            guestedNumber = SCANNER.nextInt();
            compare2numbers(randomNum, guestedNumber);
        }
        if (randomNum != guestedNumber) {
            System.out.println("Guess the number between 1 till 100, last try: ");
            guestedNumber = SCANNER.nextInt();
            compare2numbers(randomNum, guestedNumber);
        }
    }

    public static void compare2numbers(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("The number is too low");
        } else if (num1 < num2) {
            System.out.println("The number is too high");
        } else {
            System.out.println("Your guess is correct");
        }
    }
}
