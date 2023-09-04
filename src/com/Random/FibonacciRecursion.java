package com.Random;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(printFibonacci(8));
    }
    static int printFibonacci(int n) {
        if (n<2) return n;
        return printFibonacci(n-1) + printFibonacci(n-2);
    }
}
