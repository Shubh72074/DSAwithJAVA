package com.Problems;

public class firstOccurrenceStrIndex {
    public static void main(String[] args) {
        String txt1 = "leetcode";
        String txt2 = "de";

        System.out.println(indexOfOccurrence(txt1,txt2));
    }

    static int indexOfOccurrence(String text1, String text2) {
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == text2.charAt(0)){
                int to = i + text2.length();
               String cmpStr = text1.substring(i,to);
               if (cmpStr.equals(text2)) return i;
            }
        }
        return -1;
    }
}
