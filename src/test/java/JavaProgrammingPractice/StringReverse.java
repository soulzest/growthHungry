package JavaProgrammingPractice;

//String Reverser: Write a program that takes a string
// input and prints its reverse. This task will help in
// understanding strings and loops.

public class StringReverse {
    public static void main(String[] args) {
        String word = "Saya";
        System.out.println("Reversed String of " + word + " is " + reversedString(word));
    }

    public static String reversedString(String word) {
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.toCharArray()[i];
        }
        return reversedString;
    }
}
