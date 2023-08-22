package com.Problems;

public class ExcelSheetTitle {
    public static void main(String[] args) {
        int cnum = 701;
        System.out.println(ColumnTitle(cnum));
    }
    static String ColumnTitle(int columnN) {
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        String ans = "";

        while (columnN > 0) {
            int idx = columnN % 26;
            if (idx == 0) {
                String temp = ans;
                ans = String.valueOf(letters[25]);
                ans += temp;
            }
            else {
                String temp = ans;
                ans = String.valueOf(letters[idx - 1]);
                ans += temp;
            }
            columnN /= 26;
        }
        return ans;
    }
}
