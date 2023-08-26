package com.Problems;

public class RecursiveNumPrint {
    public static void main(String[] args) {
        int n = 10;
        rnum(n);
    }
    static int rnum(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        }
        return rnum(n-1);
    }
}
