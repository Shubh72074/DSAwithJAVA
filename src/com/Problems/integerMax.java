package com.Problems;

public class integerMax {
    public static void main(String[] args) {
        int a = 1534236469;
        long ans = 0;
        while (a != 0) {
            int rem = a % 10;
            ans = ans * 10 + rem;
            a /= 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            System.out.println(0);
        }
        else {
            System.out.println(ans);
        }
    }
}
