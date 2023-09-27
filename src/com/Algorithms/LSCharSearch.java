package com.Algorithms;

public class LSCharSearch {
    public static void main(String[] args) {
        String str = "Shubham";
        char tch = 'S';
        System.out.println(search(str, tch));
    }

    static boolean search(String str, char tch) {
        for (char ch:str.toCharArray()) {
            if (ch == tch) return true;
        }
        return false;
    }
}
