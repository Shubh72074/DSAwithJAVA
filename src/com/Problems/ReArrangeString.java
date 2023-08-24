package com.Problems;

public class ReArrangeString {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(reArrange(s));
    }
    static String reArrange(String s) {
        if (s.length() == 1) return s;
        char[] arr = s.toCharArray();
        int cur = 0;
        int next = 1;
        int len = s.length();
        while (next < len) {
            if (arr[cur] == arr[next]) {
                if (!swapped(next,len,next,arr)) return "";
            }
            cur++;
            next++;
        }
        StringBuilder ans = new StringBuilder();
        for (char ch: arr) ans.append(ch);
        return ans.toString();
    }
    static boolean swapped(int temp, int len, int next, char[] arr) {
        while (temp < len) {
            if (arr[next] != arr[temp]) {
                return swap(arr,next,temp);
            }
            temp++;
        }
        return false;
    }
    static boolean swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return true;
    }
}
