package Algorithms;

import java.util.Scanner;

public class BinaryStringsWithoutOnes {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();

        System.out.println(withoutTwo(5));

        SCANNER.close();

    }

    public static int withoutTwo(int n){
        int[] dp = new int[n+1]; //0(N)

        dp[0] = 1; //empty string is a valid binary string
        dp[1] = 2;
        dp[2] = 3;

        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];

        }
        ///...
        /// Time: 0(N)
        ///Space: 0(N) -> Can be optimized to 0(1)
        return dp[n];
    }

}
