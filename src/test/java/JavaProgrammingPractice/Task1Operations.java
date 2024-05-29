package JavaProgrammingPractice;

//Basic Calculator: Create a program that takes two numbers
// as inputs and performs basic arithmetic operations
// (addition, subtraction, multiplication, division).
// This introduces the concept of variables, user input, and basic arithmetic operations.

import java.util.Scanner;

public class Task1Operations {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Put the first number:");
        int num1 = SCANNER.nextInt();
        System.out.println("Put the second number:");
        int num2 = SCANNER.nextInt();
        System.out.println("Add Two Numbers " + num1 + " and " + num2 + " = " + addTwoNumbers(num1, num2));
        System.out.println("Substract Two Numbers " + num1 + " and " + num2 + " = " + substactTwoNumbers(num1, num2));
        System.out.println("Multiply Two Numbers " + num1 + " and " + num2 + " = " + multipleTwoNumbers(num1, num2));
        System.out.println("Divide Two Numbers " + num1 + " and " + num2 + " = " + divideTwoNumbers(num1, num2));
        SCANNER.close();
    }

    public static int addTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int substactTwoNumbers(int num1, int num2) {
        int substact = num1 - num2;
        return substact;
    }

    public static int multipleTwoNumbers(int num1, int num2) {
        int sum = num1 * num2;
        return sum;
    }

    public static double divideTwoNumbers(int num1, int num2) {
        double divide = (double) num1 / (double) num2;
        return divide;

    }
}
