package JavaProgrammingPractice;

//Palindrome Checker: Create a Java program that checks
// if a given string is a palindrome (reads the same backward as forward).
// This enhances understanding of strings, loops, and conditional statements.

import java.util.Locale;

public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "Kayak";
        System.out.println("The given word " + word.toLowerCase(Locale.ROOT) + " is " + isWordPalindrome(word) + " palindrome.");

    }

    public static boolean isWordPalindrome(String word) {
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.toCharArray()[i];
            if (word.equalsIgnoreCase(reversedString)) {
                return true;
            }
        }
        return false;
    }
}
