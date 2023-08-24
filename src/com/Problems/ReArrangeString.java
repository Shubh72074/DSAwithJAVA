package com.Problems;

import java.util.HashMap;

public class ReArrangeString {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(reArrange(s));
    }
    static String reArrange(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch: s.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch,charCount.get(ch) + 1);
            }
            else {
                charCount.put(ch,1);
            }
        }
        System.out.println(charCount);
        return "ALOO";
    }
}
