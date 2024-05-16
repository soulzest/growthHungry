package Algorithms;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println("fibonacciIterative(6) = " + fibonacciIterative(3));
    }
    public static int fibonacciIterative(int n){
        int[] fib = new int[n+1]; //0(N)

        //fib[0] = 0;
        fib[1]=1;

        for(int i =2; i<= n; i++){ // 0(N)
            fib[i] = fib[i-1] + fib[i-2]; //0(1)
        }

        return fib[n];

        //Time: 0(N)
        //Space: 0(N)
    }
}
