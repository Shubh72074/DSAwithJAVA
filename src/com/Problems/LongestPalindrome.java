package com.Problems;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "";
        System.out.println(findAns(s));
    }
    static String findAns(String s) {
        String ans = "";
        for (int i = s.length(); i >= 1; i--) {
            String tempAns = "";
            int start = 0;
            int end = start + i;
            while (end <= s.length()) {
                if (s.charAt(start) == s.charAt(end-1)) {
                    tempAns = s.substring(start,end);
                    break;
                }
                start++;
                end = start + i;
            }
            if (tempAns.length() > ans.length()) {
                ans = tempAns;
            }
        }
        return ans;
    }
}
