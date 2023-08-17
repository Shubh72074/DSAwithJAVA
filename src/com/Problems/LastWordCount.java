package com.Problems;

public class LastWordCount {
    public static void main(String[] args) {
        String str = "  Hel dk ' dsf dsfsd    ";
        System.out.println(countWords(str));
    }
    static int countWords(String str) {
//        String[] arr = str.trim().split(" ");
//        int ans = arr[arr.length-1].length();
//        return ans;

        String tst = str.trim();
        int length = (tst.length() - tst.lastIndexOf(" ")) - 1;
        return length;
    }
}
