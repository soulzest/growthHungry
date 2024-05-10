package Algorithms;

import java.util.Scanner;

public class Factorial {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args){
        int n = SCANNER.nextInt();

        System.out.println(factorial(n));

        SCANNER.close();
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int subproblem = factorial(n-1);
        int answer = n * subproblem; // 0(1)

        //T(0) = 1
        //T(N) = T(N-1) + 1

        //Time: T(N) = 0(N)
        //Space: 0(N) due to call stack
        return answer;
    }
}
