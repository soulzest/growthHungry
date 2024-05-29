package JavaProgrammingPractice;

//Factorial Calculator: Implement a program that calculates
// the factorial of a given number. This can be done using both
// iteration (loops) and recursion, providing insight into different
// approaches to problem-solving.

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial calculator of " + number + " is " + factorialCalculator(number));
        //5*4*3*2*1
    }

    public static int factorialCalculator(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
