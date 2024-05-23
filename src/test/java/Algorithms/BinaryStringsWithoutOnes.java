package Algorithms;

import java.util.Scanner;

public class BinaryStringsWithoutOnes {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();

        System.out.println(withoutTwo(n));
        System.out.println(withoutThree(n));

        SCANNER.close();

    }

    public static int withoutTwo(int n) {
        int[] dp = new int[n + 1]; //0(N)

        dp[0] = 1; //empty string is a valid binary string
        dp[1] = 2;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
        ///...
        /// Time: 0(N)
        ///Space: 0(N) -> Can be optimized to 0(1)
        return dp[n];
    }

    public static int withoutThree(int n) {
        int[] dp = new int[n + 1]; //0(N)

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        dp[3] = 7;
        for (int i = 4; i <= n; i++) {  //0(N)
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            //Time: 0(N)
            //Space: 0(N)

        }
        return dp[n];
    }

    public static int withoutK(int n) {
        int k = SCANNER.nextInt();

        int[] dp = new int[n + 1];

        dp[0] = 1; //empty string is a valid binary string

        for (int i = 1; i <= k; i++) { //0(K)
            if (i < k) {
                dp[i] = 1 << i; //2^i-1
            } else { //i==k
                dp[i] = (1 << i) - 1; //2^i - 1
            }
        }

        for (int i = k + 1; i <= n; i++) { //0(N)
            for (int j = 1; j <= k; j++) {
                dp[i] += dp[i - j];
            }
        }
        //0(NK)
        return dp[n];
    }

    public static int withoutOptimized(int n) {
        int k = SCANNER.nextInt();

        int[] dp = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= k; i++) {
            if (i < k) {
                //2^i
                dp[i] = 1 << i;
            } else { //i==k
                //2^i - 1
                dp[i] = (1<<i) - 1;
            }
        }
        //dp[i-1] =       dp[i-2]+...+dp[i-k+1]+dp[i-k]+dp[i-k-1]
        //dp[i] = dp[i-1]+dp[i+2]+.. +dp[i-k+1]+dp[i-k]
        //So
        //dp[i] = dp[i-1]+           dp[i-1]           -dp[i-k-1]

        for(int i=k+1; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-1]-dp[i-k-1];

        }
        return dp[n];
    }
}
