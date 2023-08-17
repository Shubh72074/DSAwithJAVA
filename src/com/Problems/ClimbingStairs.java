package com.Problems;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climb(n));
    }
    static int climb(int x) {
        int first = 0;
        int second = 1;
        int steps = 0;
        while (x > 0) {
            steps = first + second;
            first = second;
            second = steps;
            x--;
        }
        return steps;
    }
}
