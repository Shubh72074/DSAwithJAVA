package com.Problems;

public class StringToInteger {
    public static void main(String[] args) {
        String nn = "765";
        long ans = 0;
        boolean neg = false;
        String[] n;
        n = nn.trim().split(" ");
        for (char ch : n[0].toCharArray()) {
            if (ch == '-') {
                neg = true;
            }
            if((int)ch >= 48 && (int)ch <= 57) {
                int tm = Integer.parseInt(String.valueOf(ch));
                ans = ans * 10 + tm;
            }
        }
        if (neg) {
            System.out.println(ans * -1);
        }
        else {
            System.out.println(ans);
        }
    }
}
