package Algorithms;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class fibonacciRecursiveOption {
    public static void main(String[] args) {
        fibonacciRecursive(2, new int[]{2});
    }

    public static int fibonacciRecursive(int n, int[] cache) {
        if (n == 0 || n == 1) { //base case
            return n; //0(1)
        }
        if (cache[n] != 0) { //if result was already computed
            return cache[n]; // return it immediately
        }

        //T(0) = 1
        //T(1) = 1
        //T(N) = 0(1)

        //otherwise, compute it
        cache[n] = fibonacciRecursive(n - 1, cache) + fibonacciRecursive(n - 2, cache);

        return cache[n];
    }
}
