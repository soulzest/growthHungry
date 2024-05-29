package JavaProgrammingPractice;

//Temperature Converter: Write a program that converts
// temperature from Fahrenheit to Celsius and vice versa.
// This introduces the concept of user input and basic
// mathematical formulas in programming.

//For Celsius to Fahrenheit conversion, you can use the formula: `F = (C * 9/5) + 32`.
// For Fahrenheit to Celsius, use: `C = (F — 32) * 5/9`.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("What you want to convert?");
        String string = SCANNER.next();
        System.out.println(convertTemp(string));

    }

    public static double convertTemp(String temp) {
        double number = Double.parseDouble(temp.substring(0, temp.length()-1));
        double result = 0;
        if (temp.contains("C")) {
            result = (number * 9/5) + 32;
        }else{
            result = (number - 32) * 5/9;
        }
        return result;
    }
}
