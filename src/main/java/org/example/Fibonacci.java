package org.example;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(iterative(6));
        System.out.println(recursive(6));
        System.out.println(dynamicPrograming(6));
    }

    // Time complexity -> O(n)
    // Space complexity -> O(1)
    public static long iterative(int n) {
        if (n <= 1)
            return n;

        long prev = 0;
        long curr = 1;
        for (int i = 2; i <= n; i++) {
            long temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }

    // Time complexity -> O(2^n)
    // Space complexity -> O(n)
    public static long recursive(int n) {
        if (n <= 1)
            return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    // Time complexity -> O(n)
    // Space complexity -> O(n)
    public static long dynamicPrograming(int n) {
        if (n <= 1)
            return n;

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        return fib[n];
    }
}